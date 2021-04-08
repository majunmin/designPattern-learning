package com.mjm.design.wallet.ddd;

import com.mjm.design.wallet.NoSufficientBalanceException;
import com.mjm.design.wallet.TransactionType;
import com.mjm.design.wallet.Transactional;
import com.mjm.design.wallet.VirtualWalletBo;
import com.mjm.design.wallet.VirtualWalletEntity;
import com.mjm.design.wallet.VirtualWalletRepository;
import com.mjm.design.wallet.VirtualWalletTransactionEntity;
import com.mjm.design.wallet.VirtualWalletTransactionRepository;

import java.math.BigDecimal;
import java.time.Instant;

/**
 * 一句话功能简述 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-03-30 16:52
 * @since
 */
public class VirtualWalletService {

    // 通过构造函数或者IOC框架注入
    private VirtualWalletRepository walletRepo;
    private VirtualWalletTransactionRepository transactionRepo;


    @Transactional
    public void debit(Long walletId, BigDecimal amount) throws NoSufficientBalanceException {
        VirtualWalletEntity walletEntity = walletRepo.getWalletEntity(walletId);
        VirtualWallet virtualWallet = convert(walletEntity);

        virtualWallet.debit(amount);
        VirtualWalletTransactionEntity transactionEntity = new VirtualWalletTransactionEntity();
        transactionEntity.setAmount(amount);
        transactionEntity.setCreateTime(System.currentTimeMillis());
        transactionEntity.setType(TransactionType.DEBIT);
        transactionEntity.setFromWalletId(walletId);
        transactionRepo.saveTransaction(transactionEntity);
        walletRepo.updateBalance(walletId, virtualWallet.balance());
    }

    @Transactional
    public void credit(Long walletId, BigDecimal amount) {
        VirtualWalletTransactionEntity transactionEntity = new VirtualWalletTransactionEntity();
        transactionEntity.setAmount(amount);
        transactionEntity.setCreateTime(Instant.now().toEpochMilli());
        transactionEntity.setType(TransactionType.CREDIT);
        transactionEntity.setFromWalletId(walletId);
        transactionRepo.saveTransaction(transactionEntity);


        VirtualWalletEntity walletEntity = walletRepo.getWalletEntity(walletId);
        VirtualWallet virtualWallet = convert(walletEntity);
        virtualWallet.credit(amount);
        walletRepo.updateBalance(walletId, virtualWallet.getBalance());

    }

    @Transactional
    public void transfer(Long fromWalletId, Long toWalletId, BigDecimal amount) throws NoSufficientBalanceException {
        VirtualWalletTransactionEntity transactionEntity = new VirtualWalletTransactionEntity();
        transactionEntity.setAmount(amount);
        transactionEntity.setCreateTime(System.currentTimeMillis());
        transactionEntity.setType(TransactionType.TRANSFER);
        transactionEntity.setFromWalletId(fromWalletId);
        transactionEntity.setToWalletId(toWalletId);
        transactionRepo.saveTransaction(transactionEntity);

        debit(fromWalletId, amount);
        credit(toWalletId, amount);
    }

    private VirtualWallet convert(VirtualWalletEntity walletEntity) {
        return null;
    }
}

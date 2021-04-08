package com.mjm.design.wallet;

/**
 * 一句话功能简述 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-03-30 16:08
 * @since
 */
public interface VirtualWalletTransactionRepository {
    void saveTransaction(VirtualWalletTransactionEntity transactionEntity);
}

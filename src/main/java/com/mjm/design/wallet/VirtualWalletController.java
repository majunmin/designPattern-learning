package com.mjm.design.wallet;

import java.math.BigDecimal;

/**
 * 入账 出账 查询余额  转账
 *
 * @author majunmin
 * @description
 * @datetime 2021-03-30 16:02
 * @since
 */
public class VirtualWalletController {

    // 依赖注入
    private final VirtualWalletService virtualWalletService;

    public VirtualWalletController(VirtualWalletService virtualWalletService) {
        this.virtualWalletService = virtualWalletService;
    }

    //查询余额
    public BigDecimal getBalance(Long walletId) {
        return null;
    }


    //出账
    public void debit(Long walletId, BigDecimal amount) {

    }

    // 入账
    public void credit(Long walletId, BigDecimal amount) {

    }

    // 转账
    public void transfer(Long fromWalletId, Long toWalletId, BigDecimal amount) {

    }
    // 省略查询transaction的接口


}

package com.mjm.design.wallet;

import java.math.BigDecimal;

/**
 * 一句话功能简述 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-03-30 16:08
 * @since
 */
public interface VirtualWalletRepository {
    void updateBalance(Long walletId, BigDecimal subtract);

    VirtualWalletEntity getWalletEntity(Long walletId);

    BigDecimal getBalance(Long walletId);
}

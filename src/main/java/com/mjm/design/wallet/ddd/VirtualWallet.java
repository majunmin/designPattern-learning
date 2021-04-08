package com.mjm.design.wallet.ddd;

import lombok.Getter;

import java.math.BigDecimal;
import java.time.Instant;

/**
 * 一句话功能简述 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-03-30 16:47
 * @since
 */
@Getter
public class VirtualWallet {

    private Long id;
    private BigDecimal balance = BigDecimal.ZERO;
    private Long createTime = Instant.now().toEpochMilli();

    public VirtualWallet(Long preAllocatedId) {
        this.id = preAllocatedId;
    }

    public BigDecimal balance() {
        return this.balance;
    }

    public void debit(BigDecimal amount){
        if (BigDecimal.ZERO.compareTo(amount) > 0){
            throw new IllegalArgumentException();
        }
        this.balance.subtract(amount);
    }

    public void credit(BigDecimal amount){
        if (BigDecimal.ZERO.compareTo(amount) > 0){
            throw new IllegalArgumentException();
        }
        this.balance.add(amount);
    }

}

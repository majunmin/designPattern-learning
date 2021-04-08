package com.mjm.principle.encapsulation;

import lombok.Getter;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
public class Wallet {

    private String id;
    private long createTime;
    private BigDecimal balance;
    private long balanceLastModifiedTime;
    // ...省略其他属性...

    public void increaseBalance(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("...");
        }
        this.balance.add(amount);
        this.balanceLastModifiedTime = Instant.now().toEpochMilli();
    }

    public void decreaseBalance(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("...");
        }
        if (amount.compareTo(balance) > 0) {
            throw new IllegalArgumentException("...");
        }
        this.balance.subtract(amount);
        this.balanceLastModifiedTime = Instant.now().toEpochMilli();
    }
}

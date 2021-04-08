package com.mjm.design.wallet;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 一句话功能简述 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-03-30 16:09
 * @since
 */
@Data
public class VirtualWalletEntity {
    private Long id;
    private BigDecimal balance;
}

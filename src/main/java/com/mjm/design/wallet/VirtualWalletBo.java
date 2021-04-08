package com.mjm.design.wallet;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 一句话功能简述 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-03-30 16:05
 * @since
 */
@Data
public class VirtualWalletBo {

    private Long id;
    private Long createTime;
    private BigDecimal balance;
}

package com.mjm.design.monitor;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 一句话功能简述 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-03-29 21:00
 * @since
 */
@Data
@AllArgsConstructor
public class RequestInfo {

    private String apiName;
    private Double responseTime;
    private Long timestamp;
}

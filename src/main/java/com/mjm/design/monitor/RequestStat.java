package com.mjm.design.monitor;

import lombok.Data;

/**
 * 数据统计信息 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-03-29 20:58
 * @since
 */
@Data
public class RequestStat {
    private double maxResponseTime;
    private double minResponseTime;
    private double avgResponseTime;
    private double p999ResponseTime;
    private double p99ResponseTime;
    private long count;
    private long tps; //...省略getter/setter方法...
}
package com.mjm.design.monitor;

import com.alibaba.fastjson.JSON;
import sun.misc.Request;

import java.time.Instant;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 一句话功能简述 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-03-29 22:34
 * @since
 */
public class ConsoleReporter {

    private MetricsStorage metricsStorage;
    private ScheduledExecutorService executorService;

    public ConsoleReporter(MetricsStorage metricsStorage, ScheduledExecutorService executorService) {
        this.metricsStorage = metricsStorage;
        this.executorService = executorService;
    }

    public void startRepeatedReport(long periodInSeconds, long durationInSeconds) {
        executorService.scheduleAtFixedRate(() -> {
            long endTimeInMillis = Instant.now().toEpochMilli();
            long durationInMills = durationInSeconds * 1000;
            long startTimeInMillis = endTimeInMillis - durationInMills;
            Map<String, List<RequestInfo>> requestInfos = metricsStorage.getRequestInfos(startTimeInMillis, endTimeInMillis);

            Map<String, RequestStat> stats = new HashMap<>();
            for (Map.Entry<String, List<RequestInfo>> entry : requestInfos.entrySet()) {
                String apiName = entry.getKey();
                List<RequestInfo> requestInfosPerApi = entry.getValue(); // 第2个代码逻辑：根据原始数据，计算得到统计数据；
                RequestStat requestStat = Aggregator.aggregate(requestInfosPerApi, durationInMills);
                stats.put(apiName, requestStat);
            } // 第3个代码逻辑：将统计数据显示到终端（命令行或邮件）；
            System.out.println("Time Span: [" + startTimeInMillis + ", " + endTimeInMillis + "]");
            System.out.println(JSON.toJSONString(stats));

        }, durationInSeconds, periodInSeconds, TimeUnit.SECONDS);
    }
}

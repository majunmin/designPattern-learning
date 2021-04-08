package com.mjm.design.monitor;

import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 * 一句话功能简述 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-03-29 22:49
 * @since
 */
public class Client {

    public static void main(String[] args) {
        MetricsStorage storage = new RedisMetricsStorage();
        ConsoleReporter consoleReporter = new ConsoleReporter(storage, new ScheduledThreadPoolExecutor(1));
        consoleReporter.startRepeatedReport(60, 60);

        EmailReporter emailReporter = new EmailReporter(storage);
        emailReporter.addToAddress("wangzheng@xzg.com");
        emailReporter.startDailyReport();

        MetricsCollector collector = new MetricsCollector(storage);
        collector.recordRequest(new RequestInfo("register", 123d, 10234L));
        collector.recordRequest(new RequestInfo("register", 223d, 11234L));
        collector.recordRequest(new RequestInfo("register", 323d, 12334L));
        collector.recordRequest(new RequestInfo("login", 23d, 12434L));
        collector.recordRequest(new RequestInfo("login", 1223d, 14234L));
        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

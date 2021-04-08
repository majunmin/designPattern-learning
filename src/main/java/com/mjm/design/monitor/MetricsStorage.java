package com.mjm.design.monitor;


import java.util.List;
import java.util.Map;

/**
 * 一句话功能简述 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-03-29 20:59
 * @since
 */
public interface MetricsStorage {

    void saveRequestInfo(RequestInfo requestInfo);

    List<RequestInfo> getRequestInfo(long startTimestamp, long endTimestamp);

    Map<String, List<RequestInfo>> getRequestInfos(long startTimestamp, long endTimestamp);
}

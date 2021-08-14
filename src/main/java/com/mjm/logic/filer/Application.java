package com.mjm.logic.filer;

import java.util.ArrayList;
import java.util.List;

/**
 * Client </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-08-14 11:15
 * @since
 */
public class Application {

    // filters.add(new AuthencationFilter());
    // filters.add(new RateLimitFilter());
    List<Filter> filters = new ArrayList<>();

    public void handleRequest(RpcRequest rpcRequest) {
        // extend  process
        for (Filter filter : filters) {
            try {
                filter.doFilter(rpcRequest);
            } catch (Exception exception) {
                //过滤结果处理
            }
            // extend  process
        }
        // process

    }

    public static void main(String[] args) {

    }
}

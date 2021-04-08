package com.mjm.application.future;

/**
 * 一句话功能简述 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-04-06 14:54
 * @since
 */
public interface FutureService<IN, OUT> {

    Future<?> submit(Runnable r);

    // 提交一个有返回值的 计算任务
    Future<OUT> submit(Task<IN, OUT> task, IN input);
}

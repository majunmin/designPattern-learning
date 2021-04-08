package com.mjm.application.future;

import org.apache.commons.lang3.concurrent.BasicThreadFactory;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 提交并执行任务 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-04-06 15:09
 * @since
 */
public class FutureServiceImpl<IN, OUT> implements FutureService<IN, OUT> {

    ExecutorService threadPool = new ThreadPoolExecutor(1, 10, 5, TimeUnit.SECONDS,
            new ArrayBlockingQueue<>(100),
            new BasicThreadFactory.Builder().namingPattern("FUTURE-%d").build(),
            new ThreadPoolExecutor.CallerRunsPolicy());

    @Override
    public Future<?> submit(Runnable r) {
        FutureTask<?> futureTask = new FutureTask<>();
        threadPool.submit(() ->{
            r.run();
            futureTask.finish(null);
        });
        return futureTask;
    }

    @Override
    public Future<OUT> submit(Task<IN, OUT> task, IN input) {
        FutureTask<OUT> futureTask = new FutureTask<>();
        threadPool.submit(() ->{
            OUT out = task.get(input);
            futureTask.finish(out);
        });
        return futureTask;
    }
}

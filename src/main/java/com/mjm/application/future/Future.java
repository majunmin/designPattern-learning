package com.mjm.application.future;

public interface Future<T> {

    T get() throws InterruptedException;

    boolean isDone();

}

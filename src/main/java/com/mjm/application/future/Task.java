package com.mjm.application.future;

@FunctionalInterface
public interface Task<IN, OUT> {

    OUT get(IN input);
}

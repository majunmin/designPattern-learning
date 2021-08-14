package com.mjm.logic;

public enum Level {
    Info(1),
    Warning(2),
    Error(3);

    private Integer level;


    Level(Integer level) {
        this.level = level;
    }


    public Integer intValue() {
        return this.level;
    }
}

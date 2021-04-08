package com.mjm.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerMain {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(LoggerMain.class);
        logger.error("error: msg");
    }
}

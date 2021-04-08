package com.mjm;

import org.junit.Test;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class LoggerTest {

    @Test
    public void testDemo1Logger() {
        Logger logger = LoggerFactory.getLogger(getClass());

        logger.error("error: hello world");
    }

//    @Test
//    public void testLogBack() {
//        LoggerContext context = new LoggerContext();
//        ch.qos.logback.classic.Logger logger = context.getLogger(getClass());
//        logger.error("error: hello world");
//    }
}

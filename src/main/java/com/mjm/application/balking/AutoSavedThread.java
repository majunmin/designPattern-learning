package com.mjm.application.balking;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * 一句话功能简述 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-04-06 08:51
 * @since
 */
public class AutoSavedThread extends Thread {

    private final Document document;

    public AutoSavedThread(Document document) {
        super("DocumentAutoSavedThread");
        this.document = document;
    }

    @Override
    public void run() {
        while (true) {
            try {
                document.save();
                TimeUnit.SECONDS.sleep(1);
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

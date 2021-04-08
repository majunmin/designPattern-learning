package com.mjm.application.balking;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * 一句话功能简述 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-04-06 11:10
 * @since
 */
public class Client {

    public static void main(String[] args) throws IOException, InterruptedException {
        String documentPath = "/Users/majunmin/IdeaProjects/designPattern-learning/src/main/java/com/mjm/application/balking";
        String documentName = "temp.txt";
        Document document = Document.createDocument(documentPath, documentName);

//        new AutoSavedThread(document).run();
        new DocumentEditThread(documentPath, documentName).run();

        TimeUnit.MINUTES.sleep(5);
    }
}

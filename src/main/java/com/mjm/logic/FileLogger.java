package com.mjm.logic;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 子类 输出日志到文件</br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-08-14 11:07
 * @since
 */
public class FileLogger extends Logger {

    private FileWriter fileWriter;

    public FileLogger(String name, boolean enable, Level minPermittedLevel, String filePath) {
        super(name, enable, minPermittedLevel);

        try {
            this.fileWriter = new FileWriter(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doLog(Level level, String message) {
        // 格式化 level and message ,输出到日志
        try {
            fileWriter.write(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

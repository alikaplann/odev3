package org.example.logger;

public class FileLogger implements  BaseLog{
    @Override
    public void log(String data) {
        System.out.println("Data is logged in file  DATA:**** " + data+"****");
    }
}

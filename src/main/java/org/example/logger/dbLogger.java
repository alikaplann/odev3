package org.example.logger;

public class dbLogger implements BaseLog {
    @Override
    public void log(String data) {
        System.out.println("Data is logged in database DATA:**** " + data + "****");
    }

}

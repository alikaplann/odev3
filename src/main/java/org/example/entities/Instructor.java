package org.example.entities;

public class Instructor {
    private  String name;
    private  String comm;

    public Instructor(String name, String comm){
        this.name = name;
        this.comm = comm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComm() {
        return comm;
    }

    public void setComm(String comm) {
        this.comm = comm;
    }
}

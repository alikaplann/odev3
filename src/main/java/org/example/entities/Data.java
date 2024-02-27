package org.example.entities;

import java.util.ArrayList;
import java.util.List;

public class Data {

    List<String> courses;
    List<String> categories;
    List<String> instructories;

    public  Data(){
        this.courses = new ArrayList<>(List.of("Java", "PL/SQL", "Postman API", "React"));
    }


}

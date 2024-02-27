package org.example.service;

import org.example.entities.Category;
import org.example.entities.Course;
import org.example.entities.Instructor;

import java.util.Optional;

public interface HibernateService {


    void addCourse(Course course);
    void addCategory(Category category);
    void addInstructo(Instructor instructor);

}

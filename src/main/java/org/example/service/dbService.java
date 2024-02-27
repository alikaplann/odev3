package org.example.service;

import org.example.entities.Category;
import org.example.entities.Course;
import org.example.entities.Instructor;

public interface dbService {

    void addCourse(Course course);
    void addCategory(Category category);
    void addInstructo(Instructor instructor);
}

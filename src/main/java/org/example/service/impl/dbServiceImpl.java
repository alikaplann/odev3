package org.example.service.impl;

import org.example.entities.Category;
import org.example.entities.Course;
import org.example.entities.Instructor;
import org.example.service.dbService;

public class dbServiceImpl implements dbService {
    @Override
    public void addCourse(Course course) {
        System.out.println("Database eklendi. "+course.getCoursename());
    }

    @Override
    public void addCategory(Category category) {
        System.out.println("Database eklendi. "+category.getCategoryName());
    }

    @Override
    public void addInstructo(Instructor instructor) {
        System.out.println("Database eklendi. "+instructor.getName());
    }
}

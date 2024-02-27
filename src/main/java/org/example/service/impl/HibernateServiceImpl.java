package org.example.service.impl;

import org.example.entities.Category;
import org.example.entities.Course;
import org.example.entities.Instructor;
import org.example.service.HibernateService;

import java.util.Optional;

public class HibernateServiceImpl implements HibernateService {

    @Override
    public void addCourse(Course course) {

        System.out.println("Hibernate eklendi. "+course.getCoursename());

    }

    @Override
    public void addCategory(Category category) {

        System.out.println("Hibernate eklendi. "+category.getCategoryName());
    }

    @Override
    public void addInstructo(Instructor instructor) {
        System.out.println("Hibernate eklendi. "+instructor.getName());
    }
}

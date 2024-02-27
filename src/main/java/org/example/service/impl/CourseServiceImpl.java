package org.example.service.impl;

import org.example.entities.Course;
import org.example.service.CourseService;
import org.example.service.HibernateService;

public class CourseServiceImpl implements CourseService {


    public HibernateServiceImpl hibernateServiceImpl = new HibernateServiceImpl();
    public dbServiceImpl dbService = new dbServiceImpl();
    @Override
    public void add(Course course) {
        hibernateServiceImpl.addCourse(course);
        dbService.addCourse(course);
    }


}

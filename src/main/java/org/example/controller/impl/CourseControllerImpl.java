package org.example.controller.impl;

import org.example.controller.CourseController;
import org.example.entities.Category;
import org.example.entities.Course;
import org.example.logger.BaseLog;

import org.example.service.impl.CourseServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class CourseControllerImpl implements CourseController {

    private final CourseServiceImpl courseService;
    private final BaseLog[] baseLog;
    private Course course;

    public CourseControllerImpl(CourseServiceImpl courseService, BaseLog[] baseLog) {
        this.courseService = courseService;
        this.baseLog = baseLog;
    }

    List<String> courses = new ArrayList<String>();
    @Override
    public void add(Course course) throws Exception {

        if(courses.contains(course.getCoursename()))
        {
            throw new Exception("This category already exist: " + course.getCoursename());
        }

        else {
            courses.add(course.getCoursename());
            courseService.add(course);

            for (BaseLog logger : baseLog) {
                logger.log(course.getCoursename());
            }
            System.out.println("------------------");
        }
    }

    }


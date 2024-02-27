package org.example.controller.impl;

import org.example.controller.InstructorController;
import org.example.entities.Course;
import org.example.entities.Instructor;
import org.example.logger.BaseLog;
import org.example.service.impl.InstructorServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class InstructorControllerImpl implements InstructorController {

    private final InstructorServiceImpl instructorService;
    private final BaseLog[] baseLog;
    private Course course;

    public InstructorControllerImpl(InstructorServiceImpl instructorService, BaseLog[] baseLog) {
        this.instructorService = instructorService;
        this.baseLog = baseLog;
    }
    List<String> instructors = new ArrayList<String>();

    @Override
    public void add(Instructor instructor) throws Exception {

        if(instructors.contains(instructor.getName()))
        {
            throw new Exception("This category already exist: " + instructor.getName());
        }

        else {
            instructors.add(instructor.getName());
            instructorService.add(instructor);

            for (BaseLog logger : baseLog) {
                logger.log(instructor.getName());
            }
            System.out.println("------------------");
        }
    }
    }


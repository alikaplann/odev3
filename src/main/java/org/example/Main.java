package org.example;

import org.example.controller.CategoryController;
import org.example.controller.impl.CategoryControllerImpl;
import org.example.controller.impl.CourseControllerImpl;
import org.example.controller.impl.InstructorControllerImpl;
import org.example.entities.Category;
import org.example.entities.Course;
import org.example.entities.Instructor;
import org.example.logger.BaseLog;
import org.example.logger.FileLogger;
import org.example.logger.dbLogger;
import org.example.service.CategoryService;
import org.example.service.HibernateService;
import org.example.service.impl.CategoryServiceImpl;
import org.example.service.impl.CourseServiceImpl;
import org.example.service.impl.HibernateServiceImpl;
import org.example.service.impl.InstructorServiceImpl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {

//Logging

        BaseLog[] logger = {new dbLogger(),new FileLogger()};


        Category category1 = new Category("Programlama");
        Category category2 = new Category("Programlama1");

        Instructor instructor = new Instructor("Ali Kaplan","alikaplan@gmail.com");


        CategoryControllerImpl categoryController = new CategoryControllerImpl(new CategoryServiceImpl(),logger);
        categoryController.add(category1);
        categoryController.add(category2);

        Course course2 = new Course("Java",10,2019,instructor,category1);
        Course course3 = new Course("Postman",20,2020,instructor,category2);

        CourseControllerImpl courseController = new CourseControllerImpl(new CourseServiceImpl(),logger);
        courseController.add(course2);
        courseController.add(course3);

        InstructorControllerImpl instructorController = new InstructorControllerImpl(new InstructorServiceImpl(),logger);
        instructorController.add(instructor);

    }
}

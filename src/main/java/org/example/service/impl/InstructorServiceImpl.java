package org.example.service.impl;

import org.example.entities.Instructor;
import org.example.service.HibernateService;
import org.example.service.InstructorService;

public class InstructorServiceImpl implements InstructorService {

    public HibernateServiceImpl hibernateServiceImpl = new HibernateServiceImpl();
    public dbServiceImpl dbService = new dbServiceImpl();

    @Override
    public void add(Instructor instructor) {
        hibernateServiceImpl.addInstructo(instructor);
        dbService.addInstructo(instructor);
    }


}

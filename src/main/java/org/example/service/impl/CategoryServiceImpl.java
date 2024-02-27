package org.example.service.impl;

import org.example.entities.Category;
import org.example.service.CategoryService;
import org.example.service.HibernateService;

public class CategoryServiceImpl implements CategoryService {

    public HibernateServiceImpl hibernateServiceImpl = new HibernateServiceImpl();
    public dbServiceImpl dbService = new dbServiceImpl();
    public CategoryServiceImpl() {
    }

    @Override
    public void add(Category category) throws  Exception {
        hibernateServiceImpl.addCategory(category);
        dbService.addCategory(category);
    }
}

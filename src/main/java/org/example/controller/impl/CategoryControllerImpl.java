package org.example.controller.impl;

import org.example.controller.CategoryController;
import org.example.entities.Category;
import org.example.logger.BaseLog;
import org.example.service.CategoryService;
import org.example.service.impl.CategoryServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class CategoryControllerImpl implements CategoryController {

   private final CategoryServiceImpl categoryServiceImpl;
   private final BaseLog[] baseLog;
   private Category category;

    public CategoryControllerImpl(CategoryServiceImpl categoryServiceImpl,BaseLog[] baseLog) {
        this.categoryServiceImpl = categoryServiceImpl;
        this.baseLog = baseLog;

    }

    List<String> categories = new ArrayList<String>();


    @Override
    public void add(Category category) throws Exception {

        if(categories.contains(category.getCategoryName()))
        {
            throw new Exception("This category already exist: " + category.getCategoryName());
        }

        else {
            categories.add(category.getCategoryName());
            categoryServiceImpl.add(category);

            for (BaseLog logger : baseLog) {
                logger.log(category.getCategoryName());
            }
            System.out.println("------------------");
        }
    }
}

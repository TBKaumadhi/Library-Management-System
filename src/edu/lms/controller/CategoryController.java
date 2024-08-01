/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.lms.controller;

import edu.lms.dto.CategoryDto;
import edu.lms.service.ServiceFactory;
import edu.lms.service.custom.CategoryService;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class CategoryController {
    private CategoryService categoryService= (CategoryService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CATEGORY);
    
    
    public String save(CategoryDto dto) throws Exception {
        return categoryService.save(dto);
    }

     
    public String update (CategoryDto dto) throws Exception {
        return categoryService.update(dto);
    }

    public String delete(String id) throws Exception {
        return categoryService.delete(id);
    }
    
    public ArrayList<CategoryDto> getAll() throws Exception {
        return categoryService.getAll();
    }
     public CategoryDto get(String id) throws Exception {
        return categoryService.get(id);
    }

}

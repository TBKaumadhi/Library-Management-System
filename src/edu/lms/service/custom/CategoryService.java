/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.lms.service.custom;

import edu.lms.dto.CategoryDto;
import edu.lms.service.SuperService;
import java.util.ArrayList;
/**
 *
 * @author USER
 */
public interface CategoryService extends SuperService{   

     String save(CategoryDto dto) throws Exception;
     String update(CategoryDto dto)throws Exception;
     ArrayList <CategoryDto> getAll() throws Exception;
     CategoryDto get(String id) throws Exception;
     String delete(String id) throws Exception;

   

    
    
}

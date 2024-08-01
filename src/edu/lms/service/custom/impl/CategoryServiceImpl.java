/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.lms.service.custom.impl;

import edu.lms.dao.DaoFactory;
import edu.lms.dao.custom.CategoryDao;

import edu.lms.dto.CategoryDto;

import edu.lms.entity.CategoryEntity;
import edu.lms.service.custom.CategoryService;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class CategoryServiceImpl implements CategoryService{
        private CategoryDao categoryDao = (CategoryDao)DaoFactory.getInstance().getDao(DaoFactory.DaoType.CATEGORY);
   

    @Override
    public String save(CategoryDto dto) throws Exception{
        CategoryEntity entity= getCategoryEntity(dto);
        
        return categoryDao.create(entity) ? "Success":"Fail";  
    }
     @Override
    public String update(CategoryDto dto) throws Exception{
       CategoryEntity entity= getCategoryEntity(dto);
        return categoryDao.update(entity) ? "Success":"Fail";  
    }
    
    @Override
    public String delete(String id)throws Exception {
        return categoryDao.delete(id) ? "Sucess" :"Fail";
    }
     @Override
    public CategoryDto get(String id) throws Exception{
        CategoryEntity categoryEntity=  categoryDao.get(id);
        
        if(categoryEntity != null){
            return getCategoryDto(categoryEntity);
        }
        return null;
    }
    @Override
    public ArrayList<CategoryDto> getAll() throws Exception {
         ArrayList<CategoryEntity> categoryEntitys = categoryDao.getAll();
        
        if(categoryEntitys != null && ! categoryEntitys.isEmpty()){
            ArrayList<CategoryDto> categoryDtos = new ArrayList<>();
            
            for(CategoryEntity entity: categoryEntitys){
                categoryDtos.add(getCategoryDto(entity));
            }
            return categoryDtos;
        }
        return null;
    }
    
   private CategoryEntity getCategoryEntity(CategoryDto categoryDto){       
        return  new CategoryEntity(
                categoryDto.getCategoryId(),     
                categoryDto.getGenre(), 
                categoryDto.getDescription()
                );
    }
   private CategoryDto getCategoryDto(CategoryEntity categoryEntity){
        return new  CategoryDto(   
                
            categoryEntity.getCategoryId(),
                categoryEntity.getGenre() ,
            categoryEntity.getDescription()
                       
        );
     }
}

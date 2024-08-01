/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.lms.dao.custom.impl;

import edu.lms.dao.CrudUtil;
import edu.lms.dao.custom.CategoryDao;
import edu.lms.entity.CategoryEntity;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class CategoryDaoImpl implements CategoryDao{

    @Override
    public boolean create(CategoryEntity t)throws Exception{
        return CrudUtil.executeUpdate("INSERT INTO Category VALUES (?,?,?)", t.getCategoryId(),t.getGenre(),t.getDescription());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM Category WHERE categoryId=?", id);
    }

    @Override
    public boolean update(CategoryEntity t) throws Exception {
       return CrudUtil.executeUpdate("UPDATE Category SET genre=?,description=? WHERE categoryId=?", t.getGenre(),t.getDescription(),t.getCategoryId());
    }

    @Override
    public CategoryEntity get(String id) throws Exception {
           ResultSet rst = CrudUtil.executeQuery("SELECT * FROMCategory WHERE categoryId=?",id);
           
           if(rst.next()){
               CategoryEntity categoryEntity= new CategoryEntity(rst.getString("categoryId"),rst.getString("genre"),
                       rst.getString("description"));
           
            return categoryEntity;
           }return null;
           
    }

    @Override
    public ArrayList<CategoryEntity> getAll() throws Exception {
           ArrayList <CategoryEntity> entitys= new ArrayList<>();
           
            ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Category");
            
            while(rst.next()){
                CategoryEntity categoryEntity= new CategoryEntity(rst.getString("categoryId"),rst.getString("genre"),
                        rst.getString("description"));
                entitys.add(categoryEntity);
                }
            return entitys;
    }
    
}

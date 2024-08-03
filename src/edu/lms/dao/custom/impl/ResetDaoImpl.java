/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.lms.dao.custom.impl;

import edu.lms.dao.CrudUtil;
import edu.lms.dao.custom.ResetDao;
import edu.lms.entity.RegisterEntity;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author USER
 */
public class ResetDaoImpl implements ResetDao{

    @Override
    public boolean create(RegisterEntity t) throws Exception {
        return false; 
    }

    @Override
    public boolean update(RegisterEntity t) throws Exception {
        
        return  CrudUtil.executeUpdate("UPDATE Users SET password=? WHERE username=?", t.getPassword(),t.getUserName());     
    }

    @Override
    public boolean delete(String id) throws Exception {
        return false; 
    }

    @Override
    public RegisterEntity get(String userName) throws Exception {
        ResultSet rst= CrudUtil.executeQuery("SELECT username,secQuestion,answer,password from Users WHERE username=? ", userName); 
        if(rst.next()){
            RegisterEntity entity = new RegisterEntity();
            entity.setAnswer(rst.getString("answer"));
            entity.setSecQuestion(rst.getString("secQuestion"));
            entity.setPassword(rst.getString("password"));
            entity.setUserName(rst.getString("userName"));
           
            return entity;
        } return null;
    }

    @Override
    public ArrayList<RegisterEntity> getAll() throws Exception {
       return null;
    }
    
    
}

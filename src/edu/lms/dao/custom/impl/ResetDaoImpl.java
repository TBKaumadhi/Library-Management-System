/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.lms.dao.custom.impl;

import edu.lms.dao.CrudUtil;
import edu.lms.dao.custom.ResetDao;
import edu.lms.entity.UserEntity;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author USER
 */
public class ResetDaoImpl implements ResetDao{

    @Override
    public boolean create(UserEntity t) throws Exception {
        return false; 
    }

    @Override
    public boolean update(UserEntity t) throws Exception {
        
        return  CrudUtil.executeUpdate("UPDATE Users SET password=?, secQuestion=?,answer=? WHERE username=?", t.getPassword(),t.getSecQ(),t.getAnswer(),t.getUserName());     
    }

    @Override
    public boolean delete(String id) throws Exception {
        return false; 
    }

    @Override
    public UserEntity get(String userName) throws Exception {
        ResultSet rst= CrudUtil.executeQuery("SELECT username,secQuestion,answer,password from Users WHERE username=? ", userName); 
        if(rst.next()){
            UserEntity userEntity = new UserEntity (rst.getString("userName"),rst.getString("secQuestion"), rst.getString("answer"),rst.getString("password"));
            return userEntity;
        } return null;
    }

    @Override
    public ArrayList<UserEntity> getAll() throws Exception {
       return null;
    }
    
    
}

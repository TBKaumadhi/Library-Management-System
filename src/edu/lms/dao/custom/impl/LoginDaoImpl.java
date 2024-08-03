/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.lms.dao.custom.impl;

import edu.lms.dao.CrudUtil;
import edu.lms.dao.custom.LoginDao;
import edu.lms.entity.RegisterEntity;
import edu.lms.session.UserSession;
import java.sql.ResultSet;
import java.util.ArrayList;


/**
 *
 * @author USER
 */
public class LoginDaoImpl implements LoginDao {

    @Override
    public RegisterEntity get(String userName, String password) throws Exception {
        
        ResultSet rst= CrudUtil.executeQuery("SELECT role,userId FROM Users WHERE username=? AND password=? ",
                userName, password);
        if(rst.next()){
            RegisterEntity entity= new RegisterEntity();
             entity.setRole(rst.getString("role"));
             entity.setUserId(rst.getString("userId"));
             return entity;
        }
        return null;
    }

    @Override
     public boolean update(RegisterEntity t) throws Exception {
         String userId = UserSession.getInstance().getUserId();
         return CrudUtil.executeUpdate("UPDATE Users SET username=?,emailAddress=?,secQuestion=?,answer=? WHERE userId=?", 
                 t.getUserName(),t.getEmail(),t.getSecQuestion(),t.getAnswer(),userId);
      } 
    
    @Override
    public RegisterEntity get(String id) throws Exception {
        ResultSet rst= CrudUtil.executeQuery("SELECT username,emailAddress,answer,secQuestion FROM Users WHERE userId=?", id);
        
        if(rst.next()){
            RegisterEntity entity= new RegisterEntity();
            entity.setAnswer(rst.getString("answer"));
            entity.setEmail(rst.getString("emailAddress"));
            entity.setUserName(rst.getString("username"));
            entity.setSecQuestion(rst.getString("secQuestion"));
            return entity;
        }
        return null;
    }

    @Override
    public boolean create(RegisterEntity entity) throws Exception {
         return false;
    }

    

    @Override
    public boolean delete(String id) throws Exception {
        return false;
    }

    @Override
    public ArrayList<RegisterEntity> getAll() throws Exception {
        return null;
    }

   

    
    
}

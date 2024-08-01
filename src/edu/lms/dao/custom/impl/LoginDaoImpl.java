/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.lms.dao.custom.impl;

import edu.lms.dao.CrudUtil;
import edu.lms.dao.custom.LoginDao;
import java.sql.ResultSet;


/**
 *
 * @author USER
 */
public class LoginDaoImpl implements LoginDao {

    @Override
    public String get(String userName, String password) throws Exception {
        
        ResultSet rst= CrudUtil.executeQuery("SELECT role FROM Users WHERE username=? AND password=? ",
                userName, password);
        if(rst.next()){
            return rst.getString("role");
        }
        return null;
    }

   

    
    
}

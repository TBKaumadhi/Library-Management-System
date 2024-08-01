/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.lms.service.custom.impl;
import edu.lms.dao.DaoFactory;
import edu.lms.dao.custom.LoginDao;

import edu.lms.dto.UserDto;
import edu.lms.service.custom.LoginService;
/**
 *
 * @author USER
 */
public class LoginServiceImpl implements LoginService{

    private LoginDao loginDao = (LoginDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.LOGIN);
            
    @Override
    public String get(String userName, String password) throws Exception {
        
        if(userName != null){
        return loginDao.get(userName,password);
    }  return null;
        
         
        
        
    }
    
}

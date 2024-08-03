/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.lms.service.custom.impl;
import edu.lms.dao.DaoFactory;
import edu.lms.dao.custom.LoginDao;
import edu.lms.dto.RegisterDto;

import edu.lms.dto.UserDto;
import edu.lms.entity.RegisterEntity;
import edu.lms.service.custom.LoginService;
/**
 *
 * @author USER
 */
public class LoginServiceImpl implements LoginService{

    private LoginDao loginDao = (LoginDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.LOGIN);
            
    @Override
    public RegisterDto get(String userName, String password) throws Exception {
        RegisterEntity entity=  loginDao.get(userName,password);
        if(entity != null){
            return getDto(entity);
    }  return null;              
    } 

    @Override
    public String update(RegisterDto registerDto) throws Exception {
        RegisterEntity entity= new RegisterEntity();
        entity.setAnswer(registerDto.getAnswer());
        entity.setEmail(registerDto.getEmail());
        entity.setSecQuestion(registerDto.getSecQuestion());
        entity.setUserName(registerDto.getUserName());
        
        return loginDao.update(entity) ? "Success":"Fail";     
    }

    @Override
    public RegisterDto get(String userId) throws Exception {
      RegisterEntity entity=  loginDao.get(userId);
        if(entity != null){
            return getDto(entity);
        }
        return null;
    }
     private RegisterDto getDto(RegisterEntity entity){
         return new RegisterDto(entity.getUserId(),entity.getUserName(),entity.getPassword(),entity.getEmail(),
                 entity.getRole(),entity.getSecQuestion(),entity.getAnswer());
     }
    }


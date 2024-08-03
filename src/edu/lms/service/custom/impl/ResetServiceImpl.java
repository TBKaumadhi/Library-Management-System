/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.lms.service.custom.impl;

import edu.lms.dao.DaoFactory;
import edu.lms.dao.custom.ResetDao;
import edu.lms.dto.RegisterDto;
import edu.lms.entity.RegisterEntity;

import edu.lms.service.custom.ResetService;

/**
 *
 * @author USER
 */
public class ResetServiceImpl implements ResetService{
    private ResetDao resetDao = (ResetDao)DaoFactory.getInstance().getDao(DaoFactory.DaoType.RESET);

    @Override
    public RegisterDto get(String userName) throws Exception {
        RegisterEntity registerEntity= resetDao.get(userName);
        
        if(registerEntity != null){
            RegisterDto dto= new RegisterDto();
            dto.setAnswer(registerEntity.getAnswer());
            dto.setSecQuestion(registerEntity.getSecQuestion());
            dto.setUserName(registerEntity.getUserName());
            dto.setPassword(registerEntity.getPassword());
            
            return dto;
        }return null;
    }

    @Override
    public String update(RegisterDto registerDto) throws Exception {
        RegisterEntity entity = new RegisterEntity();
        entity.setUserName(registerDto.getUserName());
        entity.setPassword(registerDto.getPassword());
        
        return resetDao.update(entity)? "Success": "Fail" ;
               
    }
    
}

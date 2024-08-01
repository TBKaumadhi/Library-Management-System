/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.lms.service.custom.impl;

import edu.lms.dao.DaoFactory;
import edu.lms.dao.custom.ResetDao;
import edu.lms.dto.UserDto;
import edu.lms.entity.UserEntity;
import edu.lms.service.custom.ResetService;

/**
 *
 * @author USER
 */
public class ResetServiceImpl implements ResetService{
    private ResetDao resetDao = (ResetDao)DaoFactory.getInstance().getDao(DaoFactory.DaoType.RESET);

    @Override
    public UserDto get(String userName) throws Exception {
        UserEntity userEntity= resetDao.get(userName);
        
        if(userEntity != null){
            return new UserDto(userEntity.getUserName(),userEntity.getSecQ(),userEntity.getAnswer(),userEntity.getPassword());
        }return null;
    }

    @Override
    public String update(UserDto userDto) throws Exception {
        UserEntity entity = new UserEntity(userDto.getUserName(),userDto.getSecQ(),userDto.getAnswer(),userDto.getPassword());
        return resetDao.update(entity)? "Success": "Fail" ;
               
    }
    
}

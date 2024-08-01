/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.lms.service.custom.impl;

import edu.lms.dao.DaoFactory;
import edu.lms.dao.custom.RegisterDao;
import edu.lms.dto.RegisterDto;
import edu.lms.entity.RegisterEntity;
import edu.lms.service.custom.RegisterService;

/**
 *
 * @author USER
 */
public class RegisterServiceImpl implements RegisterService {
        private final  RegisterDao registerDao = (RegisterDao)DaoFactory.getInstance().getDao(DaoFactory.DaoType.REGISTER);

    @Override
    public String save(RegisterDto dto) throws Exception {
        RegisterEntity registerEntity = getRegisterEntity(dto);
        
        return registerDao.create(registerEntity) ? "Success" :"Fail";
        
        
    }
     private RegisterEntity getRegisterEntity(RegisterDto dto){       
        return  new RegisterEntity(
                dto.getUserId(),
                dto.getUserName(), 
                dto.getPassword(),                 
                dto.getEmail(),
                dto.getRole(),
                dto.getSecQuestion(),
                dto.getAnswer()
                );
    }

   
}

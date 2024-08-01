/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.lms.controller;

import edu.lms.dto.RegisterDto;
import edu.lms.service.ServiceFactory;
import edu.lms.service.custom.RegisterService;

/**
 *
 * @author USER
 */
public class RegisterController {
        private  RegisterService registerService = (RegisterService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.REGISTER);
    
    public String registerUser(RegisterDto dto) throws Exception {
        return registerService.save(dto);
    }
    
}

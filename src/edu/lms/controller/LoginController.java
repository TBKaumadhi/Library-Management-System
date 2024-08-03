/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.lms.controller;


import edu.lms.dto.RegisterDto;
import edu.lms.service.ServiceFactory;
import edu.lms.service.custom.LoginService;

/**
 *
 * @author USER
 */
public class LoginController {
    private LoginService loginService = (LoginService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.LOGIN);
    
    public RegisterDto get (String userName, String password) throws Exception{
        return loginService.get(userName,password);
    }
    
     public String update(RegisterDto dto) throws Exception {
        return loginService.update(dto);
    }

    public RegisterDto get(String userId) throws Exception {
        return loginService.get(userId);
    }
}


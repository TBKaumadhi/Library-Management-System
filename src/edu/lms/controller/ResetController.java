/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.lms.controller;

import edu.lms.dto.RegisterDto;
import edu.lms.service.ServiceFactory;
import edu.lms.service.custom.ResetService;

/**
 *
 * @author USER
 */
public class ResetController {

    private ResetService resetService = (ResetService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.RESET);
            
    public RegisterDto get(String userName) throws Exception {
        return resetService.get(userName); 
    }

    public String update(RegisterDto registerDto) throws Exception {
        return resetService.update(registerDto);
    }    
}

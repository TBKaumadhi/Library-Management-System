/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.lms.service.custom;

import edu.lms.dto.RegisterDto;
import edu.lms.service.SuperService;
/**
 *
 * @author USER
 */
public interface LoginService extends SuperService {

    public RegisterDto get(String userName, String password) throws Exception;
    
    public String update (RegisterDto registerDto) throws Exception;

    public RegisterDto get(String userId)throws Exception;
}

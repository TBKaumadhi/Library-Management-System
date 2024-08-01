/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.lms.service.custom;

import edu.lms.dto.UserDto;
import edu.lms.service.SuperService;

/**
 *
 * @author USER
 */
public interface ResetService extends SuperService{

     // String update(String password) throws Exception;
      
      String update (UserDto userDto) throws Exception;
      UserDto get(String userName) throws Exception; ;
}

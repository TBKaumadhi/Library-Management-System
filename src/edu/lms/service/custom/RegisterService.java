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
public interface RegisterService extends SuperService{
    String save (RegisterDto dto) throws Exception;
}

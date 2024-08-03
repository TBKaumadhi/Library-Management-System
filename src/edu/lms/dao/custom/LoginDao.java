/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.lms.dao.custom;
import edu.lms.dao.AuthenticateDao;
/**
 *
 * @author USER
 */
public interface LoginDao extends AuthenticateDao <String, String>{

    public String get(String userName, String password) throws Exception;
    
  
}

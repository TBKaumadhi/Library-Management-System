/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.lms.dao;

/**
 *
 * @author USER
 */

public interface AuthenticateDao <U,P> extends SuperDao{
    
    U get(U u, P p) throws Exception;
}

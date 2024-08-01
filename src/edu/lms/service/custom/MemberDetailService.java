/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.lms.service.custom;

import edu.lms.entity.BorrowDetailsWrapper;
import edu.lms.service.SuperService;
/**
 *
 * @author USER
 */
public interface MemberDetailService extends SuperService {

    BorrowDetailsWrapper getBorrowDetails(String borrowId) throws Exception;

   
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.lms.service.custom;

import edu.lms.dto.BorrowDto;
import edu.lms.dto.BorrowDetailDto;
import edu.lms.entity.BorrowDetailsWrapper;
import edu.lms.service.SuperService;
/**
 *
 * @author USER
 */
public interface BorrowService extends SuperService{
    public String issueBook(BorrowDto dto) throws Exception;

   
    BorrowDetailsWrapper getBorrowDetails(String borrowId) throws Exception;

    public String returnBook(BorrowDetailDto detailDto)throws Exception;

  
        
    
}

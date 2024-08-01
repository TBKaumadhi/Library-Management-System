/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.lms.controller;

import edu.lms.dto.BorrowDto;
import edu.lms.dto.BorrowDetailDto;
import edu.lms.entity.BorrowDetailsWrapper;
import edu.lms.service.ServiceFactory;
import edu.lms.service.custom.BorrowService;


/**
 *
 * @author USER
 */
public class BorrowController {

    private BorrowService borrowService = (BorrowService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.BORROW);
    
    public String issueBook(BorrowDto dto) throws Exception {
        return borrowService.issueBook(dto);
    }

    public String returnBook(BorrowDetailDto detaildto) throws Exception {
         return borrowService.returnBook(detaildto);
    }

    public BorrowDetailsWrapper getBorrowDetails(String borrowId) throws Exception {
        return borrowService.getBorrowDetails(borrowId);
    }
    
}

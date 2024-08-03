/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.lms.controller;


import edu.lms.dto.MemberDto;
import edu.lms.entity.BorrowDetailsWrapper;
import edu.lms.service.ServiceFactory;
import edu.lms.service.custom.MemberDetailService;


/**
 *
 * @author USER
 */
public class MemberDetailViewController {

       
    private MemberDetailService memberService= (MemberDetailService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.MEMBERDETAIL);

     
    public BorrowDetailsWrapper getBorrowDetails(String id) throws Exception {
         return memberService.getBorrowDetails(id);
    }
    public MemberDto get(String userId) throws Exception{
         return memberService.get (userId);
    } 
}

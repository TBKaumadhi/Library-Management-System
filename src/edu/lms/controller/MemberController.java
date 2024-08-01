/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.lms.controller;
import edu.lms.service.custom.MemberService;
import edu.lms.service.ServiceFactory;
import edu.lms.dto.MemberDto;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class MemberController {
    private  MemberService memberService= (MemberService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.MEMBER);
           
    public String save(MemberDto dto) throws Exception{
         return memberService.save(dto);
    }
   
    public String update(MemberDto dto) throws Exception{
         return memberService.update(dto);
    }
    public String delete(String memberId) throws Exception{
         return memberService.delete( memberId);
    }
    public MemberDto get(String memberId) throws Exception{
         return memberService.get (memberId);
    }
    public ArrayList <MemberDto> getAll() throws Exception{
         return memberService.getAll( );
    }
   
}

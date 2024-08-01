/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.lms.service.custom;
import edu.lms.service.SuperService;
import edu.lms.dto.MemberDto;
import java.util.ArrayList;
/**
 *
 * @author USER
 */
public interface MemberService extends SuperService{
    String save (MemberDto dto) throws Exception;
    String update (MemberDto dto) throws Exception;
    String delete(String MemberId) throws Exception;
    MemberDto get(String MemberId) throws Exception;
    ArrayList<MemberDto> getAll () throws Exception;
}

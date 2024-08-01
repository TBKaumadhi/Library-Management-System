/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.lms.service.custom.impl;
import edu.lms.dao.DaoFactory;
import edu.lms.dao.custom.MemberDao;
import edu.lms.dto.MemberDto;
import edu.lms.entity.MemberEntity;
import edu.lms.service.custom.MemberService;
import java.util.ArrayList;
/**
 *
 * @author USER
 */
public class MemberServiceImpl implements MemberService {
    
    public MemberDao memberDao = (MemberDao)DaoFactory.getInstance().getDao(DaoFactory.DaoType.MEMBER);

    @Override
    public String save(MemberDto dto) throws Exception {
        MemberEntity entity =getMemberEntity(dto);
        return memberDao.create(entity) ? "Success":"Fail";
    }

    @Override
    public String update(MemberDto dto) throws Exception {
      MemberEntity entity =getMemberEntity(dto);
        return memberDao.update(entity) ? "Success":"Fail";
    }

    @Override
    public String delete(String memberId) throws Exception {
        
        return memberDao.delete (memberId) ? "Success":"Fail"; 
    }

    @Override
    public MemberDto get(String memberId) throws Exception {
       
       MemberEntity entity= memberDao.get(memberId);
       if(entity!= null){
           return getMemberDto(entity);
       }
       return null;
    }
    
    
    @Override
    public ArrayList <MemberDto> getAll () throws Exception{
        ArrayList <MemberEntity> memberEntitys = memberDao.getAll();
        
        if(memberEntitys != null && ! memberEntitys.isEmpty()){
            
            ArrayList <MemberDto> memberDtos = new ArrayList <>();
            
            for(MemberEntity entitys: memberEntitys){
            memberDtos.add(getMemberDto(entitys));
            }
            return memberDtos;
            }
            return null;
        } 

    private MemberEntity getMemberEntity(MemberDto memberDto){
        return new MemberEntity(
         memberDto.getMemberId(),
         memberDto.getName(),
         memberDto.getDob(),
         memberDto.getAddress(),
         memberDto.getContact(),
         memberDto.getMembershipDate(),
         memberDto.getUserId());
    }
    
    private MemberDto getMemberDto (MemberEntity memberEntity){
        return new MemberDto (
        memberEntity.getMemberId(),
        memberEntity.getName(),
        memberEntity.getDob(),
        memberEntity.getAddress(),       
        memberEntity.getContact(),
        memberEntity.getMembershipDate(),
        memberEntity.getUserId());
    }
}

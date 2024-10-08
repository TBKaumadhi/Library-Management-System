/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.lms.service.custom.impl;

import edu.lms.dao.custom.MemberDetailDao;

import edu.lms.service.custom.MemberDetailService;
import edu.lms.dao.DaoFactory;
import edu.lms.entity.BorrowDetailsWrapper;
import edu.lms.entity.MemberEntity;
import edu.lms.dto.MemberDto;

/**
 *
 * @author USER
 */
public class MemberDetailServiceImpl implements MemberDetailService{

    private MemberDetailDao memberDetailDao = (MemberDetailDao)DaoFactory.getInstance().getDao(DaoFactory.DaoType.MEMBERDETAIL);

    @Override
    public BorrowDetailsWrapper getBorrowDetails(String id) throws Exception {
        return memberDetailDao.getDetails(id);
    }

    @Override
    public MemberDto get(String userId) throws Exception{
        
        MemberEntity entity= memberDetailDao.get(userId);
            if(entity!=null){
                MemberDto dto= new MemberDto();
                dto.setMemberId(entity.getMemberId());
                return dto;
            }
            return null;
    } 

    
            
    
}
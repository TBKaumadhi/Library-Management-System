/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.lms.dao.custom;

import edu.lms.dao.CrudDao;

import edu.lms.entity.BorrowDetailsWrapper;
import edu.lms.entity.MemberEntity;
/**
 *
 * @author USER
 */
public interface MemberDetailDao extends CrudDao<Object,String>{   

    public BorrowDetailsWrapper getDetails(String borrowId) throws Exception;
    
     public MemberEntity get (String userId) throws Exception;
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.lms.dao.custom;

import edu.lms.dao.CrudDao;
import edu.lms.entity.BorrowDetailsWrapper;
import edu.lms.entity.BorrowEntity;
/**
 *
 * @author USER
 */
public interface BorrowDao extends CrudDao<BorrowEntity,String>{

    public BorrowDetailsWrapper getDetails(String borrowId) throws Exception;
    
}

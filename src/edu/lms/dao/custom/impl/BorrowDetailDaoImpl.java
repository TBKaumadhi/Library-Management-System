/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.lms.dao.custom.impl;

import edu.lms.dao.CrudUtil;
import edu.lms.dao.custom.BorrowDetailDao;
import edu.lms.entity.BorrowDetailEntity;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class BorrowDetailDaoImpl implements BorrowDetailDao {

    @Override
    public boolean create(BorrowDetailEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO BorrowDetails VALUES (?,?,?,?,?)", t.getBorrowId(),t.getBookId(),t.getReturnDate(),t.getQty(),t.getFines());
    }

    @Override
    public boolean update(BorrowDetailEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE BorrowDetails SET returnDate=?,bookCount=?,fineAmount=? WHERE borrowId=? AND bookId=?",t.getReturnDate(),t.getQty(),t.getFines(),t.getBorrowId(),t.getBookId()); 
    }

    @Override
    public boolean delete(Object id) throws Exception {
        return false; 
    }

    @Override
    public BorrowDetailEntity get(Object id) throws Exception {
        return null; 
    }

    @Override
    public ArrayList<BorrowDetailEntity> getAll() throws Exception {
        return null; 
    }

    

    
    
}

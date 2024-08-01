/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.lms.dao.custom.impl;

import edu.lms.dao.CrudUtil;
import edu.lms.dao.custom.MemberDetailDao;
import edu.lms.entity.BorrowDetailEntity;
import edu.lms.entity.BorrowDetailsWrapper;
import edu.lms.entity.BorrowEntity;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class MemberDetailDaoImpl implements MemberDetailDao{

    @Override
    public BorrowDetailsWrapper getDetails(String Id) throws Exception {
         BorrowEntity borrowEntity = new BorrowEntity();
        ArrayList<BorrowDetailEntity> details = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery ("SELECT b.borrowId, b.borrowDate, b.dueDate,b.memberId,br.bookId,"
                + " br.returnDate,br.bookCount,br.fineAmount "
                + " FROM Borrowings b INNER JOIN Borrowdetails br ON b.borrowId = br.borrowId WHERE b.memberId = ?",Id);
   
        if (rst.next()) {
            borrowEntity.setId(rst.getString("borrowId"));
            borrowEntity.setDueDate(rst.getDate("dueDate"));
            borrowEntity.setMemberId(rst.getString("memberId"));
            borrowEntity.setBorrowDate(rst.getDate("borrowDate"));
           
        }
        do {
            BorrowDetailEntity detail = new BorrowDetailEntity(rst.getString("borrowId"),rst.getString("bookId"),rst.getDate("returnDate"),rst.getInt("bookCount"),rst.getDouble("fineAmount"));
            
            details.add(detail);
        } while (rst.next());    
    
    return new BorrowDetailsWrapper(borrowEntity, details);
    }
    

    @Override
    public BorrowDetailsWrapper get(Object id) throws Exception {
        return null;
    }

    @Override
    public boolean create(BorrowDetailsWrapper entity) throws Exception {
        return false;
    }

    @Override
    public boolean update(BorrowDetailsWrapper entity) throws Exception {
        return false;
    }

    @Override
    public boolean delete(Object id) throws Exception {
        return false;
    }

    @Override
    public ArrayList<BorrowDetailsWrapper> getAll() throws Exception {
       return null;
    }
    
}

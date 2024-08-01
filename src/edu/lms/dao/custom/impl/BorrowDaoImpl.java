/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.lms.dao.custom.impl;

import edu.lms.dao.CrudUtil;
import edu.lms.dao.custom.BorrowDao;
import edu.lms.entity.BorrowDetailEntity;
import edu.lms.entity.BorrowDetailsWrapper;
import edu.lms.entity.BorrowEntity;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class BorrowDaoImpl implements BorrowDao{

    @Override
    public boolean create(BorrowEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Borrowings VALUES (?,?,?,?)", t.getId(),t.getBorrowDate(),t.getMemberId(),t.getDueDate());
    }

    @Override
    public boolean update(BorrowEntity t) throws Exception {
        return false; 
    }

    @Override
    public boolean delete(String id) throws Exception {
       return false;
    }

    @Override
    public BorrowEntity get(String id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<BorrowEntity> getAll() throws Exception {
        return null;
    }

    /**
     *
     * @param borrowId
     * @return
     * @throws Exception
     */
  

    @Override
    public BorrowDetailsWrapper getDetails(String borrowId) throws Exception {
        BorrowEntity borrowEntity = new BorrowEntity(); 
    ArrayList<BorrowDetailEntity> details = new ArrayList<>();
    ResultSet rst = CrudUtil.executeQuery ("SELECT b.borrowId, b.dueDate,b.memberId, br.bookId, br.returnDate,br.bookCount,"
            + "CASE WHEN DATEDIFF(CURDATE(), b.dueDate) > 14 THEN "
            + "(DATEDIFF(CURDATE(), b.dueDate) * 5.00) ELSE 0 END AS Amount "
            + "FROM  Borrowdetails br INNER JOIN  Borrowings b ON b.borrowId = br.borrowId WHERE  b.borrowId = ?",borrowId);
    
           
        if (rst.next()) {
            borrowEntity.setId(rst.getString("borrowId"));
            borrowEntity.setDueDate(rst.getDate("dueDate"));
            borrowEntity.setMemberId(rst.getString("memberId"));
        }
        
        do {
            BorrowDetailEntity detail = new BorrowDetailEntity(rst.getString("borrowId"),rst.getString("bookId"),rst.getDate("returnDate"),rst.getInt("bookCount"),rst.getDouble("Amount"));
            
            details.add(detail);
        } while (rst.next());      
    
    
    return new BorrowDetailsWrapper(borrowEntity, details);
    }
}
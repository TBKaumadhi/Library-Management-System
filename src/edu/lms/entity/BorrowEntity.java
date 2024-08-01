/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.lms.entity;

import java.util.Date;

/**
 *
 * @author USER
 */

    public class BorrowEntity {
    private String id;
    private Date borrowDate;
    private String memberId;
    private Date dueDate;

    public BorrowEntity() {
        
    }
    
    public void BorrowEntity(){};

    public BorrowEntity(String id,String memberId, Date borrowDate, Date dueDate) {
        this.id = id;
        this.borrowDate = borrowDate;
        this.memberId = memberId;
        this.dueDate = dueDate;
    }
     
    
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the borrowDate
     */
    public Date getBorrowDate() {
        return borrowDate;
    }

    /**
     * @param borrowDate the borrowDate to set
     */
    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    /**
     * @return the memberId
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * @param memberId the memberId to set
     */
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    /**
     * @return the dueDate
     */
    public Date getDueDate() {
        return dueDate;
    }

    /**
     * @param dueDate the dueDate to set
     */
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }    
    
}



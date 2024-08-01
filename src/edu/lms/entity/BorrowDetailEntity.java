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
public class BorrowDetailEntity {
    private String borrowId;
    private String bookId;
    private Date returnDate;
    private int qty;
    private double fines;

    public void BorrowDetailEntity(){
        
    }
    
    public BorrowDetailEntity(String borrowId, String bookId, Date returnDate, int qty, double fines) {
        this.borrowId = borrowId;
        this.bookId = bookId;
        this.returnDate = returnDate;
        this.qty = qty;
        this.fines = fines;
    }

    
    /**
     * @return the borrowId
     */
    public String getBorrowId() {
        return borrowId;
    }

    /**
     * @param borrowId the borrowId to set
     */
    public void setBorrowId(String borrowId) {
        this.borrowId = borrowId;
    }

    /**
     * @return the bookId
     */
    public String getBookId() {
        return bookId;
    }

    /**
     * @param bookId the bookId to set
     */
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    /**
     * @return the returnDate
     */
    public Date getReturnDate() {
        return returnDate;
    }

    /**
     * @param returnDate the returnDate to set
     */
    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    /**
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
    }

    /**
     * @return the fines
     */
    public double getFines() {
        return fines;
    }

    /**
     * @param fines the fines to set
     */
    public void setFines(double fines) {
        this.fines = fines;
    }
    
    
}

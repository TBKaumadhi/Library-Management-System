/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.lms.entity;

import java.util.ArrayList;
/**
 *
 * @author USER
 */
public class BorrowDetailsWrapper {
    private BorrowEntity borrowEntity;
    private ArrayList<BorrowDetailEntity> details;

    public BorrowDetailsWrapper() {
    }

    
    public BorrowDetailsWrapper(BorrowEntity borrowEntity, ArrayList<BorrowDetailEntity> details) {
        this.borrowEntity = borrowEntity;
        this.details = details;
    }

    /**
     * @return the borrowEntity
     */
    public BorrowEntity getBorrowEntity() {
        return borrowEntity;
    }

    /**
     * @param borrowEntity the borrowEntity to set
     */
    public void setBorrowEntity(BorrowEntity borrowEntity) {
        this.borrowEntity = borrowEntity;
    }

    /**
     * @return the details
     */
    public ArrayList<BorrowDetailEntity> getDetails() {
        return details;
    }

    /**
     * @param details the details to set
     */
    public void setDetails(ArrayList<BorrowDetailEntity> details) {
        this.details = details;
    }
    
    
}

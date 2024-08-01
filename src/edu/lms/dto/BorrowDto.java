/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.lms.dto;

import java.util.ArrayList;

import java.util.Date;

/**
 *
 * @author USER
 */
public class BorrowDto {
    private String id;
    private Date borrowDate;
    private String memberId;
    private Date dueDate;
    private ArrayList<BorrowDetailDto>borrowDetailDtos ;

    public BorrowDto() {
    }

    
    public BorrowDto(String id, String memberId, Date borrowDate, Date dueDate, ArrayList<BorrowDetailDto> borrowDetailDtos) {
        this.id = id;
        this.borrowDate = borrowDate;
        this.memberId = memberId;
        this.dueDate = dueDate;
        this.borrowDetailDtos = borrowDetailDtos;
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

    /**
     * @return the borrowDetailDtos
     */
    public ArrayList<BorrowDetailDto> getBorrowDetailDtos() {
        return borrowDetailDtos;
    }

    /**
     * @param borrowDetailDtos the borrowDetailDtos to set
     */
    public void setBorrowDetailDtos(ArrayList<BorrowDetailDto> borrowDetailDtos) {
        this.borrowDetailDtos = borrowDetailDtos;
    }
    
    
}
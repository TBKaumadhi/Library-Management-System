/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.lms.dto;

import java.util.Date;

/**
 *
 * @author USER
 */
public class MemberDto {
    private String memberId;
    private String name;
    private Date dob;
    private String address;
    private String contact;
    private Date membershipDate;
    private String userId;

    public MemberDto() {
    }

    
    public MemberDto(String memberId, String name, Date dob, String address, String contact,
            Date membershipDate, String userId) {
        this.memberId = memberId;
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.contact = contact;
        this.membershipDate = membershipDate;
        this.userId = userId;
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the dob
     */
    public Date getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(Date dob) {
        this.dob = dob;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the contact
     */
    public String getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * @return the membershipDate
     */
    public Date getMembershipDate() {
        return membershipDate;
    }

    /**
     * @param membershipDate the membershipDate to set
     */
    public void setMembershipDate(Date membershipDate) {
        this.membershipDate = membershipDate;
    }

    /**
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    
}

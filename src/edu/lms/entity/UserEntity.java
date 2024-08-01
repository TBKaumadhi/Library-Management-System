/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.lms.entity;

/**
 *
 * @author USER
 */
public class UserEntity {
    private String userName;
        
    private String secQ;  //
    private String answer;
    private String password;

    public UserEntity() {
    }

   
    public UserEntity( String userName,String secQ,String answer,  String password) {
       
        this.userName = userName;
        this.password = password;         
        this.answer=answer;
        this.secQ=secQ;
       
        
    }
    /**
     * @return the userName
     */
     public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the secQ
     */
    public String getSecQ() {
        return secQ;
    }

    /**
     * @param secQ the secQ to set
     */
    public void setSecQ(String secQ) {
        this.secQ = secQ;
    }

    /**
     * @return the answer
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * @param answer the answer to set
     */
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    
} 
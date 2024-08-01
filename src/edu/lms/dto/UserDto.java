/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.lms.dto;

/**
 *
 * @author USER
 */
public class UserDto {
    
    private String userName;
    private String password;
    private String secQ;
    private String answer;
   

    public UserDto() {
    }

   
    public UserDto( String userName, String secQ, String answer, String password) {
       
        this.userName = userName;
        this.password = password;
        this.secQ =   secQ;
        this.answer = answer;
        
       
       
    }
    
    public void setSecQ(String secQ){
      this.secQ =  secQ;  
 }
    public String getSecQ(){
        return secQ;
    }
    
    public void setAnswer(String answer){
      this.answer =  answer;  
 }
    public String getAnswer(){
        return answer;
    }
    
    /**
     * @return the userId
     */
    /*public String getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
   /* public void setUserId(String userId) {
        this.userId = userId;
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

    
    

    
        
}

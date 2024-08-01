/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.lms.service;
import edu.lms.service.SuperService;
import edu.lms.service.custom.impl.BookServiceImpl;
import edu.lms.service.custom.impl.BorrowServiceImpl;
import edu.lms.service.custom.impl.CategoryServiceImpl;
import edu.lms.service.custom.impl.LoginServiceImpl;
import edu.lms.service.custom.impl.MemberDetailServiceImpl;
import edu.lms.service.custom.impl.MemberServiceImpl;
import edu.lms.service.custom.impl.RegisterServiceImpl;
import edu.lms.service.custom.impl.ResetServiceImpl;
/**
 *
 * @author USER
 */
//singleton class ServiceFactory
public class ServiceFactory {
    private static ServiceFactory serviceFactory;
    
    private ServiceFactory(){
     }
    public static ServiceFactory getInstance(){
         if(serviceFactory== null){
            serviceFactory = new ServiceFactory();
        }
         return serviceFactory;
    }
    public SuperService getService(ServiceType serviceType){
        switch(serviceType){
            case REGISTER:
                return new RegisterServiceImpl();
            case LOGIN: 
                return new LoginServiceImpl();
            case RESET:
                return new ResetServiceImpl();
            case MEMBER:
                return new MemberServiceImpl();
            case BOOK:
                return new BookServiceImpl();
            case BORROW:
                return new BorrowServiceImpl(); 
            case CATEGORY:
                return new CategoryServiceImpl();
            case MEMBERDETAIL:
                return new MemberDetailServiceImpl();
            
            default :
                return null;
        }
    }
    public enum ServiceType{
        LOGIN,REGISTER,RESET,MEMBER,BOOK,CATEGORY,BORROW,RETURN,MEMBERDETAIL;
    }
}

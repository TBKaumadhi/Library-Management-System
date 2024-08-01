/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.lms.dao;


import edu.lms.dao.custom.impl.BookDaoImpl;
import edu.lms.dao.custom.impl.BorrowDaoImpl;
import edu.lms.dao.custom.impl.BorrowDetailDaoImpl;
import edu.lms.dao.custom.impl.CategoryDaoImpl;
import edu.lms.dao.custom.impl.LoginDaoImpl;
import edu.lms.dao.custom.impl.MemberDaoImpl;
import edu.lms.dao.custom.impl.MemberDetailDaoImpl;
import edu.lms.dao.custom.impl.RegisterDaoImpl;
import edu.lms.dao.custom.impl.ResetDaoImpl;


/**
 *
 * @author USER
 */
public class DaoFactory {
    private static DaoFactory daoFactory;
    
    private DaoFactory(){
        
    }
    public static DaoFactory getInstance(){
        if (daoFactory == null){
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }
    public SuperDao getDao(DaoType daoType){
        switch(daoType){
            case REGISTER:
           return new RegisterDaoImpl(); 
            case LOGIN:
           return new LoginDaoImpl();
            case RESET:
           return new ResetDaoImpl();
            case MEMBER:
           return new MemberDaoImpl(); 
             case BOOK:
           return new BookDaoImpl(); 
             case CATEGORY:
           return new CategoryDaoImpl(); 
             case BORROW:
           return new BorrowDaoImpl();
             case BORROW_DETAIL:
           return new BorrowDetailDaoImpl();
             case MEMBERDETAIL:
           return new MemberDetailDaoImpl();
                    
            default :
        return null;
    }
 }
    public static enum DaoType{
        REGISTER,LOGIN,RESET,MEMBER,USER,BOOK,CATEGORY,BORROW,BORROW_DETAIL,RETURN,MEMBERDETAIL;
    }
}

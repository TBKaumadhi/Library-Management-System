/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.lms.service.custom.impl;


import edu.lms.dao.custom.BorrowDao;
import edu.lms.dto.BorrowDto;
import edu.lms.service.custom.BorrowService;
import edu.lms.dao.DaoFactory;
import edu.lms.dao.custom.BookDao;
import edu.lms.dao.custom.BorrowDetailDao;
import edu.lms.db.DBConnection;
import edu.lms.dto.BorrowDetailDto;
import edu.lms.entity.BookEntity;
import edu.lms.entity.BorrowDetailEntity;
import edu.lms.entity.BorrowDetailsWrapper;
import edu.lms.entity.BorrowEntity;
import java.sql.Connection;


/**
 *
 * @author USER
 */
public class BorrowServiceImpl implements BorrowService{

    private BorrowDao borrowDao= (BorrowDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.BORROW);
    private BorrowDetailDao borrowDetailDao= (BorrowDetailDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.BORROW_DETAIL);
    private BookDao bookDao = (BookDao)DaoFactory.getInstance().getDao(DaoFactory.DaoType.BOOK);
    
    @Override
    public String issueBook(BorrowDto dto) throws Exception {
        Connection connection =  DBConnection.getInstance().getConnection();
    
        try{
            connection.setAutoCommit(false);
            BorrowEntity borrowEntity = new BorrowEntity(dto.getId(),dto.getMemberId(),dto.getBorrowDate(),dto.getDueDate());
            if( borrowDao.create(borrowEntity)){
                boolean isBorrowDetailsaved = true;
                
                for(BorrowDetailDto detailDtos: dto.getBorrowDetailDtos() ){
                    BorrowDetailEntity BorrowDetailEntitys = new BorrowDetailEntity(detailDtos.getBorrowId(),
                    detailDtos.getBookId(),detailDtos.getReturnDate(),detailDtos.getQty(),detailDtos.getFines());
                    
                    if( ! borrowDetailDao.create(BorrowDetailEntitys)){
                        isBorrowDetailsaved =false;
                    }
                }
                if( isBorrowDetailsaved){
                    boolean isBookUpdated = true;
                    for(BorrowDetailDto detailDtos: dto.getBorrowDetailDtos()){
                        BookEntity bookEntity = bookDao.get(detailDtos.getBookId());
                        if(bookEntity !=null){
                            bookEntity.setCopies(bookEntity.getCopies()-detailDtos.getQty());
                            if( ! bookDao.update(bookEntity)){
                                isBookUpdated = false;
                            }
                        }
                    }
                    if(isBookUpdated){
                        connection.commit();
                        return "Success";
                    
                    }else{
                    connection.rollback();
                    return "Error at book updating";
                }
                }else{
                    connection.rollback();
                    return "Error at borrowdetail save";
                }                   
                  
            }else{
                connection.rollback();
                return "Error at issue book ";
            }
            
        }catch(Exception e){
            connection.rollback();
            e.printStackTrace();
            throw e;
            
        }finally{
            connection.setAutoCommit(true);
        }
    }

     public String returnBook(BorrowDetailDto detailDto) throws Exception{
         Connection connection =  DBConnection.getInstance().getConnection();
         
         try{
             connection.setAutoCommit(false);
             BorrowDetailEntity detailEntitys = new BorrowDetailEntity(detailDto.getBorrowId(),detailDto.getBookId(),
             detailDto.getReturnDate(),detailDto.getQty(),detailDto.getFines());
             if( borrowDetailDao.update(detailEntitys)){
                boolean isBookUpdated = true;
                   
                        BookEntity bookEntity = bookDao.get(detailDto.getBookId());
                        if(bookEntity !=null){
                            bookEntity.setCopies(bookEntity.getCopies()+detailDto.getQty());
                            if( !bookDao.update(bookEntity)){
                                isBookUpdated = false;
                            }
                        }
                    //}
            
                    if(isBookUpdated){
                        return "Success";
                    }else{
                        connection.rollback();
                        return "Error at updating books";
                    }
             }
             else{
                 connection.rollback();
                 return "Error at returning book";
             }
         }catch(Exception e){
            connection.rollback();
            e.printStackTrace();
            throw e;
         }finally{
             connection.setAutoCommit(true);
         }
    }
     
      
    @Override
        public BorrowDetailsWrapper getBorrowDetails(String borrowId) throws Exception{
        return borrowDao.getDetails(borrowId);
    }     
               
      
   

    
}
    

    


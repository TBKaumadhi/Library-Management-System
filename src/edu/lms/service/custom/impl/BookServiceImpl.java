/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.lms.service.custom.impl;

import edu.lms.dto.BookDto;
import edu.lms.service.custom.BookService;
import edu.lms.dao.DaoFactory;
import edu.lms.dao.custom.BookDao;
import edu.lms.entity.BookEntity;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class BookServiceImpl implements BookService{
    private BookDao bookDao = (BookDao)DaoFactory.getInstance().getDao(DaoFactory.DaoType.BOOK);
    
    @Override
    public String save(BookDto dto) throws Exception {
        BookEntity entity= getBookEntity(dto);
        return bookDao.create(entity) ? "Success":"Fail";     
    }

    @Override
    public String update(BookDto dto) throws Exception {
    BookEntity entity= getBookEntity(dto);
        return bookDao.update(entity) ? "Success":"Fail";     
    }

    @Override
    public String delete(String id) throws Exception {
          return bookDao.delete(id)?"Success":"Fail";
    }

    @Override
    public ArrayList<BookDto> getAll() throws Exception {
       ArrayList<BookEntity> bookEntitys = bookDao.getAll();
        
        if(bookEntitys != null && ! bookEntitys.isEmpty()){
            ArrayList<BookDto> bookDtos = new ArrayList<>();
            
            for(BookEntity entity: bookEntitys){
                bookDtos.add(getBookDto(entity));
            }
            return bookDtos;
        }
        return null;
    }

    @Override
    public BookDto get(String id) throws Exception {
       BookEntity entity= bookDao.get(id);
       
       if(entity!= null){
           return getBookDto(entity);
       }
       return null;
    }
    
    private BookEntity getBookEntity(BookDto bookDto){       
        return  new BookEntity(
                bookDto.getBookId(),
                bookDto.getTitle(), 
                bookDto.getCategoryId(),                 
                bookDto.getAuthor(),
                bookDto.getIsbn(),
                bookDto.getCopies()
                );
    }
     private BookDto getBookDto(BookEntity bookEntity){
        return new  BookDto(        
            bookEntity.getBookId(),
            bookEntity.getTitle(),
            bookEntity.getCategoryId(),
            bookEntity.getAuthor(),
            bookEntity.getIsbn(),
            bookEntity.getCopies()
                    );
     }
}

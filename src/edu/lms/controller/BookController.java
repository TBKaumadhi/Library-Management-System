/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.lms.controller;

import edu.lms.dto.BookDto;
import edu.lms.service.custom.BookService;
import edu.lms.service.ServiceFactory;
import java.util.ArrayList;


/**
 *
 * @author USER
 */
public class BookController {

    private BookService bookService = (BookService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.BOOK);
            
    public String save(BookDto dto) throws Exception {
        return bookService.save(dto);
    }

    public ArrayList <BookDto> getAll() throws Exception{
        return bookService.getAll();
    }

    public String update(BookDto dto) throws Exception{
        return bookService.update(dto);
    }

    public String delete(String id) throws Exception {
         return bookService.delete(id);
    }

    public BookDto get(String id)throws Exception {
        return bookService.get(id);
    }
    
}

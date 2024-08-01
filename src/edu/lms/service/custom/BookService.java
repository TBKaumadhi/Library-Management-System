/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.lms.service.custom;

import edu.lms.dto.BookDto;
import edu.lms.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public interface BookService extends SuperService {

    String save (BookDto dto) throws Exception;
    String update(BookDto dto)throws Exception;

    String delete(String id)throws Exception;
    ArrayList<BookDto> getAll()throws Exception;
    BookDto get(String id)throws Exception;
    
}

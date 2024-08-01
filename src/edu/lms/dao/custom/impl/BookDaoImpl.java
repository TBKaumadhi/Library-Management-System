/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.lms.dao.custom.impl;

import edu.lms.dao.CrudUtil;
import edu.lms.dao.custom.BookDao;
import edu.lms.entity.BookEntity;
import java.sql.ResultSet;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class BookDaoImpl implements BookDao{

    @Override
    public boolean create(BookEntity t) throws Exception {
         return CrudUtil.executeUpdate("INSERT INTO Books VALUES (?,?,?,?,?,?)", t.getBookId(),
                 t.getTitle(),t.getCategoryId(),t.getAuthor(),t.getIsbn(),t.getCopies());
    }

    @Override
    public boolean update(BookEntity  t) throws Exception {
         return CrudUtil.executeUpdate("UPDATE Books SET title=?, categoryId=? ,author=?, isbn=?,copies=? WHERE bookId= ?" ,
                 t.getTitle(),t.getCategoryId(),t.getAuthor(),t.getIsbn(),t.getCopies(),t.getBookId());
    }

    @Override
    public boolean delete(String id) throws Exception {
       return CrudUtil.executeUpdate("DELETE FROM Books WHERE bookId=?", id);
    }

    @Override
    public BookEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Books WHERE bookId=?", id);
        if(rst.next()){
            BookEntity entity= new BookEntity(
                    rst.getString("bookId"),rst.getString("title"),rst.getString("categoryId"),rst.getString("author"),
                    rst.getString("isbn"),rst.getInt("copies"));
        return entity;
        }return null;
    }

    @Override
    public ArrayList<BookEntity > getAll() throws Exception {
        ArrayList <BookEntity> bookEntitys = new ArrayList<>();
        
         ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Books");
         while (rst.next()){
             BookEntity entity = new BookEntity(
               rst.getString("bookId"),rst.getString("title"),rst.getString("categoryId"),rst.getString("author"),
                    rst.getString("isbn"),rst.getInt("copies"));
             
             bookEntitys.add(entity);
            
         } return bookEntitys;
    }

    
}

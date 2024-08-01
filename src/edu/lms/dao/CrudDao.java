/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.lms.dao;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public interface CrudDao <T,ID> extends SuperDao{
   
    T get(ID id) throws Exception;
    boolean create(T entity) throws Exception;
    boolean update(T entity) throws Exception;
    boolean delete(ID id) throws Exception;
    ArrayList<T> getAll() throws Exception;

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.lms.dao.custom.impl;

import edu.lms.dao.CrudUtil;
import edu.lms.dao.custom.RegisterDao;
import edu.lms.entity.RegisterEntity;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class RegisterDaoImpl implements RegisterDao{

    @Override
    public boolean create(RegisterEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Users VALUES (?,?,?,?,?,?,?)", t.getUserId(),t.getUserName(),t.getPassword(),
        t.getEmail(),t.getRole(),t.getSecQuestion(),t.getAnswer());
    }

    
    @Override
    public boolean delete(String id) throws Exception {
        return false;
    }

    @Override
    public RegisterEntity get(String id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<RegisterEntity> getAll() throws Exception {
       return null;
    }

    @Override
    public boolean update(RegisterEntity t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

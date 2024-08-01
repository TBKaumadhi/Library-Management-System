/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.lms.dao.custom.impl;

import edu.lms.dao.CrudUtil;
import edu.lms.dao.custom.MemberDao;
import edu.lms.entity.MemberEntity;
import java.util.ArrayList;
import java.sql.ResultSet;
/**
 *
 * @author USER
 */
public class MemberDaoImpl implements MemberDao{

    @Override
    public boolean create(MemberEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Members VALUES (?,?,?,?,?,?,?)", 
                t.getMemberId(),t.getName(),t.getDob(),t.getAddress(),t.getContact(),t.getMembershipDate(),t.getUserId());
        }

    @Override
    public boolean update(MemberEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE Members SET name=?,DOB=?, address=?,contact=?,membershipdate=?,userId=? WHERE memberId=?", 
                t.getName(),t.getDob(),t.getAddress(),t.getContact(),t.getMembershipDate(),t.getUserId(),t.getMemberId());
        }
    

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM Members WHERE memberId=?", id);
        
    }

    @Override
    public MemberEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROMMembers WHERE memberId=?", id);
        if(rst.next()){
            MemberEntity entity= new MemberEntity(
                    rst.getString("memberId"),rst.getString("name"),rst.getDate("DOB"),rst.getString("address"),rst.getString("contact"),
                    rst.getDate("membershipdate"),rst.getString("userId"));
        return entity;
        }return null;
    } 

    @Override
    public ArrayList<MemberEntity> getAll() throws Exception {
        
        ArrayList <MemberEntity> memberEntitys = new ArrayList<>();
        
         ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Members");
         while (rst.next()){
             MemberEntity entity = new MemberEntity(
              rst.getString("memberId"),rst.getString("name"),rst.getDate("DOB"),rst.getString("address"),rst.getString("contact"),
                    rst.getDate("membershipdate"),rst.getString("userId"));
             
             memberEntitys.add(entity);
            
         } return memberEntitys;
    }
    
}

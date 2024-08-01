/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.lms.db;

/**
 *
 * @author USER
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {

    private static DBConnection dBConnection;
    private final Connection connection;

    private DBConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Library", "root", "0123");
    }

    public static DBConnection getInstance() throws ClassNotFoundException, SQLException{
        if(dBConnection == null){
            dBConnection = new DBConnection();
        }
        return dBConnection;
    }

    public Connection getConnection(){
        return connection;
    }

}
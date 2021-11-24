/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author hansherrera
 */

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnController {
    
    String url, dbName, username, password;
    
    Connection dbConn;
    Connection userConn;
    
    Statement addUserStmt;
    String addUserQuery;
    
    public ConnController(){
        
        url = "jdbc:mysql://127.0.0.1:3306/";
        dbName = "thesisFishTest";
        username = "root";
        password = "";
        dbConn = null;
    }
    
    public Connection getConnection(){
        try{
            System.out.println("Connecting to the DB");
            dbConn = DriverManager.getConnection(url+dbName, username, password);
            //Statement query = (Statement) dbConn.createStatement();
            //query.executeUpdate("INSERT INTO javaTable(firstName, lastName) VALUES ('java"+value+"', 'jones')");
            
            //data = query.executeQuery("select * from javaTable");
            //printData(data);
            System.out.println("Established connection");
            /*
            NOTE:
            query.executeUpdate(String sql) executes a given SQL statement which
            can be CREATE, READ, UPDATE, or DELETE
            
            query.executeQuery(String sql) executes the given SQL statement which
            returns a single ResultSet object
            */
            
//            Thread.sleep(10000);    // waits for 10 seconds
            
//            dbConn.close();
//            System.out.println("Closed connection");
        } catch (SQLException ex){
            Logger.getLogger(TestMySQLConn.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return dbConn;
    }
    
    public void addUser(String firstName, String lastName, String email){
        
        try{
            userConn = getConnection();
            
            Statement addUserStatement = userConn.createStatement();
            addUserQuery = "INSERT INTO userDB(firstName,lastName,email) VALUES ('" + firstName + "','" + lastName + "','" + email + "')";
            
            System.out.println("Statement created");
            
            // this code below works
            //query.executeUpdate("INSERT INTO userDB(firstName,lastName,email) VALUES ('John','Cena','john@email.com')");
            
            addUserStatement.executeUpdate(addUserQuery);
            
            System.out.println("User successfully added!");
            
        }catch (SQLException e){
            Logger.getLogger(TestMySQLConn.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}

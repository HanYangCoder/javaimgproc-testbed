/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.sql.*;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hansherrera
 */
public class TestMySQLConn {
    
    private static ResultSet data = null;
    
    public static void main(String[] args){
        connection();
    }
    
    private static void connection(){
        
        Random random = new Random();
        int value = random.nextInt(50);
        
        System.out.println("MySQL CRUD Example");
        String url = "jdbc:mysql://127.0.0.1:3306/";
        String dbName = "thesisFishTest";
        String username = "root";
        String password = "";
        Connection db = null;
        
        try{
            System.out.println("Connected to the DB");
            db = DriverManager.getConnection(url+dbName, username, password);
            Statement query = (Statement) db.createStatement();
            query.executeUpdate("INSERT INTO javaTable(firstName, lastName) VALUES ('java"+value+"', 'jones')");
            
            data = query.executeQuery("select * from javaTable");
            printData(data);
            
            db.close();
            System.out.println("Closed connection");
        } catch (SQLException ex){
            Logger.getLogger(TestMySQLConn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private static void printData(ResultSet data) throws SQLException{
        
        System.out.println("Now here are the names on the table");
        System.out.println("************************************");
        System.out.println("************************************");
        System.out.println("************************************");
        System.out.println("************************************");
        
        while (data.next())
        {
            int id = data.getInt("id");
            String firstName = data.getString("firstName");
            String lastName = data.getString("lastName");
            
            System.out.println("ID: " + id);
            System.out.println("FirstName: " + firstName);
            System.out.println("LastName: " + lastName);
            System.out.println("************************************");
            System.out.println("************************************");
            System.out.println("************************************");
        }
    }
}

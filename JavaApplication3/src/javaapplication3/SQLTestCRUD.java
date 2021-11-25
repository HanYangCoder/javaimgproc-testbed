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

public class SQLTestCRUD {
    
    public static void main(String[] args) throws InterruptedException{
        
//        ConnController newConnection = new ConnController();
//        
//        newConnection.getConnection();
//        newConnection.addUser("Makoto", "Shinkai", "makotoshinkai@gmail.com");
        
        UserDBController newUser = new UserDBController();
        newUser.userLogin(1, "password");
        //newUser.createUser("Makoto", "Shinkai", "abc123", "555-5555", "example2@email.com", "Tokyo, Japan");
        newUser.updateUser(3, "John", "Cena", "password", "696969", "john@email.com", "Chicago, USA");
        ResultSet usersList = newUser.getUserList();
        newUser.deleteUser(2);
    }
}
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

public class UserDBController {
    
    Connection userConn;
    Statement userStmt;
    
    String addUserSQL;
    String getUsersSQL;
    String updateUserSQL;
    String deleteUserSQL;
    
    public static ConnController dbConn = new ConnController();
    
    public UserDBController(){
        
    }
    
    public void createUser(String firstName, String lastName, String email){
        
        try{
            userConn = dbConn.getConnection();
            
            Statement addUserStatement = userConn.createStatement();
            addUserSQL = "INSERT INTO userDB(firstName,lastName,email) VALUES ('" + firstName + "','" + lastName + "','" + email + "')";
            
            addUserStatement.executeUpdate(addUserSQL);
            
            System.out.println("User successfully added!");
            
        }catch (SQLException e){
            Logger.getLogger(TestMySQLConn.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public ResultSet getUserList(){
        
        ResultSet usersList = null;
        
        try {
            getUsersSQL = "SELECT * FROM userDB";
            usersList = userStmt.executeQuery(getUsersSQL);
        } catch (SQLException ex) {
            Logger.getLogger(UserDBController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return usersList;
    }
    
    public boolean userLogin(String userID, String password){
        //---------------------------WORK ON THIS LATER ON DO NOT FORGET------------------
        return true;
    }
    
    public void updateUser(int userID, String firstName, String lastName, String email){
        
        try {
            updateUserSQL = "UPDATE userDB SET firstName='"+firstName+"',lastName='"+lastName+"',email='"+email+"' WHERE userID="+userID+"";
            userStmt.executeQuery(updateUserSQL);
            System.out.println("Successfully updated user profile!");
        } catch (SQLException ex) {
            Logger.getLogger(UserDBController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String deleteUser(int userID){
        
        try {
            deleteUserSQL = "DELETE FROM userDB WHERE userID="+userID+"";
            userStmt.executeUpdate(deleteUserSQL);
        } catch (SQLException ex) {
            Logger.getLogger(UserDBController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "User #"+userID+" has been removed from the users list.";
    }
}

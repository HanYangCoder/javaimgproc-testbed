/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication54;

/**
 *
 * @author hansherrera
 */


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserDBController {
    
    private Connection userConn;
    private Statement userStmt;
    private String addUserSQL, getUsersSQL, updateUserSQL, deleteUserSQL, userLoginSQL;
    
    private static ConnController dbConn = new ConnController();
    
    public UserDBController(){
        
    }
        
    public boolean userLogin(int userID, String password){
        
        String u1 = null, p1 = null;
        boolean userLogin = false;
        
        try {
            userConn = dbConn.getConnection();
            userStmt = userConn.createStatement();
            
            userLoginSQL = "SELECT * FROM userDB WHERE userID = " + userID;
            ResultSet user = userStmt.executeQuery(userLoginSQL);
            
            while(user.next()){
                u1 = user.getString("userID");
                p1 = user.getString("password");
            }
            
            if(String.valueOf(userID).equals(u1) && password.equals(p1))
            {
                System.out.println("Login successful");
                userLogin = true;
            } else{
                System.out.println("Login failed");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(UserDBController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Closes the  connection
        finally {
          try {
            if (userConn != null) userConn.close();       
          }
          catch (SQLException e) {
              System.out.println(e);
          }
        }
        
        return userLogin;
    }
    
    public void createUser(String firstName, String lastName, String password, String contactNum, String email, String address){
        
        try{
            userConn = dbConn.getConnection();
            userStmt = userConn.createStatement();
            
            Statement addUserStatement = userConn.createStatement();
            addUserSQL = "INSERT INTO userDB(firstName,lastName,password,contactNum,email,address) VALUES "
                    + "('" + firstName + "','" + lastName + "','" + password + "','" + contactNum + "','" + email + "','" + address + "')";
            
            addUserStatement.executeUpdate(addUserSQL);
            
            System.out.println("User successfully added!");
            
        }catch (SQLException e){
            
        }
        
        //Closes the  connection
        finally {
          try {
            if (userConn != null) userConn.close();       
          }
          catch (SQLException e) {
              System.out.println(e);
          }
        }
    }
    
    public ResultSet getUserList(){
        
        ResultSet usersList = null;
        
        try {
            userConn = dbConn.getConnection();
            userStmt = userConn.createStatement();
            
            getUsersSQL = "SELECT * FROM userDB";
            usersList = userStmt.executeQuery(getUsersSQL);
            System.out.println("Successfully retrieved user list");
            
        } catch (SQLException ex) {
            Logger.getLogger(UserDBController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Closes the  connection
        finally {
          try {
            if (userConn != null) userConn.close();       
          }
          catch (SQLException e) {
              System.out.println(e);
          }
        }
        
        return usersList;
    }

    public void updateUser(int userID, String firstName, String lastName, String password, String contactNum, String email, String address){
        
        try {
            userConn = dbConn.getConnection();
            userStmt = userConn.createStatement();
            
            updateUserSQL = "UPDATE userDB SET "
                    + "firstName='"+firstName+"',lastName='"+lastName+"',"
                    + "password='"+password+"',contactNum='"+contactNum+"',email='"+email+"',password='"+address+"' "
                    + "WHERE userID="+userID+"";
            userStmt.executeUpdate(updateUserSQL);
            System.out.println("Successfully updated user profile!");
        } catch (SQLException ex) {
            Logger.getLogger(UserDBController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Closes the  connection
        finally {
          try {
            if (userConn != null) userConn.close();       
          }
          catch (SQLException e) {
              System.out.println(e);
          }
        }
    }
    
    public String deleteUser(int userID){
        
        try {
            userConn = dbConn.getConnection();
            userStmt = userConn.createStatement();
            
            deleteUserSQL = "DELETE FROM userDB WHERE userID="+userID+"";
            userStmt.executeUpdate(deleteUserSQL);
        } catch (SQLException ex) {
            Logger.getLogger(UserDBController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Closes the  connection
        finally {
          try {
            if (userConn != null) userConn.close();       
          }
          catch (SQLException e) {
              System.out.println(e);
          }
        }
        
        return "User #"+userID+" has been removed from the users list.";
    }
}

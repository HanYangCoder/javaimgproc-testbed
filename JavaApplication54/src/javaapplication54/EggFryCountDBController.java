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

public class EggFryCountDBController {
    
    private Connection eggFryConn;
    private Statement eggFryStmt;
    private String createEntrySQL, getEntriesSQL, updateEntrySQL, deleteEntrySQL;
    
    private static ConnController dbConn = new ConnController();
    
    public EggFryCountDBController(){
        
    }
    
    // to test
    public void createEggCountEntry(int noOfEggsInMicro, int noOfEggsInTank, 
            String testDate, String testTime, int hatchTankNum, String eggImage, int userID){
        try {
            eggFryConn = dbConn.getConnection();
            eggFryStmt = eggFryConn.createStatement();
            
            // code here
            createEntrySQL = "INSERT INTO `EggImgCountDB`(`noOfEggsInMirco`, `noOfEggsInTank`, "
                    + "`testDate`, `testTime`, `hatchTankNum`, `eggImage`, `userID`) VALUES "
                    + "('"+noOfEggsInMicro+"','"+noOfEggsInTank+"','"+testDate+"','"+testTime+"','"+hatchTankNum+"',"
                    + "'"+eggImage+"','"+userID+"')";
            
            eggFryStmt.executeUpdate(createEntrySQL);
            System.out.println("Egg count entry successfully added!");
            
        } catch (SQLException ex) {
            Logger.getLogger(UserDBController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Closes the  connection
        finally {
          try {
            if (eggFryConn != null) eggFryConn.close();       
          }
          catch (SQLException e) {
              System.out.println(e);
          }
        }
    }
    
    // to test
    public void createFryCountEntry(int noOfFriesInTank, int survivalRate, String testDate, 
            String testTime, int hatchTankNum, String fryImage, int eggTestID, int userID){
        try {
            eggFryConn = dbConn.getConnection();
            eggFryStmt = eggFryConn.createStatement();
            
            // code here
            createEntrySQL = "INSERT INTO `FryImgCountDB`(`noOfFriesInTank`, `survivalRate`, "
                    + "`testDate`, `testTime`, `hatchTankNum`,`fryImage`, `eggTestID`, `userID`) VALUES "
                    + "('"+noOfFriesInTank+"','"+survivalRate+"','"+testDate+"','"+testTime+"','"+hatchTankNum+"',"
                    + "'"+fryImage+"','"+eggTestID+"','"+userID+"')";
            
            eggFryStmt.executeUpdate(createEntrySQL);
            System.out.println("Fry count entry successfully added!");
            
        } catch (SQLException ex) {
            Logger.getLogger(UserDBController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Closes the  connection
        finally {
          try {
            if (eggFryConn != null) eggFryConn.close();       
          }
          catch (SQLException e) {
              System.out.println(e);
          }
        }
    }
    
    // to test
    public ResultSet getEggCountEntries(){
        
        ResultSet eggCountList = null;
        try {
            eggFryConn = dbConn.getConnection();
            eggFryStmt = eggFryConn.createStatement();
            
            // code here
            getEntriesSQL = "SELECT * FROM EggImgCountDB";
            eggCountList = eggFryStmt.executeQuery(getEntriesSQL);
            System.out.println("Successfully retrieved egg count records.");
            
        } catch (SQLException ex) {
            Logger.getLogger(UserDBController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Closes the  connection
        finally {
          try {
            if (eggFryConn != null) eggFryConn.close();       
          }
          catch (SQLException e) {
              System.out.println(e);
          }
        }
        
        return eggCountList;
    }
    
    // to test
    public ResultSet getFryCountEntries(){
        
        ResultSet fryCountList = null;
        try {
            eggFryConn = dbConn.getConnection();
            eggFryStmt = eggFryConn.createStatement();
            
            // code here
            getEntriesSQL = "SELECT * FROM FryImgCountDB";
            fryCountList = eggFryStmt.executeQuery(getEntriesSQL);
            System.out.println("Successfully retrieved fry count records.");
            
        } catch (SQLException ex) {
            Logger.getLogger(UserDBController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Closes the  connection
        finally {
          try {
            if (eggFryConn != null) eggFryConn.close();       
          }
          catch (SQLException e) {
              System.out.println(e);
          }
        }
        
        return fryCountList;
    }
    
    // to test
    public void updateEggCountEntry(int eggTestID, int noOfEggsInMicro, int noOfEggsInTank, 
            String testDate, String testTime, int hatchTankNum, String eggImage, int userID){
        try {
            eggFryConn = dbConn.getConnection();
            eggFryStmt = eggFryConn.createStatement();
            
            // code here
            updateEntrySQL = "UPDATE `EggImgCountDB` SET `noOfEggsInMirco`='"+noOfEggsInMicro+"',"
                    + "`noOfEggsInTank`='"+noOfEggsInTank+"',`testDate`='"+testDate+"',`testTime`='"+testTime+"',`hatchTankNum`='"+hatchTankNum+"',"
                    + "`eggImage`='"+eggImage+"',`userID`='"+userID+"' WHERE eggTestID ="+eggTestID;
            
            eggFryStmt.executeUpdate(updateEntrySQL);
            System.out.println("Successfully updated egg count entry");
            
        } catch (SQLException ex) {
            Logger.getLogger(UserDBController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Closes the  connection
        finally {
          try {
            if (eggFryConn != null) eggFryConn.close();       
          }
          catch (SQLException e) {
              System.out.println(e);
          }
        }
    }
    
    // to test
    public void updateFryCountEntry(int fryTestID, int noOfFriesInTank, int survivalRate, String testDate, 
            String testTime, int hatchTankNum, String fryImage, int eggTestID, int userID){
        try {
            eggFryConn = dbConn.getConnection();
            eggFryStmt = eggFryConn.createStatement();
            
            // code here
            updateEntrySQL = "UPDATE `FryImgCountDB` SET `noOfFriesInTank`='"+noOfFriesInTank+"',`survivalRate`='"+survivalRate+"',"
                    + "`testDate`='"+testDate+"',`testTime`='"+testTime+"',`hatchTankNum`='"+hatchTankNum+"',"
                    + "`fryImage`='"+fryImage+"',`eggTestID`='"+eggTestID+"',`userID`='"+userID+"' WHERE fryTestID="+fryTestID;
            eggFryStmt.executeUpdate(updateEntrySQL);
            System.out.println("Successfully updated fry count entry");
            
        } catch (SQLException ex) {
            Logger.getLogger(UserDBController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Closes the  connection
        finally {
          try {
            if (eggFryConn != null) eggFryConn.close();       
          }
          catch (SQLException e) {
              System.out.println(e);
          }
        }
    }
    
    // to test
    public void deleteEggCountEntry(int eggTestID){
        try {
            eggFryConn = dbConn.getConnection();
            eggFryStmt = eggFryConn.createStatement();
            
            // code here
            deleteEntrySQL = "DELETE FROM `EggImgCountDB` WHERE eggTestID="+eggTestID;
            eggFryStmt.executeUpdate(deleteEntrySQL);
            System.out.println("Successfully deleted egg count entry#"+eggTestID);
            
        } catch (SQLException ex) {
            Logger.getLogger(UserDBController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Closes the  connection
        finally {
          try {
            if (eggFryConn != null) eggFryConn.close();       
          }
          catch (SQLException e) {
              System.out.println(e);
          }
        }
    }
    
    // to test
    public void deleteFryCountEntry(int fryTestID){
        try {
            eggFryConn = dbConn.getConnection();
            eggFryStmt = eggFryConn.createStatement();
            
            // code here
            deleteEntrySQL = "DELETE FROM `FryImgCountDB` WHERE eggTestID="+fryTestID;
            eggFryStmt.executeUpdate(deleteEntrySQL);
            System.out.println("Successfully deleted fry count entry#"+fryTestID);
            
        } catch (SQLException ex) {
            Logger.getLogger(UserDBController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Closes the  connection
        finally {
          try {
            if (eggFryConn != null) eggFryConn.close();       
          }
          catch (SQLException e) {
              System.out.println(e);
          }
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import database.DbConnection;
import model.*;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author puja
 */
public class UsersController {
      DbConnection dbconnection;
        public int updateUsers(String fname,String lname, String username, String phonenum){
//        String firstname = users.getFirstName();
//        String last_name = users.getLastName();
//        String phonenum = users.getPhoneNumber();
//        String Usernamee = users.getUsername();
        String updateQuery = String.format("UPDATE users SET first_name = '%s', lastname = '%s' , username = '%s' WHERE phonenumber = '%s'",fname,lname,username ,phonenum);
        dbconnection = new DbConnection();
        int result = dbconnection.manipulate(updateQuery);
        return result;
    }
        
        public Boolean loginUser(String username, String password) {
    String selectQuery = String.format(
      "select * from users where username = '%s' and userpassword = '%s' ",
      username,
      password
    );
    
          DbConnection dbConnection = new DbConnection();
    ResultSet rs = dbConnection.retrieve(selectQuery);
    System.out.println(rs);
    try {
      while (rs.next()) {
        String fetchedUserName = rs.getString("username");
        String fetchedPassword = rs.getString("userpassword");
        String fetchedid = rs.getString(Constraints.Constant.DB_USER_ID);    
        String fetchedfname = rs.getString("first_name");
        String fetchedlname = rs.getString("lastname");
        String fetchednumber = rs.getString("phonenumber");

        System.out.println(fetchedUserName + fetchedPassword);
        if (username.equals(fetchedUserName) && password.equals(fetchedPassword)) {
//            User loggedInUser = new User();
          return true;
        }
      }
    } catch (Exception e) {
      // TODO: handle exception
      System.out.println("Error");
      return false;
    }
    return false;
  }
        
        public int updatepass(String passw, String pnumber){
        String updateQuery = String.format("UPDATE users SET userpassword = '%s' WHERE phonenumber = '%s'", passw, pnumber);
        dbconnection = new DbConnection();
        int result = dbconnection.manipulate(updateQuery);
        return result;
    }
        
        public int validatePhone(String pnumb){
            
    String selectQuery = String.format(
      "select phonenumber from users ");
                  DbConnection dbConnection = new DbConnection();
                   ResultSet rs = dbConnection.retrieve(selectQuery);
                       try {
      while (rs.next()) {
        String fetchednumber = rs.getString(Constraints.Constant.DB_PHONE_NUMBER);
        if (pnumb.equals(fetchednumber)) {
          return 1;
        }
        else{
            JOptionPane.showMessageDialog(null,"Enter valid number.");
        return 0;
        }
      }
    } catch (Exception e) {
      // TODO: handle exception
      System.out.println("Error");
      return 0;
    }
      return 0;
        }
        public ResultSet viewprofile(String usern){
            String selectQuery = String.format(
      "select first_name,lastname, username , phonenumber from users where username = '%s'",
     
      usern
      
    );
            
            DbConnection dbConnection = new DbConnection();
                   ResultSet rs = dbConnection.retrieve(selectQuery);
//                   return 0;
                    try{
                        while(rs.next()){
                       return rs; 
                        }
                    } catch(SQLException ex) {ex.printStackTrace();}
                    return null;
//                    String fname= rs.getString("fname");
        }
        
        public int library(String uid, String bookid, String usern){
                    String selectQuery = String.format(
      "select userid from users where username = '%s'",
      
      usern
      
    );
//         insert into library userid
        } 
    
      
      public int registerUser(Users users){
        String firstname = users.getFirstName();
        String last_name = users.getLastName();
        String phonenum = users.getPhoneNumber();
        String username = users.getUsername();
        String password = users.getPassword();
        String cPassword = users.getconf_Password();
        dbconnection = new DbConnection();
        String insertQuery = String.format("INSERT INTO users(first_name,lastname,phonenumber,username,userpassword,confpassword) VALUES('%s','%s','%s','%s','%s','%s')",firstname,last_name,phonenum,username,password,cPassword);
          System.out.println(insertQuery);
        int result = dbconnection.manipulate(insertQuery);
        return result;
      }
       
}


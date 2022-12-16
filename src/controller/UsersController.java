/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import database.DbConnection;
import model.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class UsersController {
      DbConnection dbconnection;

      public int registerUser(Users users){
        String firstname = users.getFirstName();
        String last_name = users.getLastName();
        String phonenum = users.getPhoneNumber();
        String username = users.getUsername();
        String password = users.getPassword();
        String cPassword = users.getconf_Password();
        dbconnection = new DbConnection();
        String insertQuery = String.format("INSERT INTO Users(first_name,lastname,phonenumber,username,userpassword,confpassword) VALUES('%s','%s','%s','%s','%s','%s')",firstname,last_name,phonenum,username,password,cPassword);
        System.out.println(insertQuery);
        int result = dbconnection.manipulate(insertQuery);
        return result;
      }
      
       
       
}



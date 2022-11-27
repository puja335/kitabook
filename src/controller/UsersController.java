/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import database.DbConnection;
import model.*;
import java.sql.*;
/**
 *
 * @author puja
 */
public class UsersController {
      DbConnection dbConnection;
        public int updateUsers(Users users){
        String firstname = users.getFirstName();
        String last_name = users.getLastName();
        String phonenum = users.getPhoneNumber();
        String uaddress = users.getAddress();
        String updateQuery = String.format("UPDATE users SET first_name = '%s', lastname = '%s' , phonenumber = '%s', address = '%s' WHERE phonenumber = '%s'",firstname,last_name,phonenum,uaddress);
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(updateQuery);
        return result;
    }
        
        public Boolean loginUser(String username, String password) {
    String selectQuery = String.format(
      "select * from users where username = '%s' and userpassword = '%s' ",
      username,
      password
    );
    
    dbConnection = new DbConnection();
    ResultSet rs = dbConnection.retrieve(selectQuery);
    try {
      while (rs.next()) {
        String fetchedUserName = rs.getString("username");
        String fetchedPassword = rs.getString("userpassword");
        System.out.println(fetchedUserName + fetchedPassword);
        if (username.equals(fetchedUserName) && password.equals(fetchedPassword)) {
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
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import database.DbConnection;
import model.Users;
import Constraints.Constant.*;
/**
 *
 * @author Nihira Shrestha
 */
public class libraryController {
       DbConnection dbconnection;
       public int addToLibrary(){
//        String firstname = users.getFirstName()
        int uid = Constraints.Constant.loggedInUser.getUserId();
        dbconnection = new DbConnection();
        
        String insertQuery = String.format("INSERT INTO library(userid,book_id) VALUES('%d','%d')",uid);
          System.out.println(insertQuery);
        int result = dbconnection.manipulate(insertQuery);
        return result;
      }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import database.DbConnection;
/**
 *
 * @author Nihira Shrestha
 */
public class libraryController {
       DbConnection dbconnection;
       public int addToLibrary(int userid, int bookid){
//        String firstname = users.getFirstName()
        String uid = Constraints.constant.loggedInUser.getUserId();
        userid = Integer.parseInt(uid);
        dbconnection = new DbConnection();
        
        String insertQuery = String.format("INSERT INTO library(userid,book_id) VALUES('%d','%d')",userid);
          System.out.println(insertQuery);
        int result = dbconnection.manipulate(insertQuery);
        return result;
      }
}

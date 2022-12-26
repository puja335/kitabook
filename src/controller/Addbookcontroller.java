///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package controller;
//
///**
// *
// * @author raich
// */
//public class Addbookcontroller {
//    
//}

package controller;
import java.sql.*;

import javax.swing.SpringLayout.Constraints;

//import static Constraints.constant;
//import Database.Dbconnection;
import database.DbConnection;
import model.Addbook;
//import models.Student;
public class Addbookcontroller{
    DbConnection dbconnection;

    
    public int insertbook(Addbook book){
        int book_id = book.getBook_id();
        String book_name = book.getBook_name();
        String author = book.getAuthor();
        String gid = book.getgid();
        String pdf_link = book.getPdf_link();
        String more = book.getMore();
        String insertQuery = String.format ("INSERT INTO Addbook VAlUES(%d,'%s', '%s', '%s', '%s', '%s')",book_id,book_name,author,pdf_link, more,gid);
        System.out.println(insertQuery);
        dbconnection = new DbConnection();
        int result = dbconnection.manipulate(insertQuery); // manipulate in datavase
        return result;
    }

    public int updatebook(Addbook book){
        int book_id = book.getBook_id();
        String book_name = book.getBook_name();
        String author = book.getAuthor();
        String genre = book.getGenre();
        String pdf_link = book.getPdf_link();
        String more = book.getMore();
        String updateQuery = String.format ("UPDATE tbl_student SET where book_id=%d, book_name='%s', author= '%s', genre='%s', pdf_link= '%s', more= '%s' ",book_id,book_name,author, genre,pdf_link, more);
        dbconnection = new DbConnection();
        int result = dbconnection.manipulate(updateQuery);
        return result;
    }
    
    public Boolean bookdetails(){
        String selectQuery = String.format(
        "select * from Addbook"
        );
        DbConnection dbConnection = new DbConnection();
        ResultSet rs = dbConnection.retrieve(selectQuery);
        // try {
        // while (rs.next()) {
        //     String fetchedbookid = rs.getString(Constraints.Constant.DB_BOOK_ID);
        //     String fetchedbookname = rs.getString(Constraints.constant.DB_BOOK_NAME);
        //     String fetchedid = rs.getString(Constraints.Constant.DB_USER_ID);    
        //     String fetchedfname = rs.getString(Constraints.Constant.DB_USER_ID);
    //     //     String fetchedlname = rs.getString(Constraints.Constant.DB_USER_ID);
    //     //     String fetchednumber = rs.getString(Constraints.Constant.DB_USER_ID);

    //     // Constraints.constant.Books=new Addbook(fetchedid,fetchedbookname,fetchedlname,fetchednumber);
    // }}
    //     catch (Exception e) {
    //   // TODO: handle exception
    //   System.out.println("Error");
    //   return false;
    // }
    return false;
        
    

    
}}
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

import database.DbConnection;
import model.Addbook;
import Constraints.constant;
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
        String pdf_link = book.getPdf_link();
        String more = book.getMore();
        String updateQuery = String.format ("UPDATE tbl_student SET where book_id=%d, book_name='%s', author= '%s', pdf_link= '%s', more= '%s' ",book_id,book_name,author ,pdf_link, more);
        dbconnection = new DbConnection();
        int result = dbconnection.manipulate(updateQuery);
        return result;
    }
    
    public Boolean bookdetails(int book_id){
//        System.out.print(book_id);
        String selectQuery;
        selectQuery = String.format(
                "select book_name,author,more  from Addbook where book_id = %d",book_id
        );
        DbConnection dbConnection = new DbConnection();
        ResultSet rs = dbConnection.retrieve(selectQuery);
        try {
        while (rs.next()) {
            String fetchedbookname = rs.getString(Constraints.constant.DB_BOOK_NAME);
            String fetchedauthor = rs.getString(Constraints.constant.DB_AUTHOR);
            String fetchedmore = rs.getString(Constraints.constant.DB_MORE);
            Constraints.constant.selectedBooks=new Addbook( fetchedbookname,fetchedauthor,fetchedmore);
    }}
        catch (Exception e) {
      // TODO: handle exception
      System.out.println("Error");
    }
    return false;
        
    }
    public ResultSet fetchbook(){
        String selectQuery = String.format(
        "select book_id,book_name,author from Addbook"
        );
        DbConnection dbConnection = new DbConnection();
        ResultSet rs = dbConnection.retrieve(selectQuery);
        return rs;
                    
        }}
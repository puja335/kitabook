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
        String genre = book.getGenre();
        String pdf_link = book.getPdf_link();
        String more = book.getMore();
        String insertQuery = String.format ("INSERT INTO Addbook VAlUES(%d,'%s', '%s', '%s', '%s', '%s')",book_id,book_name,author, genre,pdf_link, more);
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

    
}
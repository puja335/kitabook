/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import database.DbConnection;
import model.Addbook;

/**
 *
 * @author binod
 */
public class RatingController {
    DbConnection dbconnection;
    
    public int insertRating(int bookId, int userId, int ratingNum){
        String insertQuery = String.format ("INSERT INTO rating_table(rating_count,book_id,user_id) VAlUES(%d,%d,%d)",ratingNum,bookId,userId);
        System.out.println(insertQuery);
        dbconnection = new DbConnection();
        int result = dbconnection.manipulate(insertQuery); // manipulate in datavase
        return result;
    }
}

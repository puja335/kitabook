/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author binod
 */
public class Rating {
    private int id;
    private int rating_count;
    private int book_id;
    private int user_id;
    
    public Rating(int id,int rating_count,int book_id,int user_id){
        this.id=id;
        this.rating_count=rating_count;
        this.book_id=book_id;
        this.user_id=user_id;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setRatingCount(int rating_count){
        this.rating_count=rating_count;
    }
    public int getRatingCount(){
        return rating_count;
    }
    public void setBookId(int book_id){
        this.book_id=book_id;
    }
    public int getBookId(){
        return book_id;
    }
    public void setUserId(int user_id){
        this.id=id;
    }
    public int getUserId(){
        return user_id;
    }
    
    
    
}

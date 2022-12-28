/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dell
 */
public class Library {
    private int bookid;
    private String book_name;
    private String author_name;
    
    
    public Library( int bookid, String book_name, String author_name){
        this.bookid = bookid;
        this.book_name = book_name;
        this.author_name = author_name;
    }    
    public void setBookId(int bookid){
        this.bookid = bookid;
    }    
        
    
    public void setBookName(String book_name){
        this.book_name = book_name;
    }
    public void setAuthorName(String author_name){
        this.author_name = author_name;
    }
    
    
   
    public String getBookName(){
        return this.book_name;
    }
    public String getAuthorName(){
        return this.author_name;
    } 
    public int getBookId(){
        return this.bookid;
    } 
   
    
}

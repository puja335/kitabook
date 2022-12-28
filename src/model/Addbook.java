///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package models;
//
///**
// *
// * @author raich
// */
//public class Addbook {
//    
//}


package model;

public class Addbook {

  private int book_id;
  private int user_id;
  private String first_name;
  private String book_name;
  private String author;
//   private String genre;
  private String pdf_link;
  private String more;
  private String gid;

   // creation of public constructor
    public Addbook(
    int book_id,
    String book_name,
    String author,
    // String genre,
    String pdf_link,
    String more
  ) {
    this.book_id = book_id;
    this.book_name = book_name;
    this.author = author;
    // this.genre = genre;
    this.pdf_link = pdf_link;
    this.more = more;
  }
    
    public Addbook(
    int book_id,
    String book_name,
    int userid,
    // String genre,
    String f_name,
    String pdf_link

  ) {
    this.book_id = book_id;
    this.book_name = book_name;
    this.user_id = userid;
    // this.genre = genre;
    this.first_name = f_name;
    this.pdf_link = pdf_link;
  }
    public Addbook(
    String book_name,
    String author,
    String more
            
  ) {
    this.book_name = book_name;
    this.author = author;
    this.more = more;
  }
    
    public Addbook(
    String book_name,
    String pdf_link
            
  ) {
    this.book_name = book_name;
    this.pdf_link = pdf_link;
  }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }
    public String getgid() {
        return gid;
    }

    public void setgid(String gid) {
        this.gid = gid;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPdf_link() {
        return pdf_link;
    }

    public void setPdf_link(String pdf_link) {
        this.pdf_link = pdf_link;
    }

    public String getMore() {
        return more;
    }

    public void setMore(String more) {
        this.more = more;
    }


    public void setUserId(int user_id){
        this.user_id = user_id;
    }
    
    public void setFirstName(String FirstName){
        this.first_name = FirstName;
    }

    public int getUserId(){
        return this.user_id;
    }
    public String getFirstName(){
        return this.first_name;
    }
      
}

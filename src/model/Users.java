/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author puja
 */
public class Users {
    private String first_name;
    private String lastname;
    private String phonenumber;
    private String address;
    
    public Users(String first_name, String lastname, String phonenumber, String address){
        this.first_name = first_name;
        this.lastname = lastname;
        this.phonenumber = phonenumber;
        this.address = address;
    }
    public void setFirstName(String FirstName){
        this.first_name = FirstName;
    }
    public void setLastName(String LastName){
        this.lastname = LastName;
    }
    public void setPhoneNumber(String PhoneNumber){
        this.phonenumber = PhoneNumber;
    }
    public void setAddress(String Address){
        this.address = Address;
    }
    public String getFirstName(){
        return this.first_name;
    }
    public String getLastName(){
        return this.lastname;
    } 
    public String getPhoneNumber(){
        return this.phonenumber;
    }
    public String getAddress(){
        return this.address;
    }
 
}

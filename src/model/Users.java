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
    private String Username;
    private String Password;
    private String conf_Password;
    
    public Users(String first_name, String lastname, String phonenumber, String Username, String Password, String conf_Password){
        this.first_name = first_name;
        this.lastname = lastname;
        this.phonenumber = phonenumber;
        this.Username = Username;
        this.Password = Password;
        this.conf_Password = conf_Password;
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
    public void setUsername(String Username){
        this.Username = Username;
    }
    public void setPassword(String Password){
        this.Password = Password;
    }
    public void setconf_Password(String conf_Password){
        this.conf_Password = conf_Password;
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
    public String getUsername(){
        return this.Username;
    }
    public String getPassword(){
        return this.Password;
    }
    public String getconf_Password(){
        return this.conf_Password;
    }
 
}

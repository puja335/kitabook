/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author raich
 */
public class review {
    public static void main(String[] args){
        String data[]= {tf_bookname.gettext(), tf_commentt.gettext()};
        DefaultTableModel tblModel = (DefaultTableModel)viewcomment.getModel();
        tblModel.addRow(data);
        
    }
    
}

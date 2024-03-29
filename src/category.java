/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
//package view.categoryy;

import database.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author raich
 */
public class category extends javax.swing.JFrame {

    /**
     * Creates new form category
     */
    public category() {
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btn_fantasy = new javax.swing.JButton();
        btn_thriller = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        lbl_fiction = new javax.swing.JLabel();
        lbl_mystery = new javax.swing.JLabel();
        lbl_fantasy = new javax.swing.JLabel();
        lbl_thriller1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jScrollPane1PropertyChange(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(249, 211, 173));

        jPanel1.setBackground(new java.awt.Color(254, 242, 230));
        jPanel1.setLayout(null);

        jButton1.setText("Fiction");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(60, 271, 142, 23);

        btn_fantasy.setText("Fantasy");
        btn_fantasy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fantasyActionPerformed(evt);
            }
        });
        jPanel1.add(btn_fantasy);
        btn_fantasy.setBounds(60, 600, 142, 23);

        btn_thriller.setText("Thriller");
        btn_thriller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thrillerActionPerformed(evt);
            }
        });
        jPanel1.add(btn_thriller);
        btn_thriller.setBounds(610, 270, 142, 23);

        jButton7.setText("Mystery");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(620, 600, 142, 23);

        lbl_fiction.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/category/Fiction.png"))); // NOI18N
        jPanel1.add(lbl_fiction);
        lbl_fiction.setBounds(34, 8, 225, 225);

        lbl_mystery.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/category/thriller.png"))); // NOI18N
        jPanel1.add(lbl_mystery);
        lbl_mystery.setBounds(580, 350, 220, 233);

        lbl_fantasy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/category/Cinema-Fantasy-icon.png"))); // NOI18N
        lbl_fantasy.setText("jLabel3");
        jPanel1.add(lbl_fantasy);
        lbl_fantasy.setBounds(30, 340, 225, 243);

        lbl_thriller1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/category/thriller.png"))); // NOI18N
        jPanel1.add(lbl_thriller1);
        lbl_thriller1.setBounds(570, 8, 220, 233);

        jPanel3.setBackground(new java.awt.Color(249, 211, 173));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel10.setText("Kitabook");

        jButton3.setBackground(new java.awt.Color(245, 191, 139));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton3.setText("Home");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(245, 191, 139));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton4.setText("My Profile");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(245, 191, 139));
        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton5.setText("Logout");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel10))
                    .addComponent(jButton4))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(jButton3)
                .addGap(87, 87, 87)
                .addComponent(jButton4)
                .addGap(99, 99, 99)
                .addComponent(jButton5)
                .addContainerGap(226, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 957, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // ñTODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    
        
        fiction_table = new javax.swing.JTable();
        fiction_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Fiction"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        try{
            Connection conn=DbConnection.getconnection();
            String query="select book_name from Addbook where gid='101' ";
            PreparedStatement Fiction_pst=conn.prepareStatement(query);
            ResultSet Fiction_rst=Fiction_pst.executeQuery();
            fiction_table.setModel(DbUtils.resultSetToTableModel(Fiction_rst));
            
        }catch(SQLException e){
            System.out.println(e);
        }
        fiction_table.setBounds(34, 8, 225, 225);
        jPanel1.remove(lbl_fiction);
        jPanel1.validate();
        jPanel1.add(fiction_table);
        
        jPanel1.show();
        

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_fantasyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fantasyActionPerformed
        // TODO add your handling code here:
        
             fantasy_table = new javax.swing.JTable();
        fantasy_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Fiction"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        try{
            Connection conn=DbConnection.getconnection();
            String query="select book_name from Addbook where gid='103' ";
            PreparedStatement Fiction_pst=conn.prepareStatement(query);
            ResultSet Fiction_rst=Fiction_pst.executeQuery();
            fantasy_table.setModel(DbUtils.resultSetToTableModel(Fiction_rst));
            
        }catch(SQLException e){
            System.out.println(e);
        }
        fantasy_table.setBounds(19, 300, 225, 243);
        jPanel1.remove(lbl_fantasy);
        jPanel1.validate();
        jPanel1.add(fantasy_table);
        
        jPanel1.show();
        
    }//GEN-LAST:event_btn_fantasyActionPerformed

    private void jScrollPane1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jScrollPane1PropertyChange

//        jPanel1.removeAll();
//        jPanel1.validate();
//        jPanel1.add(jButton7);
//        jPanel1.show();

        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1PropertyChange

    private void btn_thrillerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thrillerActionPerformed
        // TODO add your handling code here:
        thriller_table = new javax.swing.JTable();
        thriller_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Fiction"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        try{
            Connection conn=DbConnection.getconnection();
            String query="select book_name from Addbook where gid='104' ";
            PreparedStatement Fiction_pst=conn.prepareStatement(query);
            ResultSet Fiction_rst=Fiction_pst.executeQuery();
            thriller_table.setModel(DbUtils.resultSetToTableModel(Fiction_rst));
            
        }catch(SQLException e){
            System.out.println(e);
        }
        thriller_table.setBounds(570, 8, 220, 233);
        jPanel1.remove(lbl_mystery);
        jPanel1.validate();
        jPanel1.add(thriller_table);
        
        jPanel1.show();
    }//GEN-LAST:event_btn_thrillerActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        
        mystery_table = new javax.swing.JTable();
        mystery_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Fiction"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        try{
            Connection conn=DbConnection.getconnection();
            String query="select book_name from Addbook where gid='102' ";
            PreparedStatement Fiction_pst=conn.prepareStatement(query);
            ResultSet Fiction_rst=Fiction_pst.executeQuery();
            mystery_table.setModel(DbUtils.resultSetToTableModel(Fiction_rst));
            
        }catch(SQLException e){
            System.out.println(e);
        }
        mystery_table.setBounds(580, 350, 220, 233);
        jPanel1.remove(lbl_mystery);
        jPanel1.validate();
        jPanel1.add(mystery_table);
        
        jPanel1.show();
    }//GEN-LAST:event_jButton7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new category().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_fantasy;
    private javax.swing.JButton btn_thriller;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_fantasy;
    private javax.swing.JLabel lbl_fiction;
    private javax.swing.JLabel lbl_mystery;
    private javax.swing.JLabel lbl_thriller1;
    // End of variables declaration//GEN-END:variables

private javax.swing.JTable fiction_table;
private javax.swing.JTable thriller_table;
private javax.swing.JTable fantasy_table;
private javax.swing.JTable mystery_table;
}

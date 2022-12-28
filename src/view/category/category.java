/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.category;

import database.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import view.TrendingScreen;
import view.dashboard;
import view.landingScreen;
import view.library;

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
        btn_fiction = new javax.swing.JButton();
        btn_romance = new javax.swing.JButton();
        btn_thriller = new javax.swing.JButton();
        btn_horror = new javax.swing.JButton();
        lbl_fiction = new javax.swing.JLabel();
        lbl_horror = new javax.swing.JLabel();
        lbl_romance = new javax.swing.JLabel();
        lbl_thriller1 = new javax.swing.JLabel();
        lbl_fantasy = new javax.swing.JLabel();
        btn_fantasy1 = new javax.swing.JButton();
        lbl_mystery1 = new javax.swing.JLabel();
        btn_mystery1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

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

        btn_fiction.setText("Fiction");
        btn_fiction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fictionActionPerformed(evt);
            }
        });
        jPanel1.add(btn_fiction);
        btn_fiction.setBounds(80, 260, 142, 23);

        btn_romance.setText("Romance");
        btn_romance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_romanceActionPerformed(evt);
            }
        });
        jPanel1.add(btn_romance);
        btn_romance.setBounds(100, 940, 142, 23);

        btn_thriller.setText("Thriller");
        btn_thriller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thrillerActionPerformed(evt);
            }
        });
        jPanel1.add(btn_thriller);
        btn_thriller.setBounds(610, 260, 142, 23);

        btn_horror.setText("Horror");
        btn_horror.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_horrorActionPerformed(evt);
            }
        });
        jPanel1.add(btn_horror);
        btn_horror.setBounds(620, 920, 142, 23);

        lbl_fiction.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/c_fiction.png"))); // NOI18N
        jPanel1.add(lbl_fiction);
        lbl_fiction.setBounds(80, 80, 180, 170);

        lbl_horror.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/c_horror.png"))); // NOI18N
        jPanel1.add(lbl_horror);
        lbl_horror.setBounds(620, 700, 160, 200);

        lbl_romance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/c_romance.png"))); // NOI18N
        jPanel1.add(lbl_romance);
        lbl_romance.setBounds(90, 680, 225, 243);

        lbl_thriller1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/c_thriller.png"))); // NOI18N
        jPanel1.add(lbl_thriller1);
        lbl_thriller1.setBounds(600, 60, 150, 190);

        lbl_fantasy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/c_Fantasy.png"))); // NOI18N
        jPanel1.add(lbl_fantasy);
        lbl_fantasy.setBounds(80, 340, 225, 243);

        btn_fantasy1.setText("Fantasy");
        btn_fantasy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fantasy1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_fantasy1);
        btn_fantasy1.setBounds(90, 600, 142, 23);

        lbl_mystery1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/c_mystery.png"))); // NOI18N
        jPanel1.add(lbl_mystery1);
        lbl_mystery1.setBounds(610, 390, 220, 190);

        btn_mystery1.setText("Mystery");
        btn_mystery1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mystery1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_mystery1);
        btn_mystery1.setBounds(620, 600, 142, 23);

        jPanel4.setBackground(new java.awt.Color(218, 156, 125));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 29)); // NOI18N
        jLabel2.setText("Kitabooks");

        jButton5.setBackground(new java.awt.Color(218, 156, 125));
        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton5.setText("Home");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(218, 156, 125));
        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton6.setText("Library");
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(218, 156, 125));
        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton7.setText("Trending");
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(218, 156, 125));
        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton8.setText("Profile");
        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(218, 156, 125));
        jButton9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton9.setText("About us");
        jButton9.setBorder(null);
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(218, 156, 125));
        jButton10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton10.setText("Logout");
        jButton10.setBorder(null);
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(135, 135, 135))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel2)
                .addGap(97, 97, 97)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addGap(27, 27, 27)
                .addComponent(jButton8)
                .addGap(20, 20, 20)
                .addComponent(jButton9)
                .addGap(18, 18, 18)
                .addComponent(jButton10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 979, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 998, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jScrollPane1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jScrollPane1PropertyChange

//        jPanel1.removeAll();
//        jPanel1.validate();
//        jPanel1.add(jButton7);
//        jPanel1.show();

        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1PropertyChange

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
                int n = JOptionPane.showConfirmDialog(
            null,
            "Are you sure you want to logout?" ,
            "Warning",
            JOptionPane.YES_NO_OPTION);

        if(n == JOptionPane.YES_OPTION)
        {
            new landingScreen().setVisible(true);
            this.setVisible(false);
        }
        else
        {
            this.setVisible(true);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        new TrendingScreen().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        new library().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new dashboard().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btn_mystery1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mystery1ActionPerformed
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
                "Mystery"
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
        jPanel1.remove(lbl_mystery1);
        jPanel1.validate();
        jPanel1.add(mystery_table);

        jPanel1.show();

    }//GEN-LAST:event_btn_mystery1ActionPerformed

    private void btn_fantasy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fantasy1ActionPerformed
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
            String query="select book_name from Addbook where gid='103' ";
            PreparedStatement Fiction_pst=conn.prepareStatement(query);
            ResultSet Fiction_rst=Fiction_pst.executeQuery();
            mystery_table.setModel(DbUtils.resultSetToTableModel(Fiction_rst));

        }catch(SQLException e){
            System.out.println(e);
        }
        mystery_table.setBounds(30, 340, 225, 243);
        jPanel1.remove(lbl_fantasy);
        jPanel1.validate();
        jPanel1.add(mystery_table);

        jPanel1.show();

    }//GEN-LAST:event_btn_fantasy1ActionPerformed

    private void btn_horrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_horrorActionPerformed
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
            String query="select book_name from Addbook where gid='106' ";
            PreparedStatement Fiction_pst=conn.prepareStatement(query);
            ResultSet Fiction_rst=Fiction_pst.executeQuery();
            mystery_table.setModel(DbUtils.resultSetToTableModel(Fiction_rst));

        }catch(SQLException e){
            System.out.println(e);
        }
        mystery_table.setBounds(580, 660, 220, 233);
        jPanel1.remove(lbl_horror);
        jPanel1.validate();
        jPanel1.add(mystery_table);

        jPanel1.show();
    }//GEN-LAST:event_btn_horrorActionPerformed

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
        jPanel1.remove(lbl_thriller1);
        jPanel1.validate();
        jPanel1.add(thriller_table);

        jPanel1.show();
    }//GEN-LAST:event_btn_thrillerActionPerformed

    private void btn_romanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_romanceActionPerformed
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
                "Romance"
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
            String query="select book_name from Addbook where gid='105' ";
            PreparedStatement Fiction_pst=conn.prepareStatement(query);
            ResultSet Fiction_rst=Fiction_pst.executeQuery();
            fantasy_table.setModel(DbUtils.resultSetToTableModel(Fiction_rst));

        }catch(SQLException e){
            System.out.println(e);
        }
        fantasy_table.setBounds(50, 670, 225, 243);
        jPanel1.remove(lbl_romance);
        jPanel1.validate();
        jPanel1.add(fantasy_table);

        jPanel1.show();

    }//GEN-LAST:event_btn_romanceActionPerformed

    private void btn_fictionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fictionActionPerformed

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
    }//GEN-LAST:event_btn_fictionActionPerformed

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
    private javax.swing.JButton btn_fantasy1;
    private javax.swing.JButton btn_fiction;
    private javax.swing.JButton btn_horror;
    private javax.swing.JButton btn_mystery1;
    private javax.swing.JButton btn_romance;
    private javax.swing.JButton btn_thriller;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_fantasy;
    private javax.swing.JLabel lbl_fiction;
    private javax.swing.JLabel lbl_horror;
    private javax.swing.JLabel lbl_mystery1;
    private javax.swing.JLabel lbl_romance;
    private javax.swing.JLabel lbl_thriller1;
    // End of variables declaration//GEN-END:variables

private javax.swing.JTable fiction_table;
private javax.swing.JTable thriller_table;
private javax.swing.JTable fantasy_table;
private javax.swing.JTable mystery_table;
}

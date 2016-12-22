package com.ocams.abed;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ABED
 */
public class FrameMasterUser extends javax.swing.JFrame {

    /**
     * Creates new form FrameMasterUser
     */
    public FrameMasterUser() {
        initComponents();
        DataUser();
        AutoGenIDUser.setText("");
    }
    
    public void DataUser() {
        String kolom[] = {"ID_User","Nama","Alamat","Notlpn","Email","Password"}; //kolom untuk jTable yang ada di form
        DefaultTableModel dataU = new DefaultTableModel(null, kolom);
        String SQL = "SELECT * FROM user";
        ArrayList<String[]> data = OCAMS.SQL.executeQueryGetArray(SQL);
        
        for (int i = 0; i < data.size(); i++) {
            String temp[] = data.get(i);
            dataU.addRow(temp);
        }
        tableUser.setModel(dataU);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        AutoGenIDUser = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        txtNotlpn = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUser = new javax.swing.JTable();
        INSERT = new javax.swing.JButton();
        UPDATE = new javax.swing.JButton();
        DELETE = new javax.swing.JButton();
        cbJabatan = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        CLEAR = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID User  :");

        jLabel2.setText("Password  :");

        jLabel3.setText("Nama  :");

        jLabel4.setText("Alamat  :");

        jLabel5.setText("Nomer telpon  :");

        jLabel6.setText("Email  :");

        AutoGenIDUser.setForeground(new java.awt.Color(102, 102, 102));
        AutoGenIDUser.setText("Auto Generate ID user");

        txtAlamat.setToolTipText("");

        tableUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableUserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableUser);

        INSERT.setText("INSERT");
        INSERT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INSERTActionPerformed(evt);
            }
        });

        UPDATE.setText("UPDATE");
        UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEActionPerformed(evt);
            }
        });

        DELETE.setText("DELETE");
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });

        cbJabatan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MANAGER", "ADMIN", "KASIR", "STOCK" }));
        cbJabatan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbJabatanItemStateChanged(evt);
            }
        });

        jLabel7.setText("Jabatan  :");

        CLEAR.setText("Clear");
        CLEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLEARActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Trajan Pro", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 204, 0));
        jLabel8.setText("MASTER USER");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(INSERT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(UPDATE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DELETE)
                                .addGap(18, 18, 18)
                                .addComponent(CLEAR, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AutoGenIDUser)
                                    .addComponent(cbJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNotlpn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtNama, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AutoGenIDUser)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNotlpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(INSERT)
                    .addComponent(UPDATE)
                    .addComponent(DELETE)
                    .addComponent(CLEAR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbJabatanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbJabatanItemStateChanged
        String function = "";
        
        if (cbJabatan.getSelectedItem().equals("MANAGER")) {
            function = "SELECT kodeuser('MA')";
        }else if (cbJabatan.getSelectedItem().equals("ADMIN")) {
            function = "SELECT kodeuser('AD')";
        }else if (cbJabatan.getSelectedItem().equals("KASIR")) {
            function = "SELECT kodeuser('KA')";
        }else if (cbJabatan.getSelectedItem().equals("STOCK")) {
            function = "SELECT kodeuser('ST')";
        }
        AutoGenIDUser.setText(OCAMS.SQL.executeGetScalar(function));
    }//GEN-LAST:event_cbJabatanItemStateChanged

    private void INSERTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INSERTActionPerformed
        String SQLinsert = "INSERT INTO user (ID_User,Nama,Alamat,Notlpn,Email,Password) " 
                + "VALUES('" + AutoGenIDUser.getText() + "','" + txtNama.getText() 
                + "','" + txtAlamat.getText() + "','" + txtNotlpn.getText() 
                + "','" + txtEmail.getText() + "','" + txtPassword.getText() + "')";
        int status = OCAMS.SQL.executeNonQuery(SQLinsert);

        if (status == 1) {
            JOptionPane.showMessageDialog(this, "Insert Data berhasil", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(this, "Insert Data Gagal", "Gagal", JOptionPane.WARNING_MESSAGE);
        }
        DataUser();
    }//GEN-LAST:event_INSERTActionPerformed

    private void UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEActionPerformed
        String SQLUpdate = "UPDATE user SET Nama = '" + txtNama.getText() + "' , Alamat = '" + txtAlamat.getText() 
                + "' , Notlpn = '" + txtNotlpn.getText() + "' , Email = '" + txtEmail.getText() 
                + "' , Password = '" + txtPassword.getText() + "' WHERE ID_User = '" + AutoGenIDUser.getText() + "'";
        int status = OCAMS.SQL.executeNonQuery(SQLUpdate);

        if (status==1) {
            JOptionPane.showMessageDialog(this, "Data berhasil diupdate", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(this, "Update gagal", "Gagal", JOptionPane.WARNING_MESSAGE);
        }
        DataUser();
    }//GEN-LAST:event_UPDATEActionPerformed

    private void tableUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableUserMouseClicked
        int baris = tableUser.getSelectedRow();
        
        if (baris != -1) {
            AutoGenIDUser.setText(tableUser.getValueAt(baris, 0).toString());
            txtNama.setText(tableUser.getValueAt(baris, 1).toString());
            txtAlamat.setText(tableUser.getValueAt(baris, 2).toString());
            txtNotlpn.setText(tableUser.getValueAt(baris, 3).toString());
            txtEmail.setText(tableUser.getValueAt(baris, 4).toString());
            txtPassword.setText(tableUser.getValueAt(baris, 5).toString());
        }
    }//GEN-LAST:event_tableUserMouseClicked

    private void CLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLEARActionPerformed
        AutoGenIDUser.setText("");
        txtNama.setText("");
        txtAlamat.setText("");
        txtNotlpn.setText("");
        txtEmail.setText("");
        txtPassword.setText("");
    }//GEN-LAST:event_CLEARActionPerformed

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed
        String SQLdelete = "DELETE FROM user WHERE ID_User = '" + AutoGenIDUser.getText() + "'";
        int status = OCAMS.SQL.executeNonQuery(SQLdelete);

        if (status==1) {
            JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        } 
        else {
            JOptionPane.showMessageDialog(this, "Data gagal dihapus", "Gagal", JOptionPane.WARNING_MESSAGE);
        }
        DataUser();
    }//GEN-LAST:event_DELETEActionPerformed

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
            java.util.logging.Logger.getLogger(FrameMasterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameMasterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameMasterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMasterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMasterUser().setVisible(true);        
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AutoGenIDUser;
    private javax.swing.JButton CLEAR;
    private javax.swing.JButton DELETE;
    private javax.swing.JButton INSERT;
    private javax.swing.JButton UPDATE;
    private javax.swing.JComboBox<String> cbJabatan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableUser;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNotlpn;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables
}

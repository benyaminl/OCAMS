package com.ocams.abed;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.ocams.OCAMS;
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
        
        tableAset.setModel(dataU);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

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
        tableAset = new javax.swing.JTable();
        INSERT = new javax.swing.JButton();
        UPDATE = new javax.swing.JButton();
        DELETE = new javax.swing.JButton();
        cbJabatan = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        CLEAR = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("ID User");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 10, 0, 0);
        getContentPane().add(jLabel1, gridBagConstraints);

        jLabel2.setText("Password");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 10, 0, 0);
        getContentPane().add(jLabel2, gridBagConstraints);

        jLabel3.setText("Nama");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 10, 0, 0);
        getContentPane().add(jLabel3, gridBagConstraints);

        jLabel4.setText("Alamat");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 10, 0, 0);
        getContentPane().add(jLabel4, gridBagConstraints);

        jLabel5.setText("Nomer telpon");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 10, 0, 0);
        getContentPane().add(jLabel5, gridBagConstraints);

        jLabel6.setText("Email");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 10, 0, 0);
        getContentPane().add(jLabel6, gridBagConstraints);

        AutoGenIDUser.setText("KODE GEN");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 13, 0, 0);
        getContentPane().add(AutoGenIDUser, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 133;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 13, 0, 0);
        getContentPane().add(txtPassword, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 133;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 13, 0, 0);
        getContentPane().add(txtNama, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 293;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 13, 0, 0);
        getContentPane().add(txtAlamat, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 87;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 13, 0, 0);
        getContentPane().add(txtNotlpn, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 134;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 13, 0, 0);
        getContentPane().add(txtEmail, gridBagConstraints);

        tableAset.setModel(new javax.swing.table.DefaultTableModel(
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
        tableAset.setPreferredSize(new java.awt.Dimension(100, 64));
        tableAset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableAsetMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableAset);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 11, 10);
        getContentPane().add(jScrollPane1, gridBagConstraints);

        INSERT.setText("INSERT");
        INSERT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INSERTActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 6, 0);
        getContentPane().add(INSERT, gridBagConstraints);

        UPDATE.setText("UPDATE");
        UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        getContentPane().add(UPDATE, gridBagConstraints);

        DELETE.setText("DELETE");
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        getContentPane().add(DELETE, gridBagConstraints);

        cbJabatan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MANAGER", "ADMIN", "KASIR", "STOCK" }));
        cbJabatan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbJabatanItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 31;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 13, 0, 0);
        getContentPane().add(cbJabatan, gridBagConstraints);

        jLabel7.setText("Jabatan");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        getContentPane().add(jLabel7, gridBagConstraints);

        CLEAR.setText("Clear");
        CLEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLEARActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        getContentPane().add(CLEAR, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("MASTER USER");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        getContentPane().add(jLabel8, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void INSERTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INSERTActionPerformed
        String SQLinsert = "INSERT INTO user (ID_User,Nama,Alamat,Notlp,Email,Password) " 
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

    private void tableAsetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableAsetMouseClicked
        int baris = tableAset.getSelectedRow();
        
        if (baris != -1) {
            AutoGenIDUser.setText(tableAset.getValueAt(baris, 0).toString());
            txtNama.setText(tableAset.getValueAt(baris, 1).toString());
            txtAlamat.setText(tableAset.getValueAt(baris, 2).toString());
            txtNotlpn.setText(tableAset.getValueAt(baris, 3).toString());
            txtEmail.setText(tableAset.getValueAt(baris, 4).toString());
            txtPassword.setText(tableAset.getValueAt(baris, 5).toString());
        }
    }//GEN-LAST:event_tableAsetMouseClicked

    private void UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEActionPerformed
        String SQLUpdate = "UPDATE user SET Nama = '" + txtNama.getText() 
                + "' , Alamat = '" + txtAlamat.getText() + "' , Notlp = '" 
                + txtNotlpn.getText() + "' , Email = '" + txtEmail.getText() 
                + "' , Password = '" + txtPassword.getText() 
                + "' WHERE ID_User = '" + AutoGenIDUser.getText() + "'";
        int status = OCAMS.SQL.executeNonQuery(SQLUpdate);

        if (status==1) {
            JOptionPane.showMessageDialog(this, "Data berhasil diupdate", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(this, "Update gagal", "Gagal", JOptionPane.WARNING_MESSAGE);
        }
        DataUser();
    }//GEN-LAST:event_UPDATEActionPerformed

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

    private void CLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLEARActionPerformed
        AutoGenIDUser.setText("");
        txtNama.setText("");
        txtAlamat.setText("");
        txtNotlpn.setText("");
        txtEmail.setText("");
        txtPassword.setText("");
    }//GEN-LAST:event_CLEARActionPerformed

    private void cbJabatanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbJabatanItemStateChanged
        if (cbJabatan.getSelectedItem().equals("MANAGER")) {
            AutoGenIDUser.setText("MA002");
        }else if (cbJabatan.getSelectedItem().equals("ADMIN")) {
            AutoGenIDUser.setText("AD002");
        }else if (cbJabatan.getSelectedItem().equals("KASIR")) {
            AutoGenIDUser.setText("KA002");
        }else if (cbJabatan.getSelectedItem().equals("STOCK")) {
            AutoGenIDUser.setText("ST002");
        }
    }//GEN-LAST:event_cbJabatanItemStateChanged

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
    private javax.swing.JTable tableAset;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNotlpn;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables
}

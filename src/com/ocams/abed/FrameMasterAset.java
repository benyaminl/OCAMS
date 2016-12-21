/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocams.abed;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ABED
 */
public class FrameMasterAset extends javax.swing.JFrame {

    /**
     * Creates new form FrameMasterAset
     */
    String NomerRef = "";
    public FrameMasterAset() {
        initComponents();
        SimpleDateFormat dateFormat = new SimpleDateFormat("d-M-yyyy");
        dateTanggal.setDateFormat(dateFormat);
        DataAset();
        //setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE); // Ini untuk supaya ga close EXIT
        labelIDTRANS.setVisible(false);
    }
    
    public void DataAset() {
        String kolom[] = {"ID_Aset","Nama_Aset","Tanggal_Beli","Harga_Beli","Transaksi"};
        DefaultTableModel dataA = new DefaultTableModel(null, kolom);
        String sql = "select ID_Aset,Nama_Aset,DATE_FORMAT(Tanggal_Beli,'%d-%m-%Y'),Harga_Beli,Transaksi from aset";
        ArrayList<String[]> arrAset = OCAMS.SQL.executeQueryGetArray(sql);
        
        for (int i = 0; i < arrAset.size(); i++) {
            String temp[] = arrAset.get(i);
            dataA.addRow(temp);
        }
        tableAset.setModel(dataA);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtHargaBeli = new javax.swing.JTextField();
        AddAset = new javax.swing.JButton();
        UPDATE = new javax.swing.JButton();
        DELETE = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAset = new javax.swing.JTable();
        rbKas = new javax.swing.JRadioButton();
        rbHutang = new javax.swing.JRadioButton();
        txtNamaAset = new javax.swing.JTextField();
        LabelAutoG = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dateTanggal = new datechooser.beans.DateChooserCombo();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CLEAR = new javax.swing.JButton();
        labelIDTRANS = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabel2.setText("ID Aset  :");

        jLabel3.setText("Nama Aset  :");

        jLabel4.setText("Harga Beli  :");

        txtHargaBeli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtHargaBeliMouseClicked(evt);
            }
        });

        AddAset.setText("Add Aset");
        AddAset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAsetActionPerformed(evt);
            }
        });

        UPDATE.setText("Update");
        UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEActionPerformed(evt);
            }
        });

        DELETE.setText("Delete");
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });

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
        tableAset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableAsetMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableAset);

        bt.add(rbKas);
        rbKas.setText("KAS");

        bt.add(rbHutang);
        rbHutang.setText("HUTANG");

        LabelAutoG.setForeground(new java.awt.Color(153, 153, 153));
        LabelAutoG.setText("Auto Generate ID Nama Aset");

        jLabel5.setText("Tanggal Beli  :");

        dateTanggal.addCommitListener(new datechooser.events.CommitListener() {
            public void onCommit(datechooser.events.CommitEvent evt) {
                dateTanggalOnCommit(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Eras Bold ITC", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 153, 255));
        jLabel6.setText("MASTER ASET");

        jLabel7.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 255));
        jLabel7.setText("DATA ASET");

        CLEAR.setText("Clear");
        CLEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLEARActionPerformed(evt);
            }
        });

        labelIDTRANS.setText("utk ambil id transaksi");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel6))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dateTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNamaAset, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(LabelAutoG)
                                    .addGap(38, 38, 38)
                                    .addComponent(labelIDTRANS))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(AddAset)
                                            .addGap(8, 8, 8)
                                            .addComponent(UPDATE, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(DELETE, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(CLEAR, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtHargaBeli, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                                    .addComponent(rbKas)
                                    .addGap(31, 31, 31)
                                    .addComponent(rbHutang))))))
                .addGap(0, 19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(LabelAutoG)
                    .addComponent(labelIDTRANS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtNamaAset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHargaBeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(rbKas)
                    .addComponent(rbHutang))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AddAset)
                        .addComponent(UPDATE)
                        .addComponent(DELETE)
                        .addComponent(CLEAR))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtHargaBeliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHargaBeliMouseClicked
       String function = "SELECT kodeaset('" + txtNamaAset.getText() + "')";
       LabelAutoG.setText(OCAMS.SQL.executeGetScalar(function));
    }//GEN-LAST:event_txtHargaBeliMouseClicked

    private void AddAsetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAsetActionPerformed
       //STR_TO_DATE('22-01-2015','%d-%m-%Y')
       String kode = OCAMS.SQL.transID();
        String sqlInsert = "INSERT INTO aset (ID_Aset,Nama_Aset,Tanggal_Beli,Harga_Beli,Transaksi) " 
                + "VALUES('" + LabelAutoG.getText() + "','" + txtNamaAset.getText() 
                + "', STR_TO_DATE('" + dateTanggal.getText() + "','%d-%m-%Y')"
                + ",'" + txtHargaBeli.getText() + "','" + kode + "')";
        int status = OCAMS.SQL.executeNonQuery(sqlInsert);
        if (status == 1) {
            JOptionPane.showMessageDialog(this, "Insert Data berhasil", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(this, "Insert Data Gagal", "Gagal", JOptionPane.WARNING_MESSAGE);
        }
        DataAset();
        
        //String data[] = {"Aset,2000,0","HUTANG,0,2000"};
        //ArrayList<String> data = new ArrayList<>();
        String ket = "Pembelian " + txtNamaAset.getText();
        String data[];
        if (rbKas.isSelected() == true) {
            data = new String[] {"Utang,0," + txtHargaBeli.getText(),"Aset," + txtHargaBeli.getText() + ",0"};
            OCAMS.SQL.pencatatanJurnalTransaksi(kode, ket, data,OCAMS.userYangLogin.getKdUser());
        }else if (rbHutang.isSelected() == true) {
            data = new String[] {"Aset," + txtHargaBeli.getText() + ",0","Utang,0," + txtHargaBeli.getText()};
            OCAMS.SQL.pencatatanJurnalTransaksi(kode, ket, data,OCAMS.userYangLogin.getKdUser());
        }
    }//GEN-LAST:event_AddAsetActionPerformed

    private void UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEActionPerformed
        String sqlUpdate = "UPDATE aset SET Tanggal_Beli = STR_TO_DATE('" + dateTanggal.getText() + "','%d-%m-%Y'), Harga_Beli = '" 
                + txtHargaBeli.getText() + "' WHERE ID_Aset = '" + LabelAutoG.getText() + "'";
        int status = OCAMS.SQL.executeNonQuery(sqlUpdate);
        
        String UpdateHJ = "UPDATE header_jurnal SET Tanggal = STR_TO_DATE('" + dateTanggal.getText() + "','%d-%m-%Y') WHERE ID_TRANS = '" + labelIDTRANS.getText() + "'";
        OCAMS.SQL.executeNonQuery(UpdateHJ);

        if (status==1) {
            JOptionPane.showMessageDialog(this, "Data berhasil diupdate", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(this, "Update gagal", "Gagal", JOptionPane.WARNING_MESSAGE);
        }
        DataAset();
    }//GEN-LAST:event_UPDATEActionPerformed

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed
        String SQLdelete = "DELETE FROM aset WHERE ID_Aset = '" + LabelAutoG.getText() + "'";
        int status = OCAMS.SQL.executeNonQuery(SQLdelete);
        String delete = "DELETE FROM header_jurnal WHERE ID_TRANS = '" + labelIDTRANS.getText() + "'";
        OCAMS.SQL.executeNonQuery(delete);
        String deletJ = "DELETE FROM jurnal WHERE kode = '" + labelIDTRANS.getText() + "'";
        OCAMS.SQL.executeNonQuery(deletJ);
        
        if (status==1) {
            JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        } 
        else {
            JOptionPane.showMessageDialog(this, "Data gagal dihapus", "Gagal", JOptionPane.WARNING_MESSAGE);
        }
        DataAset();
    }//GEN-LAST:event_DELETEActionPerformed

    private void tableAsetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableAsetMouseClicked
        int baris = tableAset.getSelectedRow();
        String date = tableAset.getValueAt(baris, 2).toString();
        if (baris != -1) {
            LabelAutoG.setText(tableAset.getValueAt(baris, 0).toString());
            txtNamaAset.setText(tableAset.getValueAt(baris, 1).toString());
            // http://stackoverflow.com/questions/6185966/converting-a-date-object-to-a-calendar-object
            DateFormat format = new SimpleDateFormat("d-M-yyyy");
            Date tgl = null;
            try {
                tgl = (Date)format.parse(date);
            } catch (ParseException ex) {
                Logger.getLogger(FrameMasterAset.class.getName()).log(Level.SEVERE, null, ex);
            }
            Calendar cal = Calendar.getInstance();
            cal.setTime(tgl);
            dateTanggal.setSelectedDate(cal);
            txtHargaBeli.setText(tableAset.getValueAt(baris, 3).toString());
            labelIDTRANS.setText(tableAset.getValueAt(baris, 4).toString());
        }
    }//GEN-LAST:event_tableAsetMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
       String function = "SELECT kodeaset('" + txtNamaAset.getText() + "')";
       LabelAutoG.setText(OCAMS.SQL.executeGetScalar(function));
    }//GEN-LAST:event_formMouseClicked

    private void CLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLEARActionPerformed
        LabelAutoG.setText("");
        txtNamaAset.setText("");
        txtHargaBeli.setText("");
    }//GEN-LAST:event_CLEARActionPerformed

    private void dateTanggalOnCommit(datechooser.events.CommitEvent evt) {//GEN-FIRST:event_dateTanggalOnCommit
        String function = "SELECT kodeaset('" + txtNamaAset.getText() + "')";
        LabelAutoG.setText(OCAMS.SQL.executeGetScalar(function));
    }//GEN-LAST:event_dateTanggalOnCommit

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
            java.util.logging.Logger.getLogger(FrameMasterAset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameMasterAset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameMasterAset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMasterAset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMasterAset().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddAset;
    private javax.swing.JButton CLEAR;
    private javax.swing.JButton DELETE;
    private javax.swing.JLabel LabelAutoG;
    private javax.swing.JButton UPDATE;
    private javax.swing.ButtonGroup bt;
    private datechooser.beans.DateChooserCombo dateTanggal;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelIDTRANS;
    private javax.swing.JRadioButton rbHutang;
    private javax.swing.JRadioButton rbKas;
    private javax.swing.JTable tableAset;
    private javax.swing.JTextField txtHargaBeli;
    private javax.swing.JTextField txtNamaAset;
    // End of variables declaration//GEN-END:variables
}

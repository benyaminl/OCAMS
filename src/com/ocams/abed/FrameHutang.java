/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocams.abed;

import static java.lang.String.format;
import static java.lang.String.format;
import static java.lang.String.format;
import static java.lang.String.format;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ABED
 */
public class FrameHutang extends javax.swing.JFrame {

    /**
     * Creates new form FrameHutang
     */
    public FrameHutang() {
        initComponents();
        DataHutang();
        SimpleDateFormat dateFormat = new SimpleDateFormat("d-M-yyyy");
        dateTempo.setDateFormat(dateFormat);
        DefaultComboBoxModel dataU = new DefaultComboBoxModel();
        String utang = "SELECT Nama FROM `noref` WHERE `Nomor` LIKE '1%'";
        ArrayList<String[]> arrcb = OCAMS.SQL.executeQueryGetArray(utang);
        
        for(String[] d: arrcb){
           dataU.addElement(d[0]);
        }
        cbNoref.setModel(dataU);
        LabelID.setText(OCAMS.SQL.transID());
    }

    public void DataHutang() {
        String kolomH[] = {"ID_Transaksi","Jumlah","Tanggal_Jatuh_Tempo","Status","Operator","Keterangan"};
        DefaultTableModel dataH = new DefaultTableModel(null, kolomH);
        String sqlH = "select ID_Transaksi,Jumlah,DATE_FORMAT(Tanggal_Jatuh_Tempo,'%d-%m-%Y'),Status,Operator,Keterangan from hutang";
        ArrayList<String[]> arrHutang = OCAMS.SQL.executeQueryGetArray(sqlH);
        
        for (int i = 0; i < arrHutang.size(); i++) {
            String tempH[] = arrHutang.get(i);
            dataH.addRow(tempH);
        }
        TableHutang.setModel(dataH);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtJumlah = new javax.swing.JTextField();
        Insert = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableHutang = new javax.swing.JTable();
        LabelID = new javax.swing.JLabel();
        dateTempo = new datechooser.beans.DateChooserCombo();
        Melunasi = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        textKet = new javax.swing.JTextArea();
        Delete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cbNoref = new javax.swing.JComboBox<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID Transaksi                    :");

        jLabel3.setText("Keterangan  :");

        jLabel4.setText("Jumlah                              :");

        jLabel5.setText("Tanggal Jatuh Tempo   : ");

        txtJumlah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtJumlahMouseClicked(evt);
            }
        });

        Insert.setText("INSERT");
        Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertActionPerformed(evt);
            }
        });

        TableHutang.setModel(new javax.swing.table.DefaultTableModel(
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
        TableHutang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableHutangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TableHutang);

        LabelID.setText("AutoGenerate ID");
        LabelID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelIDMouseClicked(evt);
            }
        });

        Melunasi.setText("MELUNASI");
        Melunasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MelunasiActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 102, 0));
        jLabel11.setText("HUTANG");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 0));
        jLabel6.setText("Data Hutang");

        textKet.setColumns(20);
        textKet.setRows(5);
        jScrollPane3.setViewportView(textKet);

        Delete.setText("DELETE");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        jLabel2.setText("Untuk                                : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Melunasi)
                                .addGap(18, 18, 18)
                                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dateTempo, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                    .addComponent(txtJumlah, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                    .addComponent(LabelID)
                                    .addComponent(cbNoref, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(83, 83, 83)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(286, 286, 286))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(LabelID)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(dateTempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbNoref, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Insert)
                        .addComponent(Melunasi)
                        .addComponent(Delete))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertActionPerformed
        String InsertH = "INSERT INTO hutang (ID_Transaksi,Jumlah,Tanggal_Jatuh_Tempo,Status,Operator,Keterangan) " 
                + "VALUES('" + LabelID.getText() + "','" + txtJumlah.getText() 
                + "', STR_TO_DATE('" + dateTempo.getText() + "','%d-%m-%Y'),'BELUM','" 
                + OCAMS.userYangLogin.getKdUser() + "','" + textKet.getText() + "')";
        int status = OCAMS.SQL.executeNonQuery(InsertH);
        if (status == 1) {
            JOptionPane.showMessageDialog(this, "Insert Berhasil", "SUKSES", JOptionPane.INFORMATION_MESSAGE);      
        }else {
            JOptionPane.showMessageDialog(this, "Insert Gagal", "GAGAL", JOptionPane.INFORMATION_MESSAGE);
        }
        DataHutang();
        
        String Carinoref = "Select Nama from NoRef where Nama = '" + cbNoref.getSelectedItem() + "'";
        String noref = OCAMS.SQL.executeGetScalar(Carinoref);
        
        String data[];
        data = new String[] {"" + noref + ",0," + txtJumlah.getText() + ""};
        OCAMS.SQL.pencatatanJurnalTransaksi(LabelID.getText(), "Hutang", data, OCAMS.userYangLogin.getKdUser());
    }//GEN-LAST:event_InsertActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        String DeleteH = "DELETE FROM hutang WHERE ID_Transaksi = '" + LabelID.getText() + "'";
        int statusDH = OCAMS.SQL.executeNonQuery(DeleteH);
        String DeleteJ = "DELETE FROM jurnal WHERE kode = '" + LabelID.getText() + "'";
        OCAMS.SQL.executeNonQuery(DeleteJ);
        String DeleteHJ = "DELETE FROM header_jurnal WHERE ID_TRANS = '" + LabelID.getText() + "'";
        OCAMS.SQL.executeNonQuery(DeleteHJ);
        if (statusDH == 1) {
            JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "SUKSES", JOptionPane.INFORMATION_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(this, "Data gagal dihapus", "GAGAL", JOptionPane.INFORMATION_MESSAGE);
        }
        DataHutang();
        
    }//GEN-LAST:event_DeleteActionPerformed

    private void TableHutangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableHutangMouseClicked
        int baris = TableHutang.getSelectedRow();
        String calander = TableHutang.getValueAt(baris, 2).toString();
        
        DateFormat fmt = new SimpleDateFormat("d-M-yyyy");
        Date tgl = null;
        try {
            tgl = (Date)fmt.parse(calander);
            } catch (ParseException ex) {
                Logger.getLogger(FrameHutang.class.getName()).log(Level.SEVERE, null, ex);
            }
        Calendar cal = Calendar.getInstance();
        cal.setTime(tgl);
        
        LabelID.setText(TableHutang.getValueAt(baris, 0).toString());
        txtJumlah.setText(TableHutang.getValueAt(baris, 1).toString());
        dateTempo.setSelectedDate(cal);
        textKet.setText(TableHutang.getValueAt(baris, 5).toString());
    }//GEN-LAST:event_TableHutangMouseClicked

    private void MelunasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MelunasiActionPerformed
        /// Melunasi belum prefect... sulit logika update table jurnal
        String melunasi = "UPDATE hutang SET Status = 'SUDAH' WHERE ID_Transaksi = '" + LabelID.getText() + "'";
        int status = OCAMS.SQL.executeNonQuery(melunasi);
        String updateHJ = "UPDATE header_jurnal SET Keterangan = 'Hutang (lunas)' WHERE ID_TRANS = '" + LabelID.getText() + "'";
        OCAMS.SQL.executeNonQuery(updateHJ);
        
        String dptKredit = "Select Kredit from jurnal where kode = '" + LabelID.getText() + "'";
        String hslKredit = OCAMS.SQL.executeGetScalar(dptKredit);
        
        String updateJ = "UPDATE jurnal SET Debit = " + hslKredit + ", Kredit = 0 WHERE kode = '" + LabelID.getText() + "'";
        OCAMS.SQL.executeNonQuery(updateJ);
        
        if (status==1) {
            JOptionPane.showMessageDialog(this, "LUNAS", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(this, "Gagal Melunasi", "Gagal", JOptionPane.WARNING_MESSAGE);
        }
        DataHutang();
    }//GEN-LAST:event_MelunasiActionPerformed

    private void txtJumlahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtJumlahMouseClicked
        LabelID.setText(OCAMS.SQL.transID());
    }//GEN-LAST:event_txtJumlahMouseClicked

    private void LabelIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelIDMouseClicked
        LabelID.setText(OCAMS.SQL.transID());
    }//GEN-LAST:event_LabelIDMouseClicked

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
            java.util.logging.Logger.getLogger(FrameHutang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameHutang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameHutang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameHutang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameHutang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JButton Insert;
    private javax.swing.JLabel LabelID;
    private javax.swing.JButton Melunasi;
    private javax.swing.JTable TableHutang;
    private javax.swing.JComboBox<String> cbNoref;
    private datechooser.beans.DateChooserCombo dateTempo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea textKet;
    private javax.swing.JTextField txtJumlah;
    // End of variables declaration//GEN-END:variables
}

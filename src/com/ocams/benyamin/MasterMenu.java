/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocams.benyamin;

import com.ocams.OCAMS;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ben
 */
public class MasterMenu extends javax.swing.JFrame {
    DefaultTableModel table;
    String updateKode;
    /**
     * Creates new form MasterMenu
     */
    public MasterMenu() {
        initComponents();
        String header[] = {"ID Menu","Nama Menu","Katagori","Harga"};
        table = new DefaultTableModel(null, header);
        GView.setModel(table);
        updateTable();
    }
    
    
    public void updateTable(){
        String sql = "select h.id_menu, m.nama_menu,m.katagori"
                + ", h.harga_jual\n" +
        "from harga h, (SELECT id_menu,max(berlaku) as berlaku FROM harga group by id_menu)b, menu m\n" +
        "where h.berlaku = b.berlaku and h.id_menu = b.id_menu and m.id_menu = h.id_menu";
        if(!txtCariKatagori.getText().isEmpty()) sql+= " and m.katagori like '%"+txtCariKatagori.getText()+"%'";
        if(!txtCariNama.getText().isEmpty()) sql+= " and m.nama_menu like '%"+txtCariNama.getText()+"%'";
        ArrayList<String[]> data = OCAMS.SQL.executeQueryGetArray(sql);
        int jumlah = table.getRowCount();
        for (int i = 0; i < jumlah; i++) {
            table.removeRow(0);
        }
        
        for(String[] d : data){
            table.addRow(d);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtKatagori = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        GView = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCariNama = new javax.swing.JTextField();
        txtCariKatagori = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        spHarga = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        getContentPane().setLayout(layout);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Master Menu");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 7, 7);
        getContentPane().add(jLabel1, gridBagConstraints);

        jLabel2.setText("Nama Menu");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        getContentPane().add(jLabel2, gridBagConstraints);

        jLabel3.setText("Katagori");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        getContentPane().add(jLabel3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 8);
        getContentPane().add(txtKatagori, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        getContentPane().add(txtNama, gridBagConstraints);

        jLabel4.setText("Harga");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        getContentPane().add(jLabel4, gridBagConstraints);

        jScrollPane1.setMinimumSize(new java.awt.Dimension(200, 200));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(300, 300));

        GView.setModel(new javax.swing.table.DefaultTableModel(
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
        GView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GViewMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(GView);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 15;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(11, 11, 11, 11);
        getContentPane().add(jScrollPane1, gridBagConstraints);

        jButton1.setText("Insert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        getContentPane().add(jButton1, gridBagConstraints);

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 10;
        getContentPane().add(jButton2, gridBagConstraints);

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        getContentPane().add(jButton3, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Data Menu");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        getContentPane().add(jLabel5, gridBagConstraints);

        jLabel6.setText("Nama");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 4;
        getContentPane().add(jLabel6, gridBagConstraints);

        jLabel7.setText("Katagori");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 6;
        getContentPane().add(jLabel7, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(txtCariNama, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(txtCariKatagori, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Cari Data");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 2;
        getContentPane().add(jLabel8, gridBagConstraints);

        jButton4.setText("Cari");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 8;
        getContentPane().add(jButton4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 7);
        getContentPane().add(spHarga, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String kode = OCAMS.SQL.executeGetScalar("select CASE max(id_menu) \n" +
        "    when null then\n" +
        "        'M0001'\n" +
        "    else\n" +
        "        CONCAT('M',LPAD(CONVERT(SUBSTR(max(id_menu),2),SIGNED INTEGER)+1,4,'0'))\n" +
        "    end\n" +
        "from menu");
        OCAMS.SQL.executeNonQuery("INSERT INTO menu values('"+kode+"','"
                +txtNama.getText()+"','"+txtKatagori.getText()+"')");
        OCAMS.SQL.executeNonQuery("INSERT INTO HARGA values('"+kode+"',CURRENT_DATE,"
                +spHarga.getValue().toString()+")");
        JOptionPane.showMessageDialog(this, "Insert Menu Baru Berhasil!");
        updateTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void GViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GViewMouseClicked
        updateKode = table.getValueAt(GView.getSelectedRow(), 0).toString();
        txtNama.setText(table.getValueAt(GView.getSelectedRow(), 1).toString());
        txtKatagori.setText(table.getValueAt(GView.getSelectedRow(), 2).toString());
        spHarga.setValue(Integer.parseInt(table.getValueAt(GView.getSelectedRow(), 3).toString()));
    }//GEN-LAST:event_GViewMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        OCAMS.SQL.executeNonQuery("UPDATE menu SET nama_menu='"
                +txtNama.getText()+"',katagori = '"+txtKatagori.getText()+"' where id_menu='"+updateKode+"'");
        OCAMS.SQL.executeNonQuery("INSERT INTO HARGA values('"+updateKode+"',CURRENT_DATE,"
                +spHarga.getValue().toString()+")"
                + "on duplicate key update harga_jual = '"+spHarga.getValue().toString()+"'");
        JOptionPane.showMessageDialog(this, "Update menu Berhasil!");
        updateTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        OCAMS.SQL.executeNonQuery("DELETE FROM menu where id_menu='"+updateKode+"'");
        OCAMS.SQL.executeNonQuery("DELETE FROM harga where id_menu='"+updateKode+"'");
        JOptionPane.showMessageDialog(this, "Delete menu Berhasil!");
        updateTable();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        updateTable();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(MasterMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MasterMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MasterMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MasterMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MasterMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable GView;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spHarga;
    private javax.swing.JTextField txtCariKatagori;
    private javax.swing.JTextField txtCariNama;
    private javax.swing.JTextField txtKatagori;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables
}
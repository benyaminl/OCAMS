package com.ocams.andre;

import com.ocams.abed.UAdmin;
import com.ocams.OCAMS;
import com.ocams.abed.FrameHutang;
import com.ocams.abed.FrameMasterUser;
import com.ocams.abed.UManager;
import com.ocams.benyamin.FormHeaderKasir;
import com.ocams.benyamin.MasterBahan;
import com.ocams.benyamin.MasterMenu;
import com.ocams.felix.HeaderStock;

public class FrameMenuAplikasi extends javax.swing.JFrame {
    public FrameMenuAplikasi() {
        initComponents();
        lblNamaUser.setText(OCAMS.userYangLogin.getNama());
        if(!(OCAMS.userYangLogin instanceof UAdmin)){
            btnUser.setVisible(false);
        }
        
        if(!(OCAMS.userYangLogin instanceof UManager)){
            
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnJurnal = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        btnReferensi = new javax.swing.JButton();
        lblNamaUser = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        btnKasir = new javax.swing.JButton();
        btnStock = new javax.swing.JButton();
        btnHutang = new javax.swing.JButton();
        btnAset = new javax.swing.JButton();
        btnUser = new javax.swing.JButton();
        btnBahan = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnAset1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnJurnal.setText("Jurnal");
        btnJurnal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJurnalActionPerformed(evt);
            }
        });

        btnMenu.setText("Menu");
        btnMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenuMouseClicked(evt);
            }
        });

        btnReferensi.setText("Referensi");
        btnReferensi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReferensiActionPerformed(evt);
            }
        });

        lblNamaUser.setText("NamaUser");

        jLabel2.setText("User:");

        jButton5.setText("Logout");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        btnKasir.setText("Kasir");
        btnKasir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKasirActionPerformed(evt);
            }
        });

        btnStock.setText("Stock");
        btnStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStockMouseClicked(evt);
            }
        });

        btnHutang.setText("Hutang");
        btnHutang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHutangMouseClicked(evt);
            }
        });

        btnAset.setText("Aset");
        btnAset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAsetMouseClicked(evt);
            }
        });

        btnUser.setText("User");
        btnUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUserMouseClicked(evt);
            }
        });

        btnBahan.setText("Bahan");
        btnBahan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBahanActionPerformed(evt);
            }
        });

        jButton1.setText("Resep");

        btnAset1.setText("Absensi");
        btnAset1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAset1MouseClicked(evt);
            }
        });
        btnAset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAset1ActionPerformed(evt);
            }
        });

        jButton2.setText("Buku");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnReferensi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnJurnal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnKasir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAset1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBahan, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNamaUser))
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnHutang, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(btnUser, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnJurnal)
                            .addComponent(btnMenu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnReferensi)
                            .addComponent(btnBahan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnKasir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnStock))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnHutang)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUser)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAset)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(btnAset1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNamaUser)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void btnMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuMouseClicked
        new MasterMenu().setVisible(true);
    }//GEN-LAST:event_btnMenuMouseClicked

    private void btnStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStockMouseClicked
        new HeaderStock().setVisible(true);
    }//GEN-LAST:event_btnStockMouseClicked

    private void btnHutangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHutangMouseClicked
        new FrameHutang().setVisible(true);
    }//GEN-LAST:event_btnHutangMouseClicked

    private void btnAsetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAsetMouseClicked
        new FrameHutang().setVisible(true);
    }//GEN-LAST:event_btnAsetMouseClicked

    private void btnUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserMouseClicked
        new FrameMasterUser().setVisible(true);
    }//GEN-LAST:event_btnUserMouseClicked

    private void btnKasirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKasirActionPerformed
        new FormHeaderKasir().setVisible(true);
    }//GEN-LAST:event_btnKasirActionPerformed

    private void btnReferensiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReferensiActionPerformed
        new MasterReferensi().setVisible(true);
    }//GEN-LAST:event_btnReferensiActionPerformed

    private void btnJurnalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJurnalActionPerformed
        new MasterJurnal().setVisible(true);
    }//GEN-LAST:event_btnJurnalActionPerformed

    private void btnAset1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAset1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAset1MouseClicked

    private void btnAset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAset1ActionPerformed
        new MasterAbsensi().setVisible(true);
    }//GEN-LAST:event_btnAset1ActionPerformed

    private void btnBahanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBahanActionPerformed
        new MasterBahan().setVisible(true);
    }//GEN-LAST:event_btnBahanActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed
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
            java.util.logging.Logger.getLogger(FrameMenuAplikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameMenuAplikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameMenuAplikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMenuAplikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMenuAplikasi().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAset;
    private javax.swing.JButton btnAset1;
    private javax.swing.JButton btnBahan;
    private javax.swing.JButton btnHutang;
    private javax.swing.JButton btnJurnal;
    private javax.swing.JButton btnKasir;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnReferensi;
    private javax.swing.JButton btnStock;
    private javax.swing.JButton btnUser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblNamaUser;
    // End of variables declaration//GEN-END:variables
}
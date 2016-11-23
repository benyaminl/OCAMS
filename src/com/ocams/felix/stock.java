/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocams.felix;

import javax.swing.JOptionPane;

/**
 *
 * @author TelorGoreng
 */
public class stock {
    String idrecord,idbarang,jumlah,idtransaksi,hargabeli;

    public stock(String idrecord, String idbarang, String jumlah, String idtransaksi, String hargabeli) {
        this.idrecord = idrecord;
        this.idbarang = idbarang;
        this.jumlah = jumlah;
        this.idtransaksi = idtransaksi;
        this.hargabeli = hargabeli;
    }
    public void display(){
        JOptionPane.showMessageDialog(null, this.idrecord + " - " + this.idbarang + " - " + this.jumlah + " buah - " + this.idtransaksi
            + " - " + this.hargabeli + " Rupiah");
    }
    public String getIdrecord() {
        return idrecord;
    }

    public void setIdrecord(String idrecord) {
        this.idrecord = idrecord;
    }

    public String getIdbarang() {
        return idbarang;
    }

    public void setIdbarang(String idbarang) {
        this.idbarang = idbarang;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    public String getIdtransaksi() {
        return idtransaksi;
    }

    public void setIdtransaksi(String idtransaksi) {
        this.idtransaksi = idtransaksi;
    }

    public String getHargabeli() {
        return hargabeli;
    }

    public void setHargabeli(String hargabeli) {
        this.hargabeli = hargabeli;
    }
    
    
}

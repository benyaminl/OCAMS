/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocams.abed;

/**
 *
 * @author ABED
 */
public class ClassAset {
    protected String IdUser,NamaAset;
    protected int HargaBeli;
    protected String transaksi;

    public ClassAset(String IdUser, String NamaAset, int HargaBeli, String transaksi) {
        this.IdUser = IdUser;
        this.NamaAset = NamaAset;
        this.HargaBeli = HargaBeli;
        this.transaksi = transaksi;
    }

    public String getIdUser() {
        return IdUser;
    }

    public void setIdUser(String IdUser) {
        this.IdUser = IdUser;
    }

    public String getNamaAset() {
        return NamaAset;
    }

    public void setNamaAset(String NamaAset) {
        this.NamaAset = NamaAset;
    }

    public int getHargaBeli() {
        return HargaBeli;
    }

    public void setHargaBeli(int HargaBeli) {
        this.HargaBeli = HargaBeli;
    }

    public String getTransaksi() {
        return transaksi;
    }

    public void setTransaksi(String transaksi) {
        this.transaksi = transaksi;
    }
    
}

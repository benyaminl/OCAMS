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
public class MasterAset {
    protected String IdTransaksi,IdBarang,NamaBarang,HargaBeli;

    public MasterAset(String IdTransaksi, String IdBarang, String NamaBarang, String HargaBeli) {
        this.IdTransaksi = IdTransaksi;
        this.IdBarang = IdBarang;
        this.NamaBarang = NamaBarang;
        this.HargaBeli = HargaBeli;
    }

    public String getIdTransaksi() {
        return IdTransaksi;
    }

    public void setIdTransaksi(String IdTransaksi) {
        this.IdTransaksi = IdTransaksi;
    }

    public String getIdBarang() {
        return IdBarang;
    }

    public void setIdBarang(String IdBarang) {
        this.IdBarang = IdBarang;
    }

    public String getNamaBarang() {
        return NamaBarang;
    }

    public void setNamaBarang(String NamaBarang) {
        this.NamaBarang = NamaBarang;
    }

    public String getHargaBeli() {
        return HargaBeli;
    }

    public void setHargaBeli(String HargaBeli) {
        this.HargaBeli = HargaBeli;
    }
    
}

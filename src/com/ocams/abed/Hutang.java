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
public class Hutang {
    protected String IdTransaksi,IdHutang,Keterangan,Jumlah,TglJatuhTempo,Operator;

    public Hutang(String IdTransaksi, String IdHutang, String Keterangan, String Jumlah, String TglJatuhTempo, String Operator) {
        this.IdTransaksi = IdTransaksi;
        this.IdHutang = IdHutang;
        this.Keterangan = Keterangan;
        this.Jumlah = Jumlah;
        this.TglJatuhTempo = TglJatuhTempo;
        this.Operator = Operator;
    }

    public String getIdTransaksi() {
        return IdTransaksi;
    }

    public void setIdTransaksi(String IdTransaksi) {
        this.IdTransaksi = IdTransaksi;
    }

    public String getIdHutang() {
        return IdHutang;
    }

    public void setIdHutang(String IdHutang) {
        this.IdHutang = IdHutang;
    }

    public String getKeterangan() {
        return Keterangan;
    }

    public void setKeterangan(String Keterangan) {
        this.Keterangan = Keterangan;
    }

    public String getJumlah() {
        return Jumlah;
    }

    public void setJumlah(String Jumlah) {
        this.Jumlah = Jumlah;
    }

    public String getTglJatuhTempo() {
        return TglJatuhTempo;
    }

    public void setTglJatuhTempo(String TglJatuhTempo) {
        this.TglJatuhTempo = TglJatuhTempo;
    }

    public String getOperator() {
        return Operator;
    }

    public void setOperator(String Operator) {
        this.Operator = Operator;
    }
    
}

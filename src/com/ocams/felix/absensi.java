/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocams.felix;

/**
 *
 * @author TelorGoreng
 */
public class absensi {
    String todayDate,todayTime,idPegawai;

    public absensi(String todayDate, String todayTime, String idPegawai) {
        this.todayDate = todayDate;
        this.todayTime = todayTime;
        this.idPegawai = idPegawai;
    }

    public String getTodayDate() {
        return todayDate;
    }

    public void setTodayDate(String todayDate) {
        this.todayDate = todayDate;
    }

    public String getTodayTime() {
        return todayTime;
    }

    public void setTodayTime(String todayTime) {
        this.todayTime = todayTime;
    }

    public String getIdPegawai() {
        return idPegawai;
    }

    public void setIdPegawai(String idPegawai) {
        this.idPegawai = idPegawai;
    }
    
}

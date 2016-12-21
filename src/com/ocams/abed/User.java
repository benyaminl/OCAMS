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
public class User {
    protected String kdUser,Nama,Alamat,Notlp,Email,Password,SQL;
    
    public User(String kdUser, String Nama, String Alamat, String Notlp, String Email, String Password, String SQL) {
        this.kdUser = kdUser;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.Notlp = Notlp;
        this.Email = Email;
        this.Password = Password;
        this.SQL = SQL;
    }

    public String getKdUser() {
        return kdUser;
    }

    public void setKdUser(String kdUser) {
        this.kdUser = kdUser;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public String getNotlp() {
        return Notlp;
    }

    public void setNotlp(String Notlp) {
        this.Notlp = Notlp;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getSQL() {
        return SQL;
    }

    public void setSQL(String SQL) {
        this.SQL = SQL;
    }
    
}

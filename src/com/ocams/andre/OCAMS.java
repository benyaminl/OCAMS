package com.ocams.andre;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
public class OCAMS {
    public static void main(String[] args) {
        new MasterMenu().setVisible(true);
        new MasterJurnal().setVisible(true);
        new MasterReferensi().setVisible(true);
    }
    public static Connection setKoneksi() {
        String konString = "jdbc:mysql://localhost:3306/ref";
        Connection koneksi = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = (Connection) DriverManager.getConnection(konString,"root","");
            System.out.println("Koneksi Berhasil");
        } catch (ClassNotFoundException ex) {
            System.out.println("Koneksi1 Gagal "+ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Koneksi2 Gagal "+ex.getMessage());
        }
        return koneksi;
    }
    
    public static int execute(String SQL) {
    int status = 0;
    Connection koneksi = setKoneksi();
    try {
        Statement st = koneksi.createStatement();
        status = st.executeUpdate(SQL);
    } catch (SQLException ex) {
        Logger.getLogger(OCAMS.class.getName()).log(Level.SEVERE, null, ex);
    }
    return status;
    }
    
    public static ResultSet executeQuery(String SQL) {
    ResultSet rs = null;
    Connection koneksi = setKoneksi();
    try {
        Statement st = koneksi.createStatement();
        rs = st.executeQuery(SQL);
    } catch (SQLException ex) {
        Logger.getLogger(OCAMS.class.getName()).log(Level.SEVERE, null, ex);
    }
    return rs;
    }
}
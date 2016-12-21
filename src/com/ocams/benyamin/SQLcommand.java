package com.ocams.benyamin;
import java.security.SecureRandom;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 * SQL Class untuk berinteraksi dengan DB mysql menggunakan prepared Statement
 * @author Ben
 */
public class SQLcommand {
    javax.swing.JFrame panel;
    private String user,password,db;
    final String server;
    
    /**
     * Inisiasi Class SQL ini sendiri
     * @param user Username DB mysql-nya
     * @param password Password DB mysql-nya
     * @param db Nama Databasenya 
     * @param server Nama Server DB berada
     */

    public SQLcommand(String user,String password,String db, String server){
        this.user = user; this.password = password; this.db = db; this.server = server;
        this.conn();
    }
    
    /**
     * Function untuk Inisialisasi Koneksi
     * @Return Connection
    */
    private Connection conn() {
        String server = this.server; String db = this.db;
        String user = this.user; String pass = this.password;
        Connection koneksi = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = (Connection) DriverManager
                    .getConnection("jdbc:mysql://"+server+"/"+db,user,pass);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(panel, e.toString(), "Database error", 
                    JOptionPane.ERROR_MESSAGE);
        }
        return koneksi;
    }
    
    /**
     * Function Execute Non Query - Prepared Statemend
     * @param sql SQL Query dalam String
     * @return Integer
     */

    public int executeNonQuery(String sql){
        int status;
        try {
            Statement st = conn().createStatement();
            status = st.executeUpdate(sql);
            return status;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(panel, e.toString(), "Database error", 
                    JOptionPane.ERROR_MESSAGE);
            status = -1;
            return status;
        }
    }
    
    /**
     * Function untuk melakukan Query dengan return sebuah ArrayList String[]
     * @param sql
     * @return
     */
    public ArrayList<String[]> executeQueryGetArray(String sql){
        ResultSet rs = null;
        ArrayList<String[]> data = new ArrayList<>();
        try {
            Statement st = conn().createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                String temp = "";
                int i = 1;
                for(i=1; i<= rs.getMetaData().getColumnCount()-1;i++){
                    temp += rs.getObject(i).toString() + ",";
                }
                temp += rs.getObject(i).toString();
                data.add(temp.split(","));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(panel, e.toString(), "Database error", 
                    JOptionPane.ERROR_MESSAGE);
        }
        return data;
    }

    /**
     * Seperti di Oracle 
     * @param sql String SQL yang di eksekusi
     * @return String data yang dibutuhkan
     */
    public String executeGetScalar(String sql){
        String hasil = ""; ResultSet rs = null;
        try {
            Statement stmt = conn().createStatement();
            rs = stmt.executeQuery(sql); 
            if(rs == null){
                rs.next();
                hasil = rs.getObject(1).toString(); 
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(panel, e.toString(), "Database error", 
                    JOptionPane.ERROR_MESSAGE);
        }
        return hasil;
    }
    
    /**
     * Untuk set panel sehingga kalau error bisa dimunculkan JOptionPane, 
     * Harus selalu di set ketika setiap kali pindah form!
     * @param panel Panel yang aktif sekarang
     */
    public void setPanel(javax.swing.JFrame panel) {
        this.panel = panel;
    }
    
    /**
     * Fungsi Pengecekan User Login, tinggal dipanggil nanti bisa dipakai di IF
     * @param user ID_User Pegawai atau operator
     * @param pass Password User
     * @return Return Boolean Benar atau tidaknya credential yang dimasukan
     */
    public boolean cekLogin(String user, String pass){
       boolean cek = false;
       String passFetch = this.executeGetScalar("SELECT password from USER where ID_user = '" + user + "'");
       if(pass.equals(passFetch)){
           cek = true;
       }
       return cek;
    }
    
    private String randomID(){
        String temp = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
        String hasil = "";
        char charArray[] = temp.toCharArray();
        for (int i = 0; i < 10; i++) {
            Random random = new SecureRandom();
            hasil += String.valueOf(charArray[random.nextInt(charArray.length)]);
        }
        return hasil;
    }
    
    public String transID(){
        String kode ="";
        do {
            kode = randomID();
        } while (Integer.parseInt(executeGetScalar(
                "SELECT COUNT(*) FROM HTRANS WHERE KODE = '" + kode + "'")) > 0);
        return kode;
    }
    
    public int pencatatanJurnalTransaksi(){
        int status = 0;
        
        return status;
    }
}

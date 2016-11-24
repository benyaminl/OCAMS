package com.ocams.benyamin;
// SQL Command adalah untuk melakukan 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class SQLcommand {
    javax.swing.JFrame panel;
    private String user,password,db;
    final String server;
    public SQLcommand(javax.swing.JFrame form,String user,String password,String db, String server){
        panel = form;
        this.user = user; this.password = password; this.db = db; this.server = server;
    }
    
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
    
    public ResultSet executeQuery(String sql){
        ResultSet rs = null;
        try {
            Statement st = conn().createStatement();
            rs = st.executeQuery(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(panel, e.toString(), "Database error", 
                    JOptionPane.ERROR_MESSAGE);
        }
        return rs;
    }
}

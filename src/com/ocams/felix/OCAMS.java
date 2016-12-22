/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocams.felix;

import com.ocams.abed.FrameLoginUser;
import com.ocams.abed.User;
import com.ocams.benyamin.SQLcommand;
import javax.swing.JFrame;

/**
 *
 * @author Gp62
 */
public class OCAMS {
     public static SQLcommand SQL;
    public static User userYangLogin;
    
    public static void main(String[] args) {
        String user = "root", pass = "", db = "test", server = "localhost";
        SQL = new SQLcommand(user, pass, db, server);
        
        JFrame f = new HeaderStock();
    f.setVisible(true);
    }
    
    
}

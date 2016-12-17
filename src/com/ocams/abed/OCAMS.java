package com.ocams.abed;

import com.ocams.benyamin.SQLcommand;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ben
 */
public class OCAMS {
    public static SQLcommand SQL;
    public static User userYangLogin;
    
    public static void main(String[] args) {
        String user = "root", pass = "", db = "ocams", server = "localhost";
        SQL = new SQLcommand(user, pass, db, server);
        new FrameMasterUser().setVisible(true);
    }
}

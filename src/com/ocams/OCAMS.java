package com.ocams;

import com.ocams.abed.FrameLoginUser;
import com.ocams.abed.User;
import com.ocams.andre.MasterReferensi;
import com.ocams.benyamin.SQLcommand;

public class OCAMS {
    public static SQLcommand SQL;
    public static User userYangLogin;
    
    public static void main(String[] args) {
        String user = "root", pass = "", db = "ocams", server = "localhost";
        SQL = new SQLcommand(user, pass, db, server);
        new FrameLoginUser().setVisible(true);
    }
}
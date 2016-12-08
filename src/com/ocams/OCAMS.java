package com.ocams;

import com.ocams.abed.FrameLoginUser;
import com.ocams.abed.Koneksi;

public class OCAMS {
    
    public static void main(String[] args) {
        Koneksi test = new Koneksi();
        test.setKoneksi();
        new FrameLoginUser().setVisible(true);
    }
}

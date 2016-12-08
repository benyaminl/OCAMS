package com.ocams.benyamin;

// Transaksi akan menjadi class yang paling utama disini, dimana class class ini 
// berfungsi penuh dan memiliki keterkaitan dengan segala hal yang berhubungan 
// dengan ini
public class Transaksi {
    private String id, tanggal, operator;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
    
}

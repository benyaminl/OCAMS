package com.ocams.benyamin;

// Transaksi akan menjadi class yang paling utama disini, dimana class class ini 
// berfungsi penuh dan memiliki keterkaitan dengan segala hal yang berhubungan 
// dengan ini
public class Transaksi {
    private String id, jenis, operator;

    public Transaksi(String id, String jenis, String operator) {
        this.id = id;
        this.jenis = jenis;
        this.operator = operator;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
    
}

package com.example.agung.sabtu1;

/**
 * Created by AGUNG on 11/11/2017.
 */

public class DataSayur {
    private String namaSayur;
    private String harga;
    private String jumStok;


    //construktor
    public DataSayur(String namaSayur, String harga, String jumStok) {
        this.namaSayur = namaSayur;
        this.harga = harga;
        this.jumStok = jumStok;
    }

    public String getNamaSayur() {
        return namaSayur;
    }

    public void setNamaSayur(String namaSayur) {
        this.namaSayur = namaSayur;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getJumStok() {
        return jumStok;
    }

    public void setJumStok(String jumStok) {
        this.jumStok = jumStok;
    }


}

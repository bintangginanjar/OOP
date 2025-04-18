/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.latihan_soal1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bintang
 */
public class Klub {
    
    private String namaKlub;
    private String jumlahPemain;
    private List<Pemain> listPemain = new ArrayList();
    
    public Klub(String namaKlub) {
        this.namaKlub = namaKlub;
    }
    
    public String getNamaKlub() {
        return namaKlub;
    }
    
    public Integer getJumlahPemain() {
        return listPemain.size();
    }
    
    public List<Pemain> getListPemain() {
        return listPemain;
    }
    
    public void addPemain(Pemain pemain) {
        if (this.listPemain.size() <= 24) {
            this.listPemain.add(pemain);
        } else {
            System.out.println("Jumlah pemain sudah mencapai maksimal");
        }
    }
    
    public Pemain getPemain(int i) {
        return listPemain.get(i);
    }
    
}

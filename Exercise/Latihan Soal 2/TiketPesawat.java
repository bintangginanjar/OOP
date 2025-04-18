/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.latihan_soal2;

/**
 *
 * @author bintang
 */
public class TiketPesawat extends Tiket {
    
    private Double beratBagasi;
    
    public TiketPesawat(String nomorTiket, String tanggalTiket, Double hargaTiket, Double beratBagasi) {
        setNomor(nomorTiket);
        setTanggal(tanggalTiket);
        setHarga(hargaTiket);
        
        if (beratBagasi >= 0 && beratBagasi <= 15) {
            this.beratBagasi = beratBagasi;
        } else {
            System.out.println("Berat bagasi berada diantara 0 s.d 15 kg");
        }        
    }
    
    @Override
    public Double getTotalBayar() {
        if (beratBagasi < 10) {
            return getHarga();
        } else {
            return getHarga() + (beratBagasi * 10000);
        }
        
    }    
    
}

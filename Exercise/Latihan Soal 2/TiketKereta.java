/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.latihan_soal2;

/**
 *
 * @author bintang
 */
public class TiketKereta extends Tiket {
    
    private String kelas;
    
    public TiketKereta(String nomorTiket, String tanggalTiket, Double hargaTiket, String kelas) {
        setNomor(nomorTiket);
        setTanggal(tanggalTiket);
        setHarga(hargaTiket);
        this.kelas = kelas;
    }
    
    @Override
    public Double getTotalBayar() {
        if (kelas == "Ekonomi") {
            return getHarga() + (getHarga()*10)/100 - 50000;
        } else if (kelas == "Eksekutif") {
            return getHarga() + (getHarga()*25)/100 - 50000;
        } else {
            return getHarga() + (getHarga()*50)/100;
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.latihan_soal2;

/**
 *
 * @author bintang
 */
public class TiketBioskop extends Tiket {
    
    public Boolean isWeekend;
    
    public TiketBioskop(String nomorTiket, String tanggalTiket, Double hargaTiket, Boolean isWeekend) {
        setNomor(nomorTiket);
        setTanggal(tanggalTiket);
        setHarga(hargaTiket);
        this.isWeekend = isWeekend;
    }
    
    @Override
    public Double getTotalBayar() {
        if (isWeekend) {
            return getHarga() + 15000;
        } else {
            return getHarga();
        }
    }
    
}

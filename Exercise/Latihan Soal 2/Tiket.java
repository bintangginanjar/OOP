/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.latihan_soal2;

/**
 *
 * @author bintang
 */
public abstract class Tiket {
    
    private String nomor;
    private String tanggal;
    private Double harga;
    
    public void setNomor(String nomor) {
        this.nomor = nomor;
    }
    
    public String getNomor() {
        return nomor;
    }
    
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
    
    public String getTanggal() {
        return tanggal;
    }
    
    public void setHarga(Double harga) {
        this.harga = harga;
    }
    
    public Double getHarga() {
        return harga;
    }
    
    public abstract Double getTotalBayar();
}

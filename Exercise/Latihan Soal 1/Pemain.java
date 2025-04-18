/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.latihan_soal1;

/**
 *
 * @author bintang
 */
public class Pemain {
    
    private String nama;
    private Integer nomorPunggung;
    private Integer jumlahGol;
    
    public Pemain(String nama) {
        if (nama.isBlank()) {
            System.out.println("Nama pemain tidak boleh kosong");
        } else {
            this.nama = nama;
        }
        
    }
    
    public Pemain(String nama, Integer nomorPunggung) {
        if (nama.isBlank()) {
            System.out.println("Nama pemain tidak boleh kosong");
        } else {
            this.nama = nama;
        }
        
        if ((nomorPunggung >= 1) && (nomorPunggung <= 24)) {
            this.nomorPunggung = nomorPunggung;
        } else {
            System.out.println("Nomor punggung yang diperbolehkan antara 1 sampai 24");
        }
    }
    
    public Pemain(String nama, Integer nomorPunggung, Integer jumlahGol) {
        if (nama.isBlank()) {
            System.out.println("Nama pemain tidak boleh kosong");
        } else {
            this.nama = nama;
        }
        
        if ((nomorPunggung >= 1) && (nomorPunggung <= 24)) {
            this.nomorPunggung = nomorPunggung;
        } else {
            System.out.println("Nomor punggung yang diperbolehkan antara 1 sampai 24");
        }
        
        if (jumlahGol < 0) {
            System.out.println("Jumlah gol tidak boleh negatif");
        } else {
            this.jumlahGol = jumlahGol;
        }
    }
    
    public String getNama() {
        return nama;
    }
    
    public Integer getNomorPunggung() {
        return nomorPunggung;
    }
    
    public Integer getJumlahGol() {
        return jumlahGol;
    }
    
}

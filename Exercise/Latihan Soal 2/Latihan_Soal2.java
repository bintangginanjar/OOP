/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.oop.latihan_soal2;

/**
 *
 * @author bintang
 */
public class Latihan_Soal2 {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        
        TiketPesawat tPesawat = new TiketPesawat("123456", "2024-04-14", 800000.0, 12.0);
        TiketBioskop tBioskop = new TiketBioskop("123456", "2024-04-14", 50000.0, true);
        TiketKereta tKereta = new TiketKereta("123456", "2024-04-14", 250000.0, "Eksekutif");
        
        System.out.println("Tiket pesawat");
        System.out.println("Nomor " + tPesawat.getNomor());
        System.out.println("Tanggal " + tPesawat.getTanggal());
        System.out.println("Harga " + tPesawat.getHarga());
        System.out.println("Total bayar " + tPesawat.getTotalBayar());
        
        System.out.println("Tiket bioskop");
        System.out.println("Nomor " + tBioskop.getNomor());
        System.out.println("Tanggal " + tBioskop.getTanggal());
        System.out.println("Harga " + tBioskop.getHarga());
        System.out.println("Total bayar " + tBioskop.getTotalBayar());

        System.out.println("Tiket kereta");
        System.out.println("Nomor " + tKereta.getNomor());
        System.out.println("Tanggal " + tKereta.getTanggal());
        System.out.println("Harga " + tKereta.getHarga());
        System.out.println("Total bayar " + tKereta.getTotalBayar());
    }
}

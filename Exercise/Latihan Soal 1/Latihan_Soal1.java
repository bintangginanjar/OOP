/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.oop.latihan_soal1;

/**
 *
 * @author bintang
 */
public class Latihan_Soal1 {

    public static void main(String[] args) {
        
        Klub liverpool = new Klub("Liverpool FC");
        Pemain moSalah = new Pemain("Mohammed Salah", 11, 32);
        Pemain vanDijk = new Pemain("Virgil Van Dijk", 4, 8);
        Pemain nunez = new Pemain("Darwin Nunez");
        liverpool.addPemain(moSalah);
        liverpool.addPemain(vanDijk);
        liverpool.addPemain(nunez);
        
        Klub mancity = new Klub("Manchester City");
        Pemain kdb = new Pemain("Kevin De Bruyne", 17, 5);
        Pemain rodri = new Pemain("Rodri", 16, 0);
        Pemain halland = new Pemain("Erling Halland", 9, 20);
        mancity.addPemain(kdb);
        mancity.addPemain(rodri);
        mancity.addPemain(halland);
        
        System.out.println("Nama klub : " + liverpool.getNamaKlub());
        System.out.println("Jumlah pemain : " + liverpool.getJumlahPemain());
        System.out.println("Daftar pemain : ");
        for (int i = 0; i < liverpool.getJumlahPemain(); i++) {
            Pemain p = liverpool.getPemain(i);
            System.out.println(i+1 + ". " + p.getNama() + ", " + p.getNomorPunggung() + ", " + p.getJumlahGol());
        }
        
        System.out.println("Nama klub : " + mancity.getNamaKlub());
        System.out.println("Jumlah pemain : " + mancity.getJumlahPemain());
        System.out.println("Daftar pemain : ");
        for (int i = 0; i < mancity.getJumlahPemain(); i++) {
            Pemain p = mancity.getPemain(i);
            System.out.println(i+1 + ". " + p.getNama() + ", " + p.getNomorPunggung() + ", " + p.getJumlahGol());
        }
    }
}

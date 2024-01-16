/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.game3;

public class Senjata {
    private String namaSenjata;
    private int jumlahPeluru;
    private double berat;
    private String warna;

    public Senjata(String jenis, String namaSenjata, int jumlahPeluru, double berat, String warna) {
        this.namaSenjata = namaSenjata;
        this.jumlahPeluru = jumlahPeluru;
        this.berat = berat;
        this.warna = warna;
    }

    public void tembak() {
        if (jumlahPeluru > 0) {
            System.out.println("Menembak dengan " + namaSenjata + ". Peluru tersisa: " + jumlahPeluru);
            kurangiPeluru();
        } else {
            System.out.println("Peluru habis. Harap reload.");
        }
    }

    public void lempar() {
        System.out.println("Melempar " + namaSenjata + " " + jenis);
        // Logika jika ingin memberikan efek lemparan tertentu
    }

    public void kurangiPeluru() {
        if (jumlahPeluru > 0) {
            jumlahPeluru--;
            System.out.println("Jumlah peluru tersisa: " + jumlahPeluru);
        } else {
            System.out.println("Peluru habis. Harap reload.");
        }
    }

    public void reload() {
        System.out.println("Mengisi ulang peluru untuk " + namaSenjata);
        // Logika untuk mengisi ulang peluru
        jumlahPeluru = 10; // Misalnya, diisi kembali dengan 10 peluru
        System.out.println("Peluru diisi ulang. Jumlah peluru: " + jumlahPeluru);
    }

    public String getNamaSenjata() {
        return namaSenjata;
    }
}

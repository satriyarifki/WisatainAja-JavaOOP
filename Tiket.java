/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wisata;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Random;

/**
 *
 * @Satriya
 */
public class Tiket {
    private String idTiket;
    private Pengunjung pemesan;
    private TempatWisata tw;
    private int harga;
    private LocalDateTime tanggal;

    public Tiket(Pengunjung pemesan, TempatWisata tw) {
        Random rand = new Random();
        int upperbound = 2500;
        int random = rand.nextInt(upperbound);
        this.idTiket = String.valueOf(random);
        this.pemesan = pemesan;
        this.tw = tw;
        this.harga = tw.getHargaTiket();
        this.tanggal = java.time.LocalDateTime.now();
    }

    public Tiket() {
    }

    public String getIdTiket() {
        return idTiket;
    }

    public Pengunjung getPemesan() {
        return pemesan;
    }

    public TempatWisata getTw() {
        return tw;
    }

    public int getHarga() {
        return harga;
    }

    public LocalDateTime getTanggal() {
        return tanggal;
    }
}

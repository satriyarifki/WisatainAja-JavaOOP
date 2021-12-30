/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wisata;

/**
 *
 * @Satriya
 */
public class Pengunjung {
    protected String nama, alamat, gender;
    protected int umur;

    public Pengunjung(String nama, String alamat, String gender, int umur ) {
        this.nama = nama;
        this.alamat = alamat;
        this.gender = gender;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getUmur() {
        return umur;
    }

    public String getGender() {
        return gender;
    }
}


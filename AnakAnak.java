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
public class AnakAnak extends Pengunjung{
    private String nis;

    public AnakAnak(String nis, String nama, String alamat, String gender, int umur) {
        super(nama, alamat, gender, umur);
        this.nis = nis;
    }

    public String getNis() {
        return nis;
    }
}

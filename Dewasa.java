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
public class Dewasa extends Pengunjung{
    private String NIK;

    public Dewasa(String NIK, String nama, String alamat, String gender, int umur) {
        super(nama, alamat, gender, umur);
        this.NIK = NIK;
    }

    public Dewasa() {
        super(null, null, null, 0);
    }

    public String getNIK() {
        return NIK;
    }
}

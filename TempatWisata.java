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
public class TempatWisata implements Kategori{
    private String namaWisata, kategori, jamOperasi;
    private int hargaTiket;


    public TempatWisata(String namaWisata, String kategori, String jamOperasi, int hargaTiket) {
        this.namaWisata = namaWisata;
        this.kategori = kategori;
        this.jamOperasi = jamOperasi;
        this.hargaTiket = hargaTiket;
    }
    
    public TempatWisata() {
    }
    @Override
    public void ketentuan() {
        switch (kategori){
            case "A" :
                System.out.println("Wahana untuk 17 tahun ke atas");
                break;
            case "C" :
                System.out.println("Wahana untuk anak umur 3 - 12 tahun");
                break;
            case "F" :
                System.out.println("Wahana untuk segala Umur");
                break;
        }
    }
    
    public void info(){
        System.out.println("");
        System.out.println("    Nama Wisata         : " + this.namaWisata);
        System.out.println("    Kategori Wisata     : " + this.kategori);
        System.out.println("    Jam Operasi         : " + this.jamOperasi);
        System.out.println("    Harga Tiket         : " + this.hargaTiket);
        System.out.println("");
    }

    public String getJamOperasi() {
        return jamOperasi;
    }
    
    public int getHargaTiket() {
        return hargaTiket;
    }
    public String getNamaWisata() {
        return namaWisata;
    }
    public String getKategori() {
        return kategori;
    }
}

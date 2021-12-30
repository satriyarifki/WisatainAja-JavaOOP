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
public class Pembayaran {
    private String metode;
    private Tiket tiket;

    public Pembayaran(String metode, Tiket tiket) {
        this.metode = metode;
        this.tiket = tiket;
    }

    public Pembayaran() {
    }

    public void setMetode(String metode) {
        this.metode = metode;
    }
    
    public void info(){
        Pengunjung p = tiket.getPemesan();
        if( p instanceof Dewasa){
            Dewasa eb = (Dewasa) p;
            System.out.println("");
            System.out.println("------------------------------------------");
            System.out.println("ID Tiket        : " + tiket.getIdTiket());
            System.out.println("Nama Pemesan    : " + tiket.getPemesan().getNama());
            System.out.println("NIK pemesan     : " + eb.getNIK());
            System.out.println("Metode Bayar    : " + this.metode);
            System.out.println("Tanggal Pesan   : " + tiket.getTanggal());
            System.out.println("Harga Tiket     : Rp" + tiket.getHarga());
            System.out.print("Ketentuan       : ");
            tiket.getTw().ketentuan();
            System.out.println("------------------------------------------");
        }else if(p instanceof AnakAnak){
            AnakAnak eb = (AnakAnak) p;
            System.out.println("");
            System.out.println("------------------------------------------");
            System.out.println("ID Tiket        : " + tiket.getIdTiket());
            System.out.println("Nama Pemesan    : " + tiket.getPemesan().getNama());
            System.out.println("NISN pemesan     : " + eb.getNis());
            System.out.println("Metode Bayar    : " + this.metode);
            System.out.println("Tanggal Pesan   : " + tiket.getTanggal());
            System.out.println("Harga Tiket     : Rp" + tiket.getHarga());
            System.out.print("Ketentuan       : ");
            tiket.getTw().ketentuan();
            System.out.println("------------------------------------------");
        }
    }
}

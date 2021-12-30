/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wisata;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @Satriya
 */
public class main {
    public static void main(String[] args){   
        menuawal();
    }
    
    public static void menuawal(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("            WISATAIN AJA            ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("1. Pesan Tiket ");
        System.out.println("2. Info Tempat Wisata ");
        System.out.println("3. Keluar");
        System.out.print("Pilih Menu : ");
        int t = input.nextInt();
        if (t == 1){
            inputdata(t);
        } else if (t==2){
            infowisata();
        } else if (t == 3){
            System.out.println("Terima Kasih!!!");
        } 
        else {
            System.out.println("Pilihan tidak valid");
            menuawal();
        }
        
    }
    
    public static void inputdata(int t){
        Scanner input = new Scanner(System.in);
        Scanner strput = new Scanner(System.in);
        
//        Input Data Pemesan
        if (t == 1){
            System.out.print("Masukkan Nama           :  ");
            String nam = strput.next();
            System.out.print("Masukkan Umur           :  ");
            int um = input.nextInt();
            System.out.print("Masukkan Gender (L/P)   :  ");
            String gen = strput.next();
            if (um < 17 ){
                System.out.print("Masukkan NISN           :  ");
                String nis = strput.next();
                System.out.print("Masukkan Alamat         :  ");
                String al = input.next();
                AnakAnak anak = new AnakAnak(nis, nam, al, gen, um);
                pilihWisata(anak);
            } else {
                System.out.print("Masukkan No.KTP         :  ");
                String nik = strput.next();
                System.out.print("Masukkan Alamat         :  ");
                String ala = input.next();
                Dewasa dws = new Dewasa(nik, nam, ala, gen, um);
                pilihWisata(dws);
            } 
        }
    }
    
    public static void pilihWisata(Pengunjung peng){
        Scanner input = new Scanner(System.in);
        Scanner strput = new Scanner(System.in);
        //        List Tempat Wisata
        TempatWisata tw1 = new TempatWisata("Jatim Park 3", "F", "10.00 - 20.00 WIB", 50000);
        TempatWisata tw2 = new TempatWisata("Selecta", "F", "10.00 - 21.00 WIB", 60000);
        TempatWisata tw3 = new TempatWisata("Museum Angkut", "F", "10.00 - 21.00 WIB", 75000);
        TempatWisata tw4 = new TempatWisata("Omah Kayu", "F", "10.00 - 21.00 WIB", 30000);
        
        //        Menu Wisata
        System.out.println("");
        System.out.println("Pilih Wisata");
        System.out.println("~~~~~~~~~~~~~");
        System.out.println("    1. " + tw1.getNamaWisata());
        System.out.println("    2. " + tw2.getNamaWisata());
        System.out.println("    3. " + tw3.getNamaWisata());
        System.out.println("    4. " + tw4.getNamaWisata());
        System.out.print("Pilih : ");
        int pil = input.nextInt();
        switch (pil){
            case 1 :
                Tiket tik = new Tiket(peng, tw1);
                pembayaran(tik);
                break;
            case 2 :
                Tiket tik2 = new Tiket(peng, tw2);
                pembayaran(tik2);
                break;
            case 3 :
                Tiket tik3 = new Tiket(peng, tw3);
                pembayaran(tik3);
                break;
            case 4 :
                Tiket tik4 = new Tiket(peng, tw4);
                pembayaran(tik4);
                break;
            default :
                System.out.println("Tolong pilih Wisata");
                pilihWisata(peng);
                break;
        }
    }
    
    public static void pembayaran(Tiket tik){
        Scanner input = new Scanner(System.in);
        Scanner strput = new Scanner(System.in);
        
//        Pilih Metode Bayar
        System.out.println("");
        System.out.println("Pilih Metode Bayar");
        System.out.println("~~~~~~~~~~~~~");
        System.out.println("    1. On The Spot");
        System.out.println("    2. Transfer Bank");
        System.out.print("Pilih : ");
        int pil = input.nextInt();
        if (pil == 1){
            Pembayaran pem = new Pembayaran("On The Spot (Cash/Tunai)", tik);
            pem.info();
        } else if (pil == 2){
            System.out.println("");
            System.out.println("Virtual Number Transfer : 00122" + tik.getIdTiket());
            Pembayaran pem = new Pembayaran("Transfer Bank", tik);
            pem.info();
        } else {
            System.out.println("Pilihlah metode pembayaran dengan benar!!");
            pembayaran(tik);
        }
        
//        Pemesanan Lain
        System.out.println("");
        System.out.println("Apakah ingin memesan tiket lagi ? (Y/T)");
        String str = strput.next();
        if(str.equalsIgnoreCase("y")){
            menuawal();
        } else if (str.equalsIgnoreCase("t")){
            System.out.println("Terima Kasih atas pemesanan anda");
        }
    }
    
    public static void infowisata(){
        Scanner input = new Scanner(System.in);
        Scanner strput = new Scanner(System.in);
        TempatWisata tw1 = new TempatWisata("Jatim Park 3", "F", "09.00 - 20.00 WIB", 50000);
        TempatWisata tw2 = new TempatWisata("Selecta", "F", "09.00 - 21.00 WIB", 60000);
        TempatWisata tw3 = new TempatWisata("Museum Angkut", "F", "11.00 - 21.00 WIB", 75000);
        TempatWisata tw4 = new TempatWisata("Omah Kayu", "F", "08.00 - 22.00 WIB", 30000);
        
        System.out.println("");
        System.out.println("List Tempat Wisata");
        System.out.println("~~~~~~~~~~~~~");
        System.out.print("    1. ");
        tw1.info();
        System.out.print("    2. " );
        tw2.info();
        System.out.print("    3. " );
        tw3.info();
        System.out.print("    4. " );
        tw4.info();
        
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("1. Pesan Tiket ");
        System.out.println("2. Keluar");
        System.out.print("Pilih : ");
        int t = input.nextInt();
        if (t == 1){
            inputdata(t);
        } else if (t == 2){
            System.out.println("Terima Kasih!!!");
        } 
        else {
            System.out.println("Pilihan tidak valid");
            menuawal();
        }
    }
}

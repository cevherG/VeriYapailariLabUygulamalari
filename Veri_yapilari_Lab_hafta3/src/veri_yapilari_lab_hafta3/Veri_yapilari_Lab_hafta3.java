package veri_yapilari_lab_hafta3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Veri_yapilari_Lab_hafta3 {

    public static void main(String[] args) throws IOException {

        Dizi dizi = new Dizi(6);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int secim = 0;
        do {
            System.out.println("*******************Menu**********************");
            System.out.println("1-Ekle");
            System.out.println("2-Sil");
            System.out.println("3-Güncelle");
            System.out.println("4-Ekrana yazdir");
            System.out.println("5-Ara");
            System.out.println("8-Cikis");
            System.out.print("Seciminizi giriniz : ");
            secim = Integer.valueOf(br.readLine());
            String kelime;
            switch (secim) {
                case 1:
                    System.out.print("Eklemecek kelimeyi giriniz :");
                    kelime = br.readLine();
                    dizi.ekle(kelime);
                    break;
                case 2:
                    System.out.print("Silinecek kelimeyi giriniz :");
                    kelime = br.readLine();
                    dizi.sil(kelime);
                    break;
                case 3:
                    dizi.yazdir();
                    System.out.print("Degistirmek istediginiz kelimeyi giriniz");
                    kelime = br.readLine();
                    System.out.print("ikinci kelimeyi giriniz");
                    String guncellenecekKelime = br.readLine();
                    dizi.guncelle(kelime, guncellenecekKelime);
                    break;
                case 4:
                    System.out.println("Dizideki elemanlar :");
                    dizi.yazdir();
                    break;
                case 5:
                    System.out.print("Aranacak kelime : ");
                    kelime=br.readLine();
                    System.out.println(dizi.arama(kelime));
                    break;
                case 8:
                    System.out.println("Cıkıs yapılıyor");
                    secim = 8;
                    break;
            }
        } while (secim != 8);

    }

}

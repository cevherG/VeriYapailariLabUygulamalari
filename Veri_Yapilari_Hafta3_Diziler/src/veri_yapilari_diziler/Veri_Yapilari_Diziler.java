package veri_yapilari_diziler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Veri_Yapilari_Diziler {

    public static void main(String[] args) throws IOException {

        /*Random r=new Random();
        int []dizi=new int[10];
        int []dizi2={5,6,7};
        
        //ekleme(insertion) , silme ( deletetion ) ,guncelleme (update) , arama(search)
        //boyut (size , lenght)
        
        for (int i=0;i<10;i++) {
            dizi[i]=r.nextInt(2)+1;
        }
        System.out.println(Arrays.toString(dizi));*/
 /*
        int dizi[]={5,6,7,8,9,2,6};
        
        System.out.println(Arrays.toString(dizi));
        int N=dizi.length;
        boolean found=false;
        for (int i=0;i<N-1;i++){// dizi sınırlarına ulasmaması için n-1 kadar donmesi gerekiyor
              if(dizi[i]==2){
                  found=true;
                  N--;
              } 
              if(found)
              {
                  dizi[i]=dizi[i+1];
              }
        }
        System.out.print("[");
        for (int i=0;i<N;i++) {
            System.out.print(+dizi[i]+", ");            
        }
        System.out.print("]");*/
        Dizi d = new Dizi(10);
        d.ekle(12);
        d.yazdir();
        System.out.println();
        if(d.arama(12)!=-1)
        {
            System.out.println(" sayi bulundu indis no :"+d.arama(12));
        }
        d.guncelle(12,15);
        d.yazdir();
       
        
        
        
        
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input=0;
        int sayi=0;
        do {
            
            System.out.println("***************MENÜ*******************");
            System.out.println("1- eleman ekleme");
            System.out.println("7- elemanlari göster");
            System.out.println("8- çıkış");
            System.out.println("**************************************");
            System.out.print("Seciminiz: ");
            input=Integer.valueOf(br.readLine());
            
            switch(input){
                case 1:
                    System.out.println("eklenecek elemani giriniz : ");
                    sayi=Integer.valueOf(br.readLine());
                    d.ekle(sayi);
                    break;
                case 7:
                    d.yazdir();
                    break;
                case 8:
                    input=8;
                    break;
            }
            
        } while (input !=8);
    */
    }

}

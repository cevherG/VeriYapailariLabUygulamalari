package veri_yapilari_diziler;

public class Dizi {

    private int boyut;
    private int[] elemanlar;
    private int indis;

    public Dizi(int boyut) {
        this.boyut = boyut;
        this.elemanlar = new int[boyut];
        this.indis = 0;
    }

    public void ekle(int sayi) {
        if (this.indis < this.boyut) {
            this.elemanlar[indis++] = sayi;
            //this.indis++;
        } else {
            System.out.println("Dizi dolu");
        }
    }

    public void sil(int sayi) {
        int i = arama(sayi);
        if (i != -1) {
            while (i < this.indis - 1) {
                this.elemanlar[i] = this.elemanlar[i + 1];
                i++;
            }
            this.indis--;
        } else {
            System.out.println("sayi bulunamadi");
        }
    }

    public void guncelle(int silinecek,int sayi) {
        int i = arama(silinecek);
        if (i != -1) {
            this.elemanlar[i] = sayi;
        } else {
            System.out.println("sayi bulunamadi");
        }
    }

    public int arama(int aranan) {
        /*
            aranan eleman bulunursa index degeri return ediliyor
            eger eleman yok ise indis degeri negatif olamayacagı için -1 return ediliyor
         */
        for (int index = 0; index < this.indis; index++) {
            if (elemanlar[index] == aranan) {
                return index;
            }
        }
        return -1;
    }

    public void yazdir() {
        System.out.print("[");
        for (int i = 0; i < indis; i++) {
            System.out.print(elemanlar[i] + ", ");
        }
        System.out.print("]");
    }
}

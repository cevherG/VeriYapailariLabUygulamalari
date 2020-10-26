package veri_yapilari_lab_hafta3;

public class Dizi {

      int boyut;
      String[] elemanlar;
      int indis;

    public Dizi(int boyut) {
        this.boyut = boyut;
        this.elemanlar = new String[boyut];
        this.indis = 0;
    }

    public void ekle(String kelime) {
        if (this.indis < this.boyut) {
            this.elemanlar[this.indis] = kelime;
            this.indis++;
        } else {
            System.out.println("Dizi dolu");
        }
    }

    public void sil(String kelime) {
        int i = arama(kelime);
        if (i != -1) {
            while (i < this.indis - 1) {
                this.elemanlar[i] = this.elemanlar[i + 1];
                i++;
            }
            this.indis--;
        } else {
            System.out.println("silinecek bulunamadi");
        }
    }

    public void guncelle(String silinecek,String kelime) {
        int i = arama(silinecek);
        if (i != -1) {
            this.elemanlar[i] = kelime;
        } else {
            System.out.println("güncellenecek kelime bulunamadi");
        }
    }

    public int arama(String aranan) {
        
        for (int index = 0; index < this.indis; index++) {
            if (elemanlar[index].equals(aranan)) {
                return index;
            }
        }
        return -1;
    }
     
    public void yazdir() {
        if (this.indis <= 0) {
            System.out.println("Dizinin bos");
        } else {
            System.out.print("[");
            for (int i = 0; i < indis; i++) {
                System.out.print(elemanlar[i] + ", ");
            }
            System.out.print("]");
        }
    }

}

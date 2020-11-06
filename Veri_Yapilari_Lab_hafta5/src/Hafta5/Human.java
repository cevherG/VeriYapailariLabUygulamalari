
package Hafta5;

public class Human {
    
    private String ad ;
    private String soyad;
    private int tcNo;
    private int dogunYili;

    public Human(String ad, String soyad, int tcNo, int dogunYili) {
        this.ad = ad;
        this.soyad = soyad;
        this.tcNo = tcNo;
        this.dogunYili = dogunYili;
    }

    public void displayHuman(){
        System.out.print(" "+this.ad+"\t"+this.soyad+"\t"+this.tcNo+"\t"+this.dogunYili);
    }
}

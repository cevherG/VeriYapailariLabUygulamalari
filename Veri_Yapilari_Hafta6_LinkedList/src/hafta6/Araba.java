package hafta6;

public class Araba {

    private String marka;
    private int yil;

    public Araba(String marka, int yil) {
        this.marka = marka;
        this.yil = yil;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    public void display() {
        System.out.print("[ " + this.yil + " " + this.marka + " ]");
    }
}

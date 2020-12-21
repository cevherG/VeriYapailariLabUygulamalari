package hafta11.BinaryTree;

public class Dizi {

    private int size;
    private char[] elemans;
    private int indis;

    public Dizi(int size) {
        this.size = size;
        this.elemans = new char[size];
        this.indis = 0;
    }

    public char add(char value) {
        if (this.indis < this.size) {
            this.elemans[indis++] = value;
            //this.indis++;
        } else {
            System.out.println("Dizi dolu");
        }
        return value;
    }
    
    public String getString(){
        String s="";
         for (int i = 0; i < indis; i++) {
            s+=elemans[i];
        }
        return s;
    }
    
    public void printArray() {
        System.out.print("[");
        for (int i = 0; i < indis; i++) {
            System.out.print(elemans[i] + ", ");
        }
        System.out.print("]");
    }
}

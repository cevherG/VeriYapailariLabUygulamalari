package Hafta8;

public class Triangular {
    
    public void printTriangle(int s) {
        if(s<1){
            return ;
        }
        printTriangle(s-1);
        for (int i = 0; i < s; i++) {
            System.out.print("#");
        }
        System.out.print("\n");
    }
}

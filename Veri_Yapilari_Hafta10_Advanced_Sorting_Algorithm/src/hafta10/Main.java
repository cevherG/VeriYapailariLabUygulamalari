package hafta10;

public class Main {

    public static void main(String[] args) {
        
        //Radix-Sort
        int a[]={1,99,2,98,52,1,35,9,12,45};
        RadixSort r=new RadixSort(a, a.length);
        
        for (int i = 0; i < a.length; i++) {
            System.out.print(" "+a[i]);
        }
//--------------------------------------------------------------

    }

}

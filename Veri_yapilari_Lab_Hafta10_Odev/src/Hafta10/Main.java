package Hafta10;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        
        String a[] = {"cevher", "ali", "ece", "muzaffer", "asi", "nzz"};

        Radix r=new Radix(a);
        r.radixSort();
        
        for (int i = 0; i < a.length; ++i) {
            System.out.println(a[i]);
        }
    }

}

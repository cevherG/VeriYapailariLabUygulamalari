
package veri_yapilari_simplesorting;

import java.util.Arrays;

public class Veri_Yapilari_SimpleSorting {

    public static void main(String[] args) {
        /*
        //Integer array ile sırama
        int array[]={17, 22, 26, 6, 37, 37, 5, 24, 16, 26};
        int array2[]={2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
        Sorting s=new Sorting(array);
        s.insertionSort();
        System.out.println(Arrays.toString(array));
        */
        //String array ile sıralama
        String s1[]={ "c", "a", "az", "aka", "zaza"};
        Sorting s=new Sorting(s1);
        s.StringboubleSort();
        System.out.println(Arrays.toString(s1));
    }
    
}

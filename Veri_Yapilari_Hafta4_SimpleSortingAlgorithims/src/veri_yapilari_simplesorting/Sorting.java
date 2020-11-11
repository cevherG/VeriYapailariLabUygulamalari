package veri_yapilari_simplesorting;

import java.util.Arrays;
import java.util.Random;

public class Sorting {

    private int array[];
    private String a[];

    public Sorting(int size) {
        this.array = new int[size];
        Random random = new Random();
        for (int i = 0; i < this.array.length; i++) {
            this.array[i] = random.nextInt(50);
        }
        System.out.println(Arrays.toString(this.array));
        System.out.println("****************************************");
    }

    public Sorting(int array[]) {
        this.array = array;
        System.out.println(Arrays.toString(array));
        System.out.println("*****************************************");
    }
    public Sorting(String array[]) {
        this.a = array;
        System.out.println(Arrays.toString(array));
        System.out.println("*****************************************");
        
    }
    
     public void StringboubleSort() {
        String tmp;
        boolean isChange = true;
        for (int i = 0; i < this.a.length && isChange; i++) {
            isChange = false;
            for (int j = 0; j < this.a.length - 1 - i; j++) {
                if (a[j].compareTo(a[j+1]) > 0) {
                    tmp = this.a[j];
                    this.a[j] = this.a[j + 1];
                    this.a[j + 1] = tmp;
                    isChange = true;
                }
            }
        }
    }
     
    //iyilestirilmiş boubleSort
    public void boubleSort() {
        int tmp;
        boolean isChange = true;
        for (int i = 0; i < this.array.length && isChange; i++) {
            isChange = false;
            for (int j = 0; j < this.array.length - 1 - i; j++) {
                if (this.array[j] > this.array[j + 1]) {
                    tmp = this.array[j];
                    this.array[j] = this.array[j + 1];
                    this.array[j + 1] = tmp;
                    isChange = true;
                }
            }
        }
    }
    
    public void selectionSort() {
        int tmp=0, index=0;
        for (int i = 0; i < this.array.length; i++) {
            index = i;
            for (int j = i; j < this.array.length; j++) {
                if (this.array[j] < this.array[index]) {
                    index = j;
                }
            }
            tmp = this.array[i];
            this.array[i] = this.array[index];
            this.array[index] = tmp;
        }
    }

    public void insertionSort() {
        int j=0;
        int key=0;
        for (int i = 1; i < this.array.length; i++) {
            key=this.array[i];
            for ( j=i-1;j>=0 && key<this.array[j]  ; j--) {
                   this.array[j+1]=this.array[j];
            }
            this.array[j+1]=key;
        }
    }
}

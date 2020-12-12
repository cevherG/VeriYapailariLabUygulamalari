package Hafta10;

public class Radix {

    int arraySize;
    String arr[];

    public Radix(String arr[]) {
        this.arr = arr;
        this.arraySize = this.arr.length;
    }

    public void radixSort() {
        int n = getMax();
        for (int k = n - 1; k >= 0; k--) {
            this.countingSort(this.arr, this.arraySize, k);
        }
    }

    private int getMax() {
        int size = 0;
        for (int i = 0; i < this.arr.length; i++) {
            if (arr[i].length() > size) {
                size = arr[i].length();
            }
        }
        return size;
    }

    private int getChar(String arr[], int k, int i) {
        if (k >= arr[i].length()) {
            return 0;
        }
        return arr[i].charAt(k);
    }

    private void countingSort(String arr[], int arraySize, int k) {

        int ascii = 255;
        int countSize = 256;
        String output[] = new String[arraySize];
        int count[] = new int[countSize];

        for (int i = 0; i < arraySize; ++i) {
            int c = getChar(arr, k, i);
            count[c + 1]++;
        }

        for (int i = 1; i < ascii; i++) {  
            count[i] += count[i - 1];
        }

        for (int i = 0; i < arraySize; ++i) { 
            int c = getChar(arr, k, i);
            int x=count[c]++;
            output[x] = arr[i];
        }

        for (int i = 0; i < arraySize; ++i) {
            arr[i] = output[i];
        }

    }
}

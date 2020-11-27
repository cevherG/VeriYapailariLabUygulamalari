package Hafta8;

public class BinarySearch {

    public int search(int value, int array[], int f, int r) {
        int sum = f + r;
        int mid = sum / 2;
        if (f - r == 0) {
            return -1;
        }
        if (array[mid] == value) {
            return mid;
        }
        if (array[mid] > value) {
            return search(value, array, f, mid);
        }
        if (array[mid] < value) {
            return search(value, array, mid, r + 1);
        }
        return -1;//numara yok ise -1 degeri gönderilir. 
    }
}

package hafta10;

public class RadixSort {

    int size;
    int arr[];

    public RadixSort(int arr[], int size) {
        this.arr = arr;
        this.size = size;
    }

    public void radixSort() {
        int m = getMax();
        for (int i = 1; m / i > 0; i *= 10) {//i hangi basamakta oldugumuzu gösteriyor
            this.countingSort(arr, size, i);
        }

    }

    private int getMax() {
        int a = this.arr[0];
        for (int i = 0; i < this.arr.length; i++) {
            if (this.arr[i] > a) {
                a = this.arr[i];
            }
        }
        return a;
    }

    private void countingSort(int arr[], int size, int bs) {

        int output[] = new int[size];
        int count[] = new int[10];
        for (int i = 0; i < 10; i++) {
            count[i] = 0;
        }
        for (int i = 0; i < size; i++) {
            output[i] = 0;
        }//count dizisini içini 0 ile doldurduk
//-------------------------------------------------
        for (int i = 0; i < size; i++) {
            count[(arr[i] / bs) % 10]++;
        }

        for (int i = 1; i < 10; i++) {//kümülatif toplam
            count[i] += count[i - 1];
        }

        for (int i = size - 1; i >= 0; i--) {
            output[count[(arr[i] / bs) % 10] - 1] = arr[i];
            count[(arr[i] / bs) % 10]--;
        }

        for (int i = 0; i < size; i++) {
            this.arr[i] = output[i];
        }
    }
}

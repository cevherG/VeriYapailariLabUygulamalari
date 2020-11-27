package Hafta8;

public class MergeSortAlgorithm {

    public void mergeSort(int array[]) {
        this.sort(array);
    }

    private void sort(int array[]) {
        if (array.length > 1) {
            int ort = array.length / 2;
            int solDizi[] = new int[ort];
            int sagDizi[] = new int[array.length - solDizi.length];
            for (int i = 0; i < ort; i++) {
                solDizi[i] = array[i];
            }
            for (int i = ort, j = 0; i < array.length; i++, j++) {
                sagDizi[j] = array[i];
            }
            sort(solDizi);
            sort(sagDizi);
            merge(array, solDizi, sagDizi);
        }
    }

    private void merge(int array[], int solDizi[], int sagDizi[]) {
        int i = 0, j = 0, k = 0;
        while (i < solDizi.length && j < sagDizi.length) {
            if (solDizi[i] < sagDizi[j]) {
                array[k] = solDizi[i];
                i++;
            } else {
                array[k] = sagDizi[j];
                j++;
            }
            k++;
        }
        while (i < solDizi.length) {
            array[k] = solDizi[i];
            k++;
            i++;
        }
        while (j < sagDizi.length) {
            array[k] = sagDizi[j];
            k++;
            j++;
        }
    }
}

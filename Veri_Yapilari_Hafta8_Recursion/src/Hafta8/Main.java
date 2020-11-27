package Hafta8;

public class Main {

    public static void main(String[] args) {
        /*
        Triangular t = new Triangular();
        t.printTriangle(3);
         */

        //-----------------------------------------------------
        /*
        Factorial f =new Factorial();
        System.out.println(" "+ f.calculate(5));
         */
        //-----------------------------------------------------
        /*int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        BinarySearch bs = new BinarySearch();

        int index = bs.search(10, array, 0, array.length - 1);

        System.out.println(" index " + index);*/
        //-----------------------------------------------------
        /*
        TowerOfHanoi t=new TowerOfHanoi();
        t.towerOfHanoi(10, 'A', 'B', 'C');*/
        //-----------------------------------------------------
        MergeSortAlgorithm ms = new MergeSortAlgorithm();
        int array[]={3,10,-5,21,18,400,17,200,13,5,7};
        ms.mergeSort(array);
        for (int i = 0; i < array.length; i++) {
            int j = array[i];
            System.out.print(" "+j);
        }
    }

}

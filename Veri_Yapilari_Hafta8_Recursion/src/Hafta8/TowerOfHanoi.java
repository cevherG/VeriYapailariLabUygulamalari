package Hafta8;

public class TowerOfHanoi {

    public void towerOfHanoi(int disk, char f, char i, char t) {
        if (disk == 1) {
            System.out.println(disk + " tasındı " + f + " --> " + t);
        } else {
            towerOfHanoi(disk - 1, f, t, i);
            System.out.println(disk + " tasındı " + f + " --> " + t);
            towerOfHanoi(disk - 1, i, f, t);
        }
    }
}

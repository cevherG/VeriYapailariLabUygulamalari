package veri_yapilari_lab_hafta4_1;

public class ArrayInOb {

    private Person person[];
    private int nElemens;
    private int size;

    public ArrayInOb(int size) {
        this.size = size;
        this.person = new Person[size];
        this.nElemens = 0;
    }

    public void insert(String last, String first, int age) {
        if (this.nElemens < this.size) {
            this.person[nElemens] = new Person(last, first, age);
            this.nElemens++;
        } else {
            System.out.println("");
        }
    }

    public void display() {
        for (int j = 0; j < this.nElemens; j++) {
            this.person[j].displayPerson();
        }
        System.out.println();
    }

    public void boubleSort() {
        Person tmp;
        for (int i = 0; i < this.nElemens; i++) {
            for (int j = 0; j < this.nElemens - 1 - i; j++) {
                if (this.person[j].getLastname().compareTo(this.person[j + 1].getLastname()) > 0) {
                    tmp = this.person[j];
                    this.person[j] = this.person[j + 1];
                    this.person[j + 1] = tmp;
                }
            }
        }
    }

    public void selectionSort() {
        Person tmp;
        int index = 0;
        for (int i = 0; i < this.nElemens; i++) {
            index = i;
            for (int j = i; j < this.nElemens; j++) {
                if (this.person[j].getLastname().compareTo(this.person[index].getLastname()) < 0) {
                    index = j;
                }
            }
            tmp = this.person[i];
            this.person[i] = this.person[index];
            this.person[index] = tmp;
        }
    }

    public void insertionSort() {
        int j = 0;
        Person key;
        for (int i = 1; i < this.nElemens; i++) {
            key = this.person[i];
            for (j = i - 1; j >= 0 && key.getLastname().compareTo(this.person[j].getLastname()) < 0; j--) {
                this.person[j + 1] = this.person[j];
            }
            this.person[j + 1] = key;
        }
    }

}

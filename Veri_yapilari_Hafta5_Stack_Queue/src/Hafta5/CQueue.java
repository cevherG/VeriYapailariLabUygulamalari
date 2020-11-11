package Hafta5;

public class CQueue {//dairesel kuyruk 

    private int front;
    private int tail;
    private int array[];
    private int size;
    private int nElement;//toplam eleman sayisi

    public CQueue(int size) {
        this.size = size;
        this.array = new int[this.size];
        this.front = 0;
        this.tail = 0;
        this.nElement = 0;
    }

    public void enQueue(int value) {
        if (!this.isFull()) {
            this.array[this.tail] = value;
            this.tail++;
            this.nElement++;
            if (this.tail == this.size) {
                this.tail = 0;
            }
        } else {
            System.out.println("Kuyruk dolu " + value + " eleman eklenemedi ");
        }
    }

    public int deQueue() {
        int i = -1;
        if (!this.isEmty()) {
            i = this.array[this.front];
            this.front++;
            this.nElement--;
            if (this.front == this.size) {
                this.front = 0;
            }
        } else {
            System.out.println("Kuyruk boş");
        }
        return i;
    }

    public boolean isEmty() {
        return this.nElement == 0;
    }

    public boolean isFull() {
        return this.nElement == this.size;
    }

    public int size() {//Queue'ta bulunan eleman sayisi 
        return this.nElement;
    }

    public void printQueue() {
        System.out.print("\n[");
        for (int i = this.front; i < this.front + this.nElement; i++) {
            System.out.print(" " + this.array[i % (this.size)] + " ");
        }
        System.out.print("]\n");

    }
}

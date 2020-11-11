package Hafta5;

public class Queue {

    private int front;
    private int tail;
    private int array[];
    private int size;

    public Queue(int size) {
        this.size = size;
        this.array = new int[this.size];
        this.front = 0;
        this.tail = 0;
    }

    public void enQueue(int value) {
        if (!this.isFull()) {
            this.array[this.tail] = value;
            this.tail++;
        } else {
            System.out.println("Kuyruk dolu " + value + " eleman eklenemedi ");
        }
    }

    public int deQueue() {
         int i=-1;
        if (!this.isEmty()) {
            i = this.array[this.front];
            this.front++;
        }else{
        }
        return i;
    }

    public boolean isEmty() {
        return this.front == this.tail;
    }

    public boolean isFull() {
        return this.tail == this.size;
    }

    public void printQueue() {
        System.out.print("\n[");
        for (int i = this.front; i < this.tail; i++) {
            System.out.print(" " + this.array[i] + " ");
        }
        System.out.print("]\n");
    }
}

package Hafta5;

public class CQueue {//dairesel kuyruk 

    private int front;
    private int tail;
    private Human humanArray[];
    private int size;
    private int nElement;//toplam eleman sayisi

    public CQueue(int size) {
        this.size = size;
        this.humanArray = new Human[this.size];
        this.front = 0;
        this.tail = 0;
        this.nElement = 0;
    }

    public void enQueue(String ad, String soyad, int tcNo, int dogunYili) {
        if (!this.isFull()) {
            this.humanArray[this.tail] = new Human(ad, soyad, tcNo, dogunYili);
            this.tail++;
            this.nElement++;
            if (this.tail == this.size) {
                this.tail = 0;
            }
        } else {
            System.out.println("Kuyruk dolu " + ad + " " + soyad + " " + tcNo + " " + dogunYili + "  eklenemedi ");
        }
    }

    public Human deQueue() {
        Human i = null;
        if (!this.isEmty()) {
            i = this.humanArray[this.front];
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
    
    public void peek(){
        this.humanArray[this.front].displayHuman();
    }
    
    public void printQueue() {
        for (int i = this.front; i < this.front + this.nElement; i++) {
            this.humanArray[i % (this.size)].displayHuman();
            System.out.println("");
        }
    }
}

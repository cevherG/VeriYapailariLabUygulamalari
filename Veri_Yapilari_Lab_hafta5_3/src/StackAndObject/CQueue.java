package StackAndObject;

public class CQueue {//dairesel kuyruk (circular Queue)

    private int front;
    private int tail;
    private Car carArray[];
    private int size;
    private int nElement;//toplam eleman sayisi

    public CQueue(int size) {
        this.size = size;
        this.carArray = new Car[this.size];
        this.front = 0;
        this.tail = 0;
        this.nElement = 0;
    }

    public Car enQueue(String model, String brand, int year) {
        Car i = null;
        if (!this.isFull()) {
            i = this.carArray[this.tail] = new Car(model, brand, year);
            this.tail++;
            this.nElement++;
            if (this.tail == this.size) {
                this.tail = 0;
            }
        } else {
            System.out.println("Kuyruk dolu : " + model + " " + brand + " " + year + " " + " eklenemedi ");
        }
        return i;
    }

    public Car deQueue() {
        Car i = null;
        if (!this.isEmty()) {
            i = this.carArray[this.front];
            this.front++;
            this.nElement--;
            if (this.front == this.size) {
                this.front = 0;
            }
            System.out.print("eleman silindi : ");
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

    public void peek() {//Queue'tan çikacak sıradaki elemanı
        this.carArray[this.front].displayCar();
    }

    public void printQueue() {
        for (int i = this.front; i < this.front + this.nElement; i++) {
            this.carArray[i % (this.size)].displayCar();
        }
    }

}

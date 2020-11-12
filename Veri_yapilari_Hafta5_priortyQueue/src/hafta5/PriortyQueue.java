package hafta5;

public class PriortyQueue {

    private int front;
    private int rear;
    private int[] array;
    private int size;
    private int nElemts;

    public PriortyQueue(int size) {
        this.size = size;
        this.array = new int[this.size];
        this.nElemts = 0;
        this.front = 0;
        this.rear = 0;
    }

    public void enQueue(int value) {
        int i;
        int a=0;
        if (!this.isFull()) {
            if (this.nElemts == 0) {
                this.array[this.rear] = value;
            } else {
                a=0;
                for (i = this.nElemts - 1; i >= 0 && a==0; i--) {
                    if (value > this.array[i]) {
                        this.array[i + 1] = this.array[i];
                    } else {
                        a=1;//break kullanımı yerine yapılan değişiklik
                        i++;
                        //break;
                    }
                }
                this.array[i + 1] = value;
            }
            this.nElemts++;
            this.rear++;
            if (this.rear == this.size) {
                this.rear = 0;
            }
        } else {
            System.out.println("Queue is Full .  " + value + "not be added");
        }
    }

    public int deQueue() {
        int i = -1;
        if (!this.isEmty()) {
            i = this.array[this.front];
            this.front++;
            this.nElemts--;
            if (this.front == this.size) {
                this.front = 0;
            }
        }
        return i;
    }

    public boolean isEmty() {
        return this.nElemts == 0;
    }

    public boolean isFull() {
        return this.nElemts == this.size;
    }

    public int peek() {
        return this.array[this.front];
    }

    public int size() {
        return this.nElemts;
    }

    public void dispay() {
        for (int i = this.front; i < this.front + this.nElemts; i++) {
            System.out.println(" " + this.array[i % this.size] + " ");
        }
    }
//    
}

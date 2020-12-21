package hafta11.PostfixCalculator;

public class Stack {

    private int size;
    private int nElemens;
    private int array[];

    public Stack(int size) {
        this.size = size;
        this.nElemens = 0;
        this.array = new int[this.size];
    }

    public void push(int a) {
        if (!this.isFull()) {
            this.array[this.nElemens] = a;
            this.nElemens++;
        } else {
            System.out.println("stack dolu " +a+" sayisi eklenemedi");
        }
    }

    public int pop() {
        int i = -1;
        if (!this.isEmpty()) {
            i = this.array[this.nElemens - 1];
            this.nElemens--;
        } else {
            System.out.println("stack is emty");
        }
        return i;
    }

    public int peek() {
        if (!isEmpty()) {
           return this.array[this.nElemens - 1];
        }
        return -1;
    }
    
    public boolean isEmpty(){
        return this.nElemens==0;
    }
    
    public boolean isFull(){
        return this.nElemens==this.size;
    }
    
    public int size(){//stack'te bulunan eleman sayisi 
        return this.nElemens;
    }
    
    public void printStack() {
        System.out.print("\n[");
        for (int i = 0; i < this.nElemens; i++) {
            System.out.print(" " + this.array[i] + " ");
        }
        System.out.print("]\n");
    }
}

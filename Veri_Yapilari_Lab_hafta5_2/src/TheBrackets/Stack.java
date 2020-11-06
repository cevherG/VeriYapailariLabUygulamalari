
package TheBrackets;

public class Stack {
    
    private int size;
    private int nElemens;
    private char array[];

    public Stack(int size) {
        this.size = size;
        this.nElemens = 0;
        this.array = new char[this.size];
    }

    public void push(char a) {
        if (!this.isFull()) {
            this.array[this.nElemens] = a;
            this.nElemens++;
        } else {
            System.out.println("stack dolu " +a+" karakteri eklenemedi");
        }
    }

    public char pop() {
       
        if (!this.isEmpty()) {
            char i = this.array[this.nElemens - 1];
            this.nElemens--;
            return i;
        } else {
            System.out.println("stack is emty");
        }
        return 0;
    }

    public char peek() {
        if (!isEmpty()) {
           return this.array[this.nElemens - 1];
        }
        return 0;
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

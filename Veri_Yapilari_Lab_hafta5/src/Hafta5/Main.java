package Hafta5;

public class Main {

    public static void main(String[] args) {

        CQueue humanQueue = new CQueue(6);

        humanQueue.enQueue("Cevher", "Geşgin", 12121212, 1997);
        humanQueue.enQueue("Mehmet", "Ak", 12121212, 2000);
        humanQueue.enQueue("Mert", "Can", 12121212, 1978);
        humanQueue.enQueue("Can", "Sarı", 12121212, 1988);
        humanQueue.enQueue("Murat", "Kara", 12121212, 1968);
        humanQueue.enQueue("Cengiz", "Kartal", 12121212, 1999);
        humanQueue.enQueue("Mahmut", "Sert", 12121212, 1987);
        System.out.println("-----------------------------------");
        humanQueue.printQueue();
        humanQueue.peek();
        System.out.println("\nsilinen ");
        humanQueue.deQueue().displayHuman();
        System.out.println("\n\n");
        humanQueue.printQueue();
        System.out.println("-----------------------------------");
        humanQueue.enQueue("Mahmut", "Sert", 12121212, 1997);
        humanQueue.printQueue();
        
    }

}

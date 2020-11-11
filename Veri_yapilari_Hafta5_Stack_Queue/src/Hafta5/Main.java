
package Hafta5;

public class Main {

    public static void main(String[] args) {
        
        /* Stack Test
        Stack stack=new Stack(6);
        stack.push(1);

        stack.printStack();
        System.out.println(stack.pop()+" eleman çıkarıldı ");
        System.out.println(stack.peek());
        */
        
        //Dairesel kuyruk Test
        /*CQueue q=new CQueue(6);
        q.enQueue(99);
        q.printQueue();
        System.out.println(q.deQueue()+" sayi silindi");
        q.printQueue();
        System.out.println("---------------------------");
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);
        q.enQueue(6);
        q.printQueue();
        System.out.println("---------------------");
        System.out.println(q.deQueue()+" sayi silindi");
        System.out.println(q.deQueue()+" sayi silindi");
        q.printQueue();
        q.enQueue(78);
        q.enQueue(98);
        q.printQueue();*/
        
        CQueue q=new CQueue(6);
        q.enQueue(88);
        q.enQueue(85);
        q.deQueue();
        q.deQueue();
        
        q.enQueue(14);
        q.enQueue(15);
        q.enQueue(16);
        q.enQueue(17);
        q.enQueue(12);
        q.enQueue(13);
        q.printQueue();
    }
    
}

package StackAndObject;


public class Main {

    public static void main(String[] args) {
       
        int size=6;//Queue size
        
        CQueue car=new CQueue(size);
        
        car.enQueue("GT", "BENTLEY", 2020);
        car.enQueue("Vantage", "ASTON MARTIN", 2020 );
        car.enQueue("Urus", "LAMBORGHINI", 2020 );
        car.enQueue("FERRARI", "Pista", 2020 );
        car.enQueue("Levante", "MASERATI", 2020 );
        car.enQueue("Fortwo", "SMART", 2020 );
        
        car.enQueue("RX", "LEXUS", 2020 );
        System.out.println("--------------------------------");
        car.deQueue().displayCar();
        System.out.println("--------------------------------");
        car.printQueue();
        car.enQueue("RX", "LEXUS", 2020 );
        System.out.println("");
        car.printQueue();
        
        System.out.println("-----------------------------");
        car.peek();
    }
}

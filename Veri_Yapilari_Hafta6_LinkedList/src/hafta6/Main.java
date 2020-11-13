
package hafta6;

public class Main {
    public static void main(String[] args) {
        
        Araba opel=new Araba("Opel",2000);
        Araba bmw=new Araba("BMW",1995);
        Araba audi=new Araba("Audi",2005);
        Araba cadillac=new Araba("Cadillac",2003);
        Araba kia=new Araba("Kia",2010);
        
        LinkedList l=new LinkedList();
        l.insert(opel);
        l.display();
        l.insert(bmw);
        l.display();
        l.insert(audi);
        l.display();
        l.insert(cadillac);
        l.display();
        l.insert(kia);
        l.display();
    }
    
}

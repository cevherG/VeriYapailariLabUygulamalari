package veri_yapilari_lab_hafta4_1;

public class Veri_yapilari_Lab_hafta4_1 {

    public static void main(String[] args) {
        
        ArrayInOb arr = new ArrayInOb(50);
        
        arr.insert("Evans", "Patty", 24);
        arr.insert("Smith", "Doc", 59);
        arr.insert("Smith", "Lorraine",37);
        arr.insert("Smith", "Paul",37);
        arr.insert("Yee", "Tom",43);
        arr.insert("Hashimoto", "Sato",21);
        arr.insert("Stimson", "Henry",29);
        arr.insert("Velasquez", "Jose",72);
        arr.insert("Vang", "Minh",22);
        arr.insert("Creswell", "Lucinda",18);
        
        System.out.println("Before sorting : ");
        arr.display(); 
        
        System.out.println("After sorting : ");
        
        System.out.println("**********Bouble sort**********" );
        arr.boubleSort();
        arr.display();
        
        
        System.out.println("**********Insertion sort**********" );
        arr.insertionSort();
        arr.display();
        
        
        System.out.println("**********Selection sort**********" );
        arr.selectionSort();
        arr.display();
        
    }

}

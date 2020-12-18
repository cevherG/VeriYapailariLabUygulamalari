package Hafta11;

public class Main {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        
        System.out.println("Ekleme işlemi :");
        bt.insert(15);
        bt.printTree();
        bt.insert(13);
        bt.printTree();
        bt.insert(10);
        bt.printTree();
        bt.insert(18);
        bt.printTree();
        bt.insert(20);
        bt.printTree();
        bt.insert(25);
        bt.printTree();
        bt.insert(5);
        bt.printTree();
        bt.insert(40);
        bt.printTree();
        bt.insert(12);
        bt.printTree();
        System.out.println("---------------------------------------");
          
        System.out.println("\ninorder traversal :");
        bt.inorderTraversal();
        System.out.println("\npostorder traversal :");
        bt.postorderTraversal();
        System.out.println("\npreorder traversal :");
        bt.preorderTraversal();

        
        System.out.println("\n---------------------------------------");
        System.out.println("\nArama :");
        System.out.println(bt.find(15));//bastaki sayi
        System.out.println(bt.find(99));//olmayan sayi
        System.out.println(bt.find(40));//leaf olan sayi
        System.out.println(bt.find(5));//leaf olan sayi
        System.out.println(bt.find(13));
        
        
        System.out.println("\n----------------------------------------");
        System.out.println("Before Delete : ");
        bt.inorderTraversal();
        System.out.println("\nAfter Delete : ");
        bt.delete(15);
        bt.delete(5);
        bt.delete(13);
        bt.delete(18);
        bt.delete(20);
        bt.delete(10);
        bt.inorderTraversal();
        
    }

}

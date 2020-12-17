package Hafta11;

public class Main {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.insert(15);
        bt.printTree();
        bt.insert(10);
        bt.printTree();
        bt.insert(20);
        bt.printTree();
        bt.insert(5);
        bt.printTree();
        bt.insert(12);
        bt.printTree();
        
        System.out.println("---------------------------------------");
        
        System.out.println(bt.find(12));//son da olan bir sayı araması
        System.out.println(bt.find(12));//ortada olan bir sayının araması
        System.out.println(bt.find(12));//olmayan bir sayinin aranması
        System.out.println(bt.find(15));//ilk sayinin aranması
        
        System.out.println("---------------------------------------");
        
        System.out.println("inorder traversal :");
        bt.inorderTraversal();
        System.out.println("postorder traversal :");
        bt.postorderTraversal();
        System.out.println("preorder traversal :");
        bt.preorderTraversal();
        
        System.out.println("----------------------------------------");
        System.out.println("Delete :    ");
    }

}

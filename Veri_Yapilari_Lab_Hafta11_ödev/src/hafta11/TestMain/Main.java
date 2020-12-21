package hafta11.TestMain;

import hafta11.BinaryTree.BinaryTree;
import hafta11.PostfixCalculator.PostfixCalculator;
import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        BinaryTree bt = new BinaryTree();

        System.out.println("İşlemi Giriniz :");
        String input = br.readLine();
        bt.insert(input);
        System.out.println("-----Treversal-------");
        System.out.print("inorder     ->");
        bt.inorderTraversal();
        System.out.print("\npostorder ->");
        bt.postorderTraversal();
        System.out.print("\npreorder  ->");
        bt.preorderTraversal();
        System.out.println("\n-------Treee-------");
        System.out.println("" + bt.printTree());
        System.out.println("---------------------");
        System.out.println("işlem sonucu : "+bt.calculate());
        
    }
}

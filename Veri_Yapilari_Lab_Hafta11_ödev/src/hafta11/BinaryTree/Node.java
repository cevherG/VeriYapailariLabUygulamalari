package hafta11.BinaryTree;

public class Node {

    public char key;
    public Node left;
    public Node right;
    public Dizi aaa;
    public Node(char ch) {
        key = ch;
        left=null;
        right=null;
    }
    
    
    
    @Override
    public String toString() {
        return "["+key + " , " + left + " , " + right + ']'; 
    }

}

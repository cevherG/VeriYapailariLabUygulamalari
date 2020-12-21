package hafta11.BinaryTree;

import hafta11.PostfixCalculator.PostfixCalculator;

public class BinaryTree {

    private Node root;
    private Dizi dTree;

    public BinaryTree() {
        root = null;
    }

    public void insert(String s) {
        dTree = new Dizi(s.length());
        InfixToPostfix itp = new InfixToPostfix(s);
        s = itp.doPostfix();
        Stack stackNode = new Stack(s.length());
        s = s + "!";
        Node nNode;
        int i = 0;
        char character ;
        do {
             character = s.charAt(i);
            if (character >= '0' && character <= '9' || character >= 'A' && character <= 'Z' || character >= 'a' && character <= 'z') {
                nNode = new Node(character);
                stackNode.push(nNode);
            }
            if (character == '+' || character == '-' || character == '/' || character == '*') {
                Node a1 = stackNode.pop();
                Node a2 = stackNode.pop();
                nNode = new Node(character);
                nNode.left = a2;
                nNode.right = a1;
                stackNode.push(nNode);
            }
            character = s.charAt(i++);
        } while (character != '!');
        root = stackNode.pop();
    }

    public void preorderTraversal() {
        preorderRecord(root);
    }

    private void preorderRecord(Node current) {
        if (current != null) {
            System.out.print(current.key);
            preorderRecord(current.left);
            preorderRecord(current.right);

        }
    }

    public void inorderTraversal() {
        inorderRecord(root);
    }

    private void inorderRecord(Node current) {
        if (current != null) {
            inorderRecord(current.left);
            System.out.print(current.key);
            inorderRecord(current.right);

        }
    }

    public void postorderTraversal() {
        postorderRecord(root);
    }

    private void postorderRecord(Node current) {
        if (current != null) {
            postorderRecord(current.left);
            postorderRecord(current.right);
            System.out.print(current.key);
        }
    }

    private void postOrderForCalculate(Node current) {
        if (current != null) {
            postOrderForCalculate(current.left);
            postOrderForCalculate(current.right);
            dTree.add(current.key);
        }
    }

    public String getString() {
        return dTree.getString();
    }

    public int calculate() {
        postOrderForCalculate(root);
        String s = this.getString();
        System.out.println("ifade : " + s);
        PostfixCalculator pc = new PostfixCalculator(s);
        return pc.doCalculate();
    }

    public String printTree() {
        return root.toString();
    }
}

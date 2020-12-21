package hafta11.BinaryTree;

public class Stack {

    public Node[] node;
    private char[] ch;
    public int top, max;

    public Stack(int max) {
        this.max = max;
        node = new Node[this.max];
        ch = new char[this.max];
        top = -1;
    }

    public void push(Node key) {
        node[++top] = key;
    }

    public Node pop() {
        return (node[top--]);
    }

    public void pushChar(char key) {
        ch[++top] = key;
    }

    public char popChar() {
        return (ch[top--]);
    }

    public boolean isEmpty() {
        return (top == -1);
    }

}

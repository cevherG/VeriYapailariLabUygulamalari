package Hafta11;

public class BinaryTree {

    Node root;

    public BinaryTree() {
        root = null;
    }

    public void insert(int value) {
        root = insertRecord(root, value);
    }

    private Node insertRecord(Node current, int value) {
        if (current == null) {
            current = new Node(value);
            return current;
        }
        if (current.key > value) {
            current.left = insertRecord(current.left, value);
        } else {
            current.right = insertRecord(current.right, value);
        }
        return current;
    }

    public int findMin(Node current) {
        while (current.left != null) {
            current = current.left;
        }
        return current.key;
    }

    public int findMax(Node current) {
         while (current.right != null) {
            current = current.right;
        }
        return current.key;
    }

    public void delete(int value) {
        root = deleteRecord(root, value);
    }

    private Node deleteRecord(Node current, int value) {
        if (current == null) {//dugum bos işlemi için
            return null;
        }
        if (value < current.key) {//solda arama
            current.left = deleteRecord(current.left, value);
        } else if (value > current.key) {//sagdan arama
            current.right = deleteRecord(current.right, value);
        } else {//aranan elemman bulundu ise yapılacaklar
            if (current.left == null) {
                return current.right;
            } else if (current.right == null) {
                return current.left;
            }
            current.key = this.findMin(current.right);//silinecek degere bulunan min deger atıldı
            current.right = this.deleteRecord(current.right, current.key);//
        }
        return current;
    }

    public int find(int value) {
        Node node = findRecord(root, value);
        int i;
        if (node == null) {
            i = -1;
        } else {
            i = node.key;
        }
        return i;
    }

    private Node findRecord(Node current, int value) {
        if (current == null || current.key == value) {
            return current;
        }
        if (value > current.key) {
            return findRecord(current.right, value);
        }
        return findRecord(current.left, value);
    }

    public void preorderTraversal() {
        preorderRecord(root);
    }

    private void preorderRecord(Node current) {
        if (current != null) {
            System.out.print(current.key + " ");
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
            System.out.print(current.key + " ");
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
            System.out.print(current.key + " ");
        }
    }

    public void printTree() {
        System.out.println(root.toString());
    }
}

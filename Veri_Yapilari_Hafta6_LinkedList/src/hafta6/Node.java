package hafta6;

public class Node {
    
    private Araba araba;
    private Node next;
    
    public Node(Araba araba) {
        this.araba = araba;
        this.next = null;
    }

    public Araba getAraba() {
        return araba;
    }

    public void setAraba(Araba araba) {
        this.araba = araba;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

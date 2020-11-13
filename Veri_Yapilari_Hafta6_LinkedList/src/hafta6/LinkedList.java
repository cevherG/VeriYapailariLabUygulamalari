package hafta6;

public class LinkedList {

    private Node ilk;

    public LinkedList() {
        this.ilk = null;
    }

    public void insert(Araba araba) {
        Node yeniEleman=new Node(araba);
        if (this.ilk==null){// ilk defa eleman ekleniyor
            this.ilk=yeniEleman;
        }else{
            if (yeniEleman.getAraba().getYil()<this.ilk.getAraba().getYil()) {//basa eleman ekleme islemi
                yeniEleman.setNext(this.ilk);
                this.ilk=yeniEleman;
            }else{
                //araya ekleme islemi 
                Node temp=ilk;//node'larda gezinmek için mep adında degişken olusturulup node'nin ilk elemanı atandı
                while(temp.getNext() !=null &&  yeniEleman.getAraba().getYil() > temp.getNext().getAraba().getYil()){
                    temp=temp.getNext();
                }
                yeniEleman.setNext(temp.getNext());
                temp.setNext(yeniEleman);
            }
        }
       
    }//end insert method

    public void display() {
        Node p = ilk;

        while (p != null) {
            p.getAraba().display();
            p = p.getNext();
        }
        System.out.println("");
    }

}//end class
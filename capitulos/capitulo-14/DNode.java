

public class DNode{

    protected String element;
    protected DNode next;
    protected DNode prev;


    public DNode(String e, DNode p, DNode n) {
        this.element = e;
        this.prev = p;
        this.next = n;
    }

    public String getElement(){
        return element;
    }

    public DNode getPrev(){
        return prev;
    }

    public DNode getNext(){
        return prev;
    }

    public void setElement(String newElement){
        this.element = newElement;
    }

    public void setPrev(DNode newPrev){
        this.prev = newPrev;
    }

    public void setNext(DNode newNext){
        this.next = newNext;
    }

}

public class CircleList{

    protected DNode cursor;
    protected int size;

    public CircleList(){
        cursor = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public DNode getCursor(){
        return this.cursor;
    }

    public void advance(){
        cursor = cursor.getNext();
    }

    public void add(DNode newNode){
        if(cursor == null){
            newNode.setNext(newNode);
            cursor = newNode;
        }
        else{
            newNode.setNext(cursor.getNext());
            cursor.setNext(newNode);
        }
        size++;
    }

    public DNode remove(){
        DNode oldNode = cursor.getNext();
        if( cursor == oldNode )
            cursor = null;
        else{
            cursor.setNext(oldNode.getNext());
            oldNode.setNext(null);
        }
        size--;
        return oldNode;
    }

    public String toString(){
        
        if(cursor == null)
            return " [ ] ";

        String s = "[..." + cursor.getElement();
        DNode oldCursor = cursor;
        for(advance(); oldCursor != cursor; advance()){
            s += ", " + cursor.getElement();
        }
        return s + "...]";
    }
}
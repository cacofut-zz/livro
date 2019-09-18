import java.util.ArrayList;
import java.util.Arrays;

public class PrintService<T>{

    private ArrayList<T> list;

    public PrintService() {
        list = new ArrayList<>();
    }

    public void addValue(T value){
        list.add(value);
    }

    public T first() throws Exception{
        if( list.isEmpty() ){
            throw new Exception("List is empty");
        }
        return list.get(0);
    }

    public void print(){
        System.out.println(Arrays.toString(list.toArray()));
    }

}
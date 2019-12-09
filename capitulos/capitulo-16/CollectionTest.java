import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class CollectionTest{

    public static void main(String[] args){

        String[] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
        List<String> list = new ArrayList<String>();

        for(String color : colors)
            list.add(color);

        String[] removeColors = {"RED", "WHITE", "BLUE"};
        List<String> removeList = new ArrayList<String>();

        for(String color : removeColors)
            removeList.add(color);
    }

}
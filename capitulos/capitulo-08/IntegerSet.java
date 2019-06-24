
public class IntegerSet{

    private boolean[] set;

    public IntegerSet(){
        set = new boolean[100];
        for(int i = 0; i < set.length; i++){
            set[i] = false;
        }
    }

    public boolean[] getSet(){
        return set;
    }

    public String toString(){
        String txt = "";
        for( int i = 0; i < set.length; i++ ){
            txt += (set[i]) ? " " + i : "";
        }
        if(txt.length() == 0){
            return "---";
        }
        return txt;
    }

    public void insertElement(int element){
        set[element] = true;
    }

    public void deleteElement(int element){
        set[element] = false;
    }

    public static IntegerSet union(IntegerSet set1, IntegerSet set2){
        IntegerSet newSet = new IntegerSet();
        for( int i = 0; i < set1.getSet().length; i++ ){
            if( set1.getSet()[i] || set2.getSet()[i] ){
                newSet.insertElement(i);
            }else{
                newSet.deleteElement(i);
            }
        }
        return newSet;
    }

    public static IntegerSet intersection(IntegerSet set1, IntegerSet set2){
        IntegerSet newSet = new IntegerSet();
        for( int i = 0; i < set1.getSet().length; i++ ){
            if( set1.getSet()[i] == false || set2.getSet()[i] == false ){
                newSet.deleteElement(i);
            }else{
                newSet.insertElement(i);
            }
        }
        return newSet;
    }

    public boolean isEqualTo(IntegerSet newSet){
        for(int i = 0; i < set.length; i++){
            if( set[i] != newSet.getSet()[i] ){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        IntegerSet set3 = new IntegerSet();

        System.out.println(set1);
        set1.insertElement(5);
        set1.insertElement(8);
        set1.insertElement(9);
        set1.insertElement(3);
        System.out.println(set1);


        System.out.println(set2);
        set2.insertElement(5);
        set2.insertElement(16);
        set2.insertElement(89);
        set2.insertElement(77);
        System.out.println(set2);

        System.out.println(set3);
        set3.insertElement(5);
        set3.insertElement(8);
        set3.insertElement(9);
        set3.insertElement(3);
        System.out.println(set3);


        IntegerSet setIn = IntegerSet.intersection(set1, set2);
        System.out.println(setIn);

        IntegerSet setUn = IntegerSet.union(set1, set2);
        System.out.println(setUn);

        System.out.println(set1.isEqualTo(set2));
        System.out.println(set1.isEqualTo(set3));
    }
}


public class TestDate{

    public static void main(String[] args) {
        
        Date date1 = new Date(1, 1, 2001);
        int count = 0;
        do{
            System.out.println(date1);
            date1.nextDay();
            count++;
        }while(count < 100);

       
    }
} 
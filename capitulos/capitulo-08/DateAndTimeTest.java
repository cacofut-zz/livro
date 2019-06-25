

public class DateAndTimeTest{

    public static void main(String[] args) {
        Date date = new Date(12, 2, 2019);
        Time2 time = new Time2(2, 5, 20);
        DateAndTime dateTime = new DateAndTime(date, time);

        for(int i = 0; i < 23; i++){
            System.out.println(dateTime.toUniversalString());
            dateTime.incrementHour();
        }
        
    }
}
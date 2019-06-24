

public class DateAndTime{

    private Time2 time;
    private Date date;

    public DateAndTime(Date date, Time2 time){
        this.date = date;
        this.time = time;
    }

    public void incrementHour(){
        time.incrementHour();
        int hour = time.getHour();
        if( hour == 0 ){
            date.nextDay();
        }
    }

    public String toString(){
        return date.toString() + " " + time.toString();
    }

    public String toUniversalString(){
        return date.toString() + " " + time.toUniversalString();
    }

}
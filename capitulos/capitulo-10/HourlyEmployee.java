import java.time.LocalDate;

public class HourlyEmployee extends Employee{

    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, 
        LocalDate birthDate, double wage, double hours){
        super(firstName, lastName, socialSecurityNumber, birthDate);
        HourlyEmployee.validWage(wage);
        HourlyEmployee.validHours(hours);
        this.wage  = wage;
        this.hours = hours;                    
            
    }

    public void setWage(double wage){
        HourlyEmployee.validWage(wage);
        this.wage = wage;
    }

    public double getWage(){
        return wage;
    }

    public void setHours(double hours){
        HourlyEmployee.validHours(hours);
        this.hours = hours;
    }

    public double getHours(){
        return hours;
    }

    @Override
    public double earnings(){
        if( getHours() <= 40 ){
            return getWage() * getHours();
        }else{
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
        }        
    }

    private static void validHours(double hours){
        if(hours < 0.0 || hours > 168.0){
            throw new IllegalArgumentException("Hours workek must be >= 0.0 and <= 168.0");
        }
    }

    private static void validWage(double wage){
        if(wage < 0.0){
            throw new IllegalArgumentException("Hourly wage must be >= 0.0");
        }
    }

    @Override
    public String toString(){
        return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f", 
            super.toString(), "hourly wage", getWage(),
            "hours worked", getHours());
    }
}
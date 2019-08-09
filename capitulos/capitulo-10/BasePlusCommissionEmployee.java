import java.time.LocalDate;

public class BasePlusCommissionEmployee extends CommissionEmployee{

    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, 
        LocalDate birthDate, double grossSales,
        double commissionRate, double baseSalary){
            super(firstName, lastName, socialSecurityNumber, birthDate, grossSales, commissionRate);
            validBaseSalary(baseSalary);
            this.baseSalary = baseSalary;         
    }

    @Override
    public double earnings(){
        return getBaseSalary() + super.earnings();
    }

    private static void validBaseSalary(double baseSalary){
        if(baseSalary < 0.0){
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        validBaseSalary(baseSalary);
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString(){
        return String.format( "%s %s; %s: $%,.2f", 
            "base-salaried", super.toString(),
            "base salary", getBaseSalary());
    }
}
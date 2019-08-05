

public class CommissionEmployee extends Employee{

    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastname, 
        String socialSecurityNumber, double grossSales, double commissionRate){
            super(firstName, lastname, socialSecurityNumber);
            validGrossSales(grossSales);
            validcommissionRate(commissionRate);
            this.grossSales    = grossSales;
            this.commissionRate = commissionRate;

    }   

    private static void validGrossSales(double grossSales){
        if( grossSales < 0.0 ){
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
    }

    private static void validcommissionRate(double commissionRate){
        if(commissionRate <= 0.0 || commissionRate >= 1.0){
            throw new IllegalArgumentException("Comission rate must be > 0.0 and < 1.0");
        }
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        validGrossSales(grossSales);
        this.grossSales = grossSales;
    }

    public double getcommissionRate() {
        return commissionRate;
    }

    public void setcommissionRate(double commissionRate) {
        validcommissionRate(commissionRate);
        this.commissionRate = commissionRate;
    }

    @Override
    public String toString(){
        return String.format("%s: %s%n%s: $%,.2f; %s: %.2f", 
            "commission employee", super.toString(),
            "gross sales", getGrossSales(),
            "commission rate", getcommissionRate());
    }

    @Override
    public double earnings(){
        return getcommissionRate() * getGrossSales();
    } 

}
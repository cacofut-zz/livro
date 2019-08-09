import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;



public class PayrollSystemTest{

    public static void main(String[] args){
                        
          
        SalariedEmployee salariedEmployee     = new SalariedEmployee("John", "Smith", "111-11-1111",  LocalDate.of(1987, 4, 03), 800.00);
        HourlyEmployee hourlyEmployee         = new HourlyEmployee("Karen", "Price", "222-22-2222",   LocalDate.of(1987, 8, 22), 16.75, 40);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "333-33-3333", LocalDate.of(1987, 6, 28), 10000, .06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Jones", "444-44-4444", LocalDate.of(1987, 7, 06), 5000, .04, 300);
        PieceWorker pieceWorker = new PieceWorker("Cristiano", "Amaral", "121-23-1232", LocalDate.of(1990, 2, 05), 5.45, 50);
        Invoice invoice1 = new Invoice("01425", "Catalizador", 50, 5.45);
        Invoice invoice2 = new Invoice("01568", "Chanfro", 100, 5.45);

        System.out.println("Employees processed individually");

        System.out.printf("%n%s%n%s: $%,.2f%n%n", salariedEmployee, "earned", salariedEmployee.getPaymentAmount());
        System.out.printf("%s%n%s: $%,.2f%n%n", hourlyEmployee, "earned", hourlyEmployee.getPaymentAmount());
        System.out.printf("%s%n%s: $%,.2f%n%n", commissionEmployee, "earned", commissionEmployee.getPaymentAmount());
        System.out.printf("%s%n%s: $%,.2f%n%n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.getPaymentAmount());
        System.out.printf("%s%n%s: $%,.2f%n%n", pieceWorker, "earned", pieceWorker.getPaymentAmount());

        System.out.printf("%s%n%s: $%,.2f%n%n", invoice1, "earned", invoice1.getPaymentAmount());
        System.out.printf("%s%n%s: $%,.2f%n%n", invoice2, "earned", invoice2.getPaymentAmount());

        Payable[] employees = new Payable[7];

        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        employees[4] = pieceWorker;
        employees[5] = invoice1;
        employees[6] = invoice2;

        System.out.printf("Employees processed polymorphically:%n%n");

        for( Payable currentEmployee : employees ){
            System.out.println(currentEmployee);

            double adicionalMesAniversario = 0;
            if( currentEmployee instanceof Employee ){
                Employee aux_employee = (Employee) currentEmployee;                
                if( aux_employee.getBirthDate().getMonth() == Month.AUGUST ){                
                    adicionalMesAniversario = 100;
                }
                if(currentEmployee instanceof BasePlusCommissionEmployee){
                    BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
                    employee.setBaseSalary(1.10 * employee.getBaseSalary());
    
                    System.out.printf("new base salary with 10%% increase is: $%,.2f%n", employee.getBaseSalary());
                }
            }
                      
            System.out.printf("earned $%,.2f%n%n", currentEmployee.getPaymentAmount() + adicionalMesAniversario);
        }

        for( int j = 0; j < employees.length; j++ ){
            System.out.printf("Employee %d is a %s%n", j, 
                employees[j].getClass().getName());
        }

        
    }
}
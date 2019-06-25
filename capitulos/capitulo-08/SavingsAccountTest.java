

public class SavingsAccountTest{

    public static void main(String[] args){

        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);
        SavingsAccount.modifyInterestRate(0.04);
        System.out.printf("%s", "Calculate Monthly");
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.printf("%n%f", saver1.getSavingsBalance());
        System.out.printf("%n%f", saver2.getSavingsBalance());
        System.out.println();
    }

}
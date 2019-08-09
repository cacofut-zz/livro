
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Employee implements Payable {

    private static SimpleDateFormat spf = new SimpleDateFormat("dd/MM/yyyy");
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private final LocalDate birthDate;

    public Employee(String firstName, String lastName, String socialSecurityNumber, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {

        return String.format("%s %s%nsocial security number: %s%nBirth Date: %s", getFirstName(), getLastName(),
                getSocialSecurityNumber(), getBirthDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

    public abstract double earnings();

    @Override
    public double getPaymentAmount() {
        return earnings();
    }

}
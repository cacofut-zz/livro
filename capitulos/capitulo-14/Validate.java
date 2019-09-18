
import java.util.Scanner;

public class Validate{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first name:");
        String firstName = scanner.nextLine();

        System.out.println("Please enter last name:");
        String lastName = scanner.nextLine();

        System.out.println("Please enter address:");
        String address = scanner.nextLine();

        System.out.println("Please enter city:");
        String city = scanner.nextLine();

        System.out.println("Please enter state:");
        String state = scanner.nextLine();

        System.out.println("Please enter zip:");
        String zip = scanner.nextLine();

        System.out.println("Please enter phone:");
        String phone = scanner.nextLine();

        System.out.printf("%nValidate Result:%n");

        if(!ValidateInput.validateFirstName(firstName))
            System.out.println("Invalid first name");
        if(!ValidateInput.validateLastName(lastName))
            System.out.println("Invalid last Name");
        if(!ValidateInput.validateAdress(address))
            System.out.println("Invalid address");
        if(!ValidateInput.validateCity(city))
            System.out.println("Invalid city");
        if(!ValidateInput.validateState(state))
            System.out.println("invalid state");    
        if(!ValidateInput.validateZip(zip))
            System.out.println("Invalid zip code");
        if(!ValidateInput.validatePhone(phone))
            System.out.println("Invalid phone number");

    }
}
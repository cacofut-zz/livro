import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextFile{

    

    private static Formatter output;
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        openFile();
        addRecords();
        closeFile();
    }

    public static void openFile(){  
        try{
            output = new Formatter("clients.txt");
        }
        catch(SecurityException ex){
            System.err.println("Write permission denied. Terminating.");
            System.exit(1);
        }
        catch(FileNotFoundException ex){
            System.err.println("Error opening file. Terminating.");
            System.exit(1);
        }

    }

    public static void addRecords(){
        Scanner input = new Scanner(System.in,"ISO-8859-1");
        System.out.printf("%s%n%s%n? ", 
            "Enter account number, first name, last name and balance.",
            "Enter end-of-file indicator to end input"); // windows ctrl + enter

        while(input.hasNext()){
            try{
                output.format("%d %s %s %.2f %n", 
                    input.nextInt(), 
                    input.next(),
                    input.next(),
                    input.nextDouble()
                );
            }
            catch(FormatterClosedException ex){
                System.err.println("Error writing to file. Terminating.");
                break;
            }
            catch(NoSuchElementException ex){
                System.err.println("Invalid input. Please try again.");
                input.nextLine(); // descarta a entrada para o usuário tentar de novo
            }
            catch(Exception ex){
                ex.printStackTrace();
                System.err.println("Error try again.");
                break;
                
            }

            System.out.print("? ");
        }

        input.close();
    }

    public static void closeFile(){
        if(output != null)
            output.close();
    }
} 
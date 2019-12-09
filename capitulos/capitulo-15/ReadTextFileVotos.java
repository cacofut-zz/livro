import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFileVotos{

    private static Scanner input;
    private static Scanner inputUser = new Scanner(System.in);
    private static Map<String, Integer> candidatoVotos;

    public static void main(String[] args) {

        candidatoVotos = new HashMap<>();
        openFile();
        readRecords();
        closeFile();
    }

    public static void openFile(){
        
        try{
            System.out.print("Enter file full path: ");
            String file = inputUser.nextLine();
            input = new Scanner(Paths.get(file));
        }
        catch(IOException ex){
            System.err.println("Error opening file. Terminating.");
            System.exit(1);
        }        
    }

    public static void readRecords(){
        System.out.printf("%-20s%-10s%n",
            "Name", "Amount of votos");

        try{
            while(input.hasNextLine()){
                String[] fields = input.nextLine().split(",");
                String name = fields[0];
                int amount  = Integer.parseInt(fields[1]);                
                candidatoVotos.put(
                    name, 
                    candidatoVotos.containsKey(name) ? candidatoVotos.get(name) + amount : amount);
            }

            for (String key : candidatoVotos.keySet()) {
                System.out.printf("%-20s%-10d%n", key, candidatoVotos.get(key));
            }

        }
        catch(NoSuchElementException ex){
            System.err.println("File inproperly formed. Terminating.");            
        }
        catch(IllegalArgumentException ex){
            System.err.println("Error reading from file. Terminating.");
        }
    }

    public static void closeFile(){
        if( input != null )
            input.close();

        if(inputUser != null)
            inputUser.close();
        
    }
}
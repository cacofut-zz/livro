import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program3{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Type the name of file");

        String path = input.next();
        Set<LogEntry> logs = new HashSet<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while( line != null ){
                String[] fields = line.split("\\s+");
                String name = fields[0];
                Date moment = Date.from(Instant.parse(fields[1]));
                logs.add(new LogEntry(name, moment));
                line = br.readLine();
            }

            for (LogEntry log : logs) {
                System.out.println(log);
            }

            System.out.println("Quantidade de pessoas que acessaram " + logs.size());
        }
        catch( IOException ex ){
            ex.printStackTrace();
        }
        finally{
            input.close();
        }
    }
}


import java.util.Scanner;

/**
 * (Comparando Strings) Elabore um aplicativo que utiliza o método String compareTo para comparar duas entradas de strings pelo
    usuário. Crie uma saída informando se a primeira string é menor que, igual a ou maior que a segunda.
 */
public class Questao_14_3{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print( "Digite a primeira string: " );
        String s1 = input.nextLine();
        System.out.print( "Digite a segunda string: " );
        String s2 = input.nextLine();

        int result = s1.compareTo(s2);
        
        System.out.printf("%nA string \"%s\" é %s a string \"%s\"", 
            s1, (result == 0) ? "igual" : (result > 0) ? "maior que" : "menor que", s2);

    }
}
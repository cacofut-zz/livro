

import java.util.Scanner;

/**
 * (Comparando partes de Strings) Elabore um aplicativo que utiliza o método String regionMatches para comparar duas entradas
    de strings pelo usuário. O aplicativo deve inserir o número de caracteres que será comparado e o índice inicial da comparação. O
    aplicativo deve declarar se as strings são iguais. Ignore a distinção entre maiúsculas e minúsculas dos caracteres ao realizar a comparação
 */

public class Questao_14_4{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a primeira string: ");
        String s1 = input.nextLine();

        System.out.print("Digite a segunda string: ");
        String s2 = input.nextLine();

        int qtd = s1.length();
        int ind = 0;

        boolean result = s1.regionMatches(true, ind, s2, ind, qtd);
        System.out.printf("%nA string %s é %s string %s", 
            s1, ( result ) ? "igual a" : "diferente da", s2);


    }
    

}
import java.util.Arrays;

/**
 * (Tokenizando números de telefone) Elabore um aplicativo que insere um número de telefone como uma string na forma (555)
555-5555. O aplicativo deve utilizar o método String split para extrair o código de área como um token, os três primeiros dígitos do
número de telefone como um segundo token e os últimos quatro dígitos do número de telefone como um terceiro token. Os sete dígitos do
número de telefone devem ser concatenados em uma string. O código de área e o número de telefone devem ser impressos. Lembre-se de
que você que terá de alterar caracteres delimitadores durante o processo de tokenização.
 */
public class Questao_14_8{


    public static void main(String[] args) {
        
        String telephone  = "(555)654-3456";
        String[] aux = telephone.split("\\)");
        String codigoArea = aux[0].substring(1);
        String[] numero   = aux[1].split("-");

        String inicio = numero[0];
        String fim    = numero[1];

        System.out.println("Codigo da area " + codigoArea);
        System.out.println("Numero de telefone " + inicio + fim);
        

        

    }
}
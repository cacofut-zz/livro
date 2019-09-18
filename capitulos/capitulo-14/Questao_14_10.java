

/**
 * (Exibindo Strings em letras maiúsculas e minúsculas) Elabore um aplicativo que insere uma linha de texto e gera duas vezes a
saída do texto — uma vez em letras maiúsculas e uma vez em letras minúsculas.
 */
public class Questao_14_10{

    public static void main(String[] args) {
        
        String frase = "Elabore um aplicativo que insere uma linha de texto e gera duas vezes a saida do texto";
        String[] tokens = frase.split("\\s+");

        System.out.println("Maiusculas");
        for (String token : tokens) {
            System.out.print(token.toUpperCase() + " ");
        }
        System.out.println();
        System.out.println("Minusculas");
        for (String token : tokens) {
            System.out.print(token.toLowerCase() + " ");
        }

    }

    
}
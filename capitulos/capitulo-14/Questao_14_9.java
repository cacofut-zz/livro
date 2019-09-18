

/**
 * 14.9 (Exibindo uma frase com as palavras invertidas) Elabore um aplicativo que insere uma linha de texto, tokeniza a linha com o método
String split e gera os tokens na ordem inversa. Utilize caracteres de espaço em branco como delimitadores.
 */
public class Questao_14_9{

    public static void main(String[] args) {
        
        String frase = "Elabore um aplicativo que insere uma linha de texto, tokeniza a linha com o metodo " +
          "String split e gera os tokens na ordem inversa";

        String[] tokens = frase.split("\\s+");
        for( int i = tokens.length - 1; i >= 0; i-- ){
            if( i != 0 ){
                System.out.print(tokens[i] + " ");
                continue;
            }
            
            System.out.print(tokens[i] + ".");
        }
        


    }
}
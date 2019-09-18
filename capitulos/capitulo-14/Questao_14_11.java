

/**
 * (Pesquisando Strings) Elabore um aplicativo que insere uma linha de texto e um caractere de pesquisa e utiliza o método String
    indexOf para determinar o número de ocorrências do caractere no texto.
 */
public class Questao_14_11{

    public static void main(String[] args) {
        String frase    = "Elabore um aplicativo que insere uma linha de texto e gera duas vezes a saida do textoa";
        String pesquisa = "u";

        int indice = frase.indexOf(pesquisa);
        int count = 0;

        while( indice >= 0 ){
            count++;
            frase  = frase.substring(indice + 1);            
            indice = frase.indexOf(pesquisa);
        }
        System.out.printf("Numero de ocorrencias de %s = %d", pesquisa, count);

    }
}
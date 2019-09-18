

import java.security.SecureRandom;

/**
 * (Sentenças aleatórias) Elabore um aplicativo que utiliza geração de números aleatórios para criar frases. Utilize quatro arrays de strings
    chamados article, noun, verb e preposition. Crie uma frase selecionando uma palavra aleatoriamente de cada array na seguinte
    ordem: article, noun, verb, preposition, article e noun. À medida que cada palavra é selecionada, concatene-a às primeiras
    palavras na frase. As palavras devem ser separadas por espaços. Quando a frase final for enviada para saída, ela deve iniciar com uma letra
    maiúscula e terminar com um ponto. O aplicativo deve gerar e exibir 20 frases.
    O array de artigos deve conter os artigos "the", "a", "one", "some" e "any"; o array de substantivos deve conter os substantivos
    "boy", "girl", "dog", "town" e "car"; o array de verbos deve conter os verbos "drove", "jumped", "ran", "walked" e
    "skipped"; o array de preposições deve conter as preposições "to", "from", "over", "under" e "on".
 */
public class Questao_14_5{

    public static void main(String[] args) {
        
        String[] article = {"the", "a", "one", "some", "any"};
        String[] noun = {"boy", "girl", "dog", "town", "car"};
        String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
        String[] preposition = {"to", "from", "over", "under", "on"};

        SecureRandom random   = new SecureRandom();
        

        for(int i = 0; i < 20; i++){

            StringBuilder builder = new StringBuilder();
            int auxRandom = 0;

            
            auxRandom = random.nextInt(article.length);
            builder.append(article[auxRandom]);
            builder.append(" ");

            auxRandom = random.nextInt(article.length);
            builder.append(noun[auxRandom]);
            builder.append(" ");

            auxRandom = random.nextInt(article.length);
            builder.append(verb[auxRandom]);
            builder.append(" ");

            auxRandom = random.nextInt(article.length);
            builder.append(preposition[auxRandom]);
            builder.append(" ");

            auxRandom = random.nextInt(article.length);
            builder.append(article[auxRandom]);
            builder.append(" ");

            auxRandom = random.nextInt(article.length);
            builder.append(noun[auxRandom]);
            
            builder.setCharAt(0, Character.toUpperCase(builder.charAt(0)));
            builder.append(".");

            System.out.println(builder.toString());
        }
        
        

    }
}
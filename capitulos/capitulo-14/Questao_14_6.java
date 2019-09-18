import java.security.SecureRandom;

public class Questao_14_6{

    private static SecureRandom random = new SecureRandom();
    public static void main(String[] args) {
        
        

        String[] linha1 = {
            "estamos de dia",
            "quando estamos tristes sentamos",
            "rimos do outro caido por ai"
        };

        String[] linha2 = {
            "e dai coisa fria",
            "tudo pro alto e conquistamos",
            "ele caiu, e dai"
        };

        String[][] linha3 = {
            {"dia e noite vamos jogar"},
            {"coisa triste é não chorar"},
            {"qualquer coisa vale a pena desde que seja garantido"}
        };
        String[][] linha4 = {
            {"aparecemos onde menos esperar"},
            {"subimos e decemos sem ao menos morar"},
            {"cantamos e pulamos "},
            {"buscar as coisas do fundo do partido"}
        };
        String[][] linha5 = {
            {"para onde vai e vem tem companhia"},
            {"sigo indo e vindo atrás dos amos"},
            {"o governo subiu e desceu comguai"}
        };

        
        String sentence1 = sentenceRandom(linha1);
        String word1     = lastWordRandom(sentence1);

        
        String sentence2 = sentenceRandom(linha2);
        String word2     = lastWordRandom(sentence2);

        System.out.println(sentence1);
        System.out.println(word1);
        System.out.println(sentence2);
        System.out.println(word2);

    }

    private static String sentenceRandom(String[] sentences){
        int index       = random.nextInt(sentences.length);
        String sentence = sentences[index];
        return sentence;
    }

    private static String lastWordRandom(String sentence){                
        String[] array  = sentence.split("\\s+");
        String word     = array[array.length - 1];
        return word;
    }


}
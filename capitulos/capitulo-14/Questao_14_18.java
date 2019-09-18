import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Questao_14_18{

    public static void main(String[] args) {

        String frase = "To be, or not to be: that is the question aaa aaaa  a aaaaaaaa aaaaaaaaaaa aaaaaaaaaaaaaaaaaaa aaaaaaaaaaaa";
        char[] fraseArray = frase.toCharArray();

        char[] auxAlphabeth = {
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u',
                'v', 'w', 'x', 'y', 'z'
        };

        Map<Integer, String> dezenas = new HashMap<>();  
        dezenas.put(0, "");
        dezenas.put(1, "um");
        dezenas.put(2, "dois");
        dezenas.put(3, "tres");
        dezenas.put(4, "quatro");
        dezenas.put(5, "cinco");
        dezenas.put(6, "seis");
        dezenas.put(7, "sete");
        dezenas.put(8, "oito");
        dezenas.put(9, "nove");              
        dezenas.put(10, "dez");
        dezenas.put(11, "onze");
        dezenas.put(12, "doze");
        dezenas.put(13, "treze");
        dezenas.put(14, "quatorze");
        dezenas.put(15, "quinze");
        dezenas.put(16, "dezesseis");
        dezenas.put(17, "dezessete");
        dezenas.put(18, "dezoito");
        dezenas.put(19, "dezenove");
        dezenas.put(20, "vinte");
        dezenas.put(30, "trinta");
        dezenas.put(40, "quarenta");
        dezenas.put(50, "cinquenta");
        dezenas.put(60, "sessenta");
        dezenas.put(70, "setenta");
        dezenas.put(80, "oitenta");
        dezenas.put(90, "noventa");
        dezenas.put(100, "cem");

        for( int i = 20; i < 100; i++ ){
            int unidade = (i % 10);
            int dezena  = (i - (i % 10));
            String e = (unidade > 0) ? " e " : "";
            dezenas.put(i, dezenas.get(dezena) + e + dezenas.get(unidade));
        }


        Set<Integer> keys = dezenas.keySet();
        for (Integer key : keys) {
            System.out.println(dezenas.get(key));
        }


        Map<Character, Integer> alphath = new HashMap<>();

        for (char letter : auxAlphabeth) {
            alphath.put(Character.toLowerCase(letter), 0);
            alphath.put(Character.toUpperCase(letter), 0);
        }

        for( char k : alphath.keySet() ){
            System.out.println(k + " " + alphath.get(k));
        }

        System.out.println();
        System.out.println();
        System.out.println();

        for (char character : fraseArray) {            
            if( alphath.containsKey(character) ){
                alphath.put(character, alphath.get(character) + 1);              
            }
        }

        for( char k : alphath.keySet() ){
            if( alphath.get(k) == 0 ){
                System.out.println( "Nenhum '" + k + "'");
                continue;
            }
            System.out.println( "Contem " + dezenas.get(alphath.get(k)) + " '" + k + "' " + alphath.get(k));            
        }



    }
}
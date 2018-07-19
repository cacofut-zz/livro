
import java.util.Scanner;
import java.util.Random;

public class Questoes{
	
	
	public static void main(String[] args ){
		
		//14.3 (Comparando Strings ) Elabore um aplicativo que utiliza o método String compareTo para comparar duas entradas de strings pelo
		//usuário. Crie uma saída informando se a primeira string é menor que, igual a ou maior que a segunda.

		/*
		Scanner input = new Scanner(System.in);
		System.out.println("Digite uma palavra");
		String primeira = input.next();
		System.out.println("Digite outra palavra");
		String segunda = input.next();
		
		if( primeira.compareTo(segunda) > 0 ){
			System.out.println( "A primeira é maior que a segunda" );
		} 
		else{
			System.out.println( "A segunda é maior que a primeira" );
		}*/

	
		//(Comparando partes de Strings ) Elabore um aplicativo que utiliza o método String regionMatches para comparar duas en-
		//tradas de strings pelo usuário. O aplicativo deve inserir o número de caracteres que será comparado e o índice inicial da comparação. O
		//aplicativo deve declarar se as strings são iguais. Ignore a distinção entre maiúsculas e minúsculas dos caracteres ao realizar a comparação.
		
		/*
		System.out.println("Digite a primeira palavra");
		primeira = input.next();
		System.out.println("Digite a segunda palavra");
		segunda = input.next();
		if( primeira.regionMatches(true, 0, segunda, 0, segunda.length()) ){
			System.out.println("As palavras são iguais");
		}
		else{
			System.out.println("As palavras são diferentes");
		}*/

		//14.5 (Sentenças aleatórias) Elabore um aplicativo que utiliza geração de números aleatórios para criar frases. Utilize quatro arrays de strings
		//chamados article , noun , verb e preposition . Crie uma frase selecionando uma palavra aleatoriamente de cada array na seguinte
		//ordem: article , noun , verb , preposition , article e noun . À medida que cada palavra é selecionada, concatene-a às primeiras
		//palavras na frase. As palavras devem ser separadas por espaços. Quando a frase final for enviada para saída, ela deve iniciar com uma letra
		//maiúscula e terminar com um ponto. O aplicativo deve gerar e exibir 20 frases.
		//O array de artigos deve conter os artigos "the" , "a" , "one" , "some" e "any" ; o array de substantivos deve conter os substantivos
		//"boy" , "girl" , "dog" , "town" e "car" ; o array de verbos deve conter os verbos "drove" , "jumped" , "ran" , "walked" e
		//"skipped" ; o array de preposições deve conter as preposições "to" , "from" , "over" , "under" e "on" .
	
		/*
		
		String[] frases       = new String[20];
		String[] artigos      = {"the", "a", "one", "some", "any"};
		String[] substantivos = {"boy", "girl", "dog", "town", "car"};
		String[] verbos       = {"drove", "jumped" ,"ran" ,"walked", "skipped"};
		String[] preposicoes  = {"to", "from", "over", "under", "on"};
		String[][] tabela     = { artigos, substantivos, verbos, preposicoes, artigos, substantivos };

		Random random = new Random();
		for(int count = 0; count < frases.length; count++){
			String aux = "";
			for( int linha = 0; linha < tabela.length; linha++){
				int indiceRandomico = random.nextInt( tabela[linha].length );
				aux += tabela[linha][indiceRandomico] + " ";		
			}		
			frases[count] = aux.trim();
		}

		for( String frase : frases )
			System.out.printf( "\n%s.", frase.replaceFirst("\\w", String.valueOf(Character.toUpperCase(frase.charAt(0)))));*/

		//14.7 (Latim de porco) Elabore um aplicativo que codifica frases da língua inglesa em latim de porco. O Pig Latin é uma forma de linguagem
		//codificada. Há muitos métodos diferentes para formar frases em Pig Latin. Para simplificar, utilize o seguinte algoritmo:502
		//Java: como programar
		//Para formar uma frase em latim de porco a partir de uma frase em inglês, tokenize a frase em palavras com o método String split .
		//Para traduzir cada palavra inglesa em uma palavra do latim de porco, coloque a primeira letra da palavra inglesa no final da palavra e adi-
		//cione as letras “ay”. Assim, a palavra “jump” torna-se “umpjay”, a palavra “the” torna-se “hetay”, e a palavra “computer” torna-se “omputer-
		//cay”. Os espaços entre as palavras permanecem iguais. Suponha o seguinte: a frase inglesa consiste em palavras separadas por espaços, não
		//há nenhuma marcação de pontuação e todas as palavras têm duas ou mais letras. O método printLatinWord deve exibir cada palavra.
		//Cada token é passado para o método printLatinWord a fim de imprimir a palavra latina porco. Permita que o usuário insira a frase.
		//Continue exibindo todas as frases convertidas em uma área de texto.
		
		/*Scanner input = new Scanner(System.in);
		System.out.printf( "Digite uma frase ou exit para sair\n" );
		String frase = input.nextLine();

		while( !frase.equals("exit") ){

			String[] tokens = frase.split(" ");
			System.out.println();
			for(String token : tokens )
				System.out.printf("%s ", printLatinWord( token ));

			System.out.printf( "\nDigite uma frase ou exit para sair\n" );
			frase = input.nextLine();
			
		}*/
	
	}

	private static String printLatinWord( String token ){
		return token.substring(1, token.length()) + token.substring(0, 1) + "ay";
	}

}



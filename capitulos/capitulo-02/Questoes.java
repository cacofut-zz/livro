import java.util.Scanner;

public class Questoes{

	public static void main(String[] args){
	
		/*
		2.18		
		(Exibindo formas com asteriscos) Escreva um aplicativo que exiba uma 
		caixa, uma elipse, uma seta e um losango utilizando asteriscos
		(*), como segue:
		
		String[][] formas = {
			{"*", "*", "*", "*", "*", "*", "*", "*", "*", " ", " "," ","*","*","*"," ", " ", " ", " ", " ", "*", " ", " ", " ", " "," "," "," ","*"," "," "," "," "},
			{"*", " ", " ", " ", " ", " ", " ", " ", "*", " ", "*"," "," "," "," "," ", "*", " ", " ", "*", "*", "*", " ", " ", " "," "," ","*"," ","*"," "," "," "},
			{"*", " ", " ", " ", " ", " ", " ", " ", "*", " ", "*"," "," "," "," "," ", "*", " ", "*", "*", "*", "*", "*", " ", " "," ","*"," "," "," ","*"," "," "},
			{"*", " ", " ", " ", " ", " ", " ", " ", "*", " ", "*"," "," "," "," "," ", "*", " ", " ", " ", "*", " ", " ", " ", " ","*"," "," "," "," "," ","*"," "},
			{"*", " ", " ", " ", " ", " ", " ", " ", "*", " ", "*"," "," "," "," "," ", "*", " ", " ", " ", "*", " ", " ", " ", "*"," "," "," "," "," "," "," ","*"},
			{"*", " ", " ", " ", " ", " ", " ", " ", "*", " ", "*"," "," "," "," "," ", "*", " ", " ", " ", "*", " ", " ", " ", " ","*"," "," "," "," "," ","*"," "},
			{"*", " ", " ", " ", " ", " ", " ", " ", "*", " ", "*"," "," "," "," "," ", "*", " ", " ", " ", "*", " ", " ", " ", " "," ","*"," "," "," ","*"," "," "},
			{"*", " ", " ", " ", " ", " ", " ", " ", "*", " ", "*"," "," "," "," "," ", "*", " ", " ", " ", "*", " ", " ", " ", " "," "," ","*"," ","*"," "," "," "},
			{"*", "*", "*", "*", "*", "*", "*", "*", "*", " ", " "," ","*","*","*"," ", " ", " ", " ", " ", "*", " ", " ", " ", " "," "," "," ","*"," "," "," "," "}
		};
		
		for( int row = 0; row < formas.length; row++ ){
			for( int col = 0; col < formas[row].length; col++ ){
				System.out.print(formas[row][col]);	
			}
			System.out.println();	
		}
		
		System.out.println();
		System.out.println();
		//2.19 O que o seguinte c�digo imprime?		
		System.out.printf("*%n**%n***%n****%n*****%n");
		
		System.out.println();
		System.out.println();
		
		//2.20 O que o seguinte c�digo imprime?
		System.out.println("*");
		System.out.println("***");
		System.out.println("*****");
		System.out.println("****");
		System.out.println("**");
		
		System.out.println();
		System.out.println();
		
		//2.21 O que o seguinte c�digo imprime?
		System.out.print("*");
		System.out.print("***");
		System.out.print("*****");
		System.out.print("****");
		System.out.println("**");
		
		System.out.println();
		System.out.println();
		
		//2.22 O que o seguinte c�digo imprime?
		System.out.print("*");
		System.out.println("***");
		System.out.println("*****");
		System.out.print("****");
		System.out.println("**");
		
		System.out.println();
		System.out.println();
		
		//2.23 O que o seguinte c�digo imprime?
		System.out.printf("%s%n%s%n%s%n", "*", "***", "*****");
		
	    System.out.println();
		System.out.println();
		
		//2.24 (Inteiros maiores e menores) Escreva um aplicativo que leia cinco 
		//inteiros, al�m de determinar e imprimir o maior e o menor inteiro
		//no grupo. Utilize somente as t�cnicas de programa��o que voc� aprendeu 
		//neste cap�tulo.
		
		Scanner input = new Scanner(System.in);
		int n1;
		int n2;
		int n3;
		int n4;
		int n5;
		
		
		System.out.print( "Digite o primeiro inteiro: " );
		n1 = input.nextInt();
		System.out.print( "Digite o segundo inteiro: " );
		n2 = input.nextInt();
		System.out.print( "Digite o terceiro inteiro: " );
		n3 = input.nextInt();
		System.out.print( "Digite o quarto inteiro: " );
		n4 = input.nextInt();
		System.out.print( "Digite o quinto inteiro: " );
		n5 = input.nextInt();
		
		int maior = n1;
		int menor = n1;
		
		if( n2 > maior ) maior = n2;
		if( n3 > maior ) maior = n3;
		if( n4 > maior ) maior = n4;
		if( n5 > maior ) maior = n5;
		
	    if( n2 < menor ) menor = n2;
		if( n3 < menor ) menor = n3;
		if( n4 < menor ) menor = n4;
		if( n5 < menor ) menor = n5;
		
		System.out.printf("%s: %d%n", "O maior n�mero inteiro �", maior);
		System.out.printf("%s: %d%n", "O menor n�mero inteiro �", menor);
		
		System.out.println();
		System.out.println();
		
		//2.25 (�mpar ou par) Escreva um aplicativo que leia um inteiro, al�m de 
		//determinar e imprimir se ele � �mpar ou par. [Dica: utilize o operador
		//de resto. Um n�mero par � um m�ltiplo de 2. Qualquer m�ltiplo de 2 deixa um 
		//resto 0 quando dividido por 2.]
		
		System.out.print("Digite um n�mero inteiro: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		if( number % 2 == 0){
			System.out.printf("%s %d � par", "O n�mero", number);
		}
		else{
			System.out.printf("%s %d � �mpar", "O n�mero", number);	
		}
		*/
		
		
		//2.26 (M�ltiplos) Escreva um aplicativo que leia dois inteiros, al�m de
		//determinar se o primeiro � um m�ltiplo do segundo e imprimir o resultado.
		//[Dica: utilize o operador de resto.]
		
		/*
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o primeiro n�mero inteiro ");
		int number1 = input.nextInt();
		System.out.print("Digite o segundo n�mero inteiro ");
		int number2 = input.nextInt();
		
		if( number1 % number2 == 0 ){
			System.out.printf("%n%s %d %s %d", "O n�mero", number1, "� m�ltiplo de", number2);
		} 
		else{
			System.out.printf("%n%s %d %s %d", "O n�mero", number1, "n�o � m�ltiplo de", number2);
		}		
		
		
		//2.27 (Padr�o de tabuleiro de damas de asteriscos) Escreva um 
		//aplicativo que exiba um padr�o de tabuleiro de damas, como mostrado 
		//a seguir:
		
		for( int linha = 0; linha < 8; linha++ ){			
			if( linha % 2 != 0 )
				System.out.print("  ");
			
			for( int coluna = 0; coluna < 8; coluna++ ){
				System.out.print(" * ");
			}
			
			System.out.println();
			System.out.println();
		}
		
		
		//2.28 (Di�metro, circunfer�ncia e �rea de um c�rculo) Eis uma pr�via do 
		//que veremos mais adiante. Neste cap�tulo, voc� aprendeu sobre
		//inteiros e o tipo int. O Java tamb�m pode representar n�meros de pontos 
		//flutuantes que cont�m pontos de fra��o decimal, como 3,14159.
		//Escreva um aplicativo que leia a entrada a partir do usu�rio do raio de um 
		//c�rculo como um inteiro e imprima o di�metro do c�rculo,
		//circunfer�ncia e �rea utilizando o valor do ponto flutuante 3,14159 para PI. 
		//Utilize as t�cnicas mostradas na Figura 2.7. [Observa��o: voc�
		//tamb�m pode empregar a constante Math.PI predefinida para o valor de PI. 
		//Essa constante � mais precisa que o valor 3,14159. A classe
		//Math � definida no pacote java.lang. As classes nesse pacote s�o importadas 
		//automaticamente, portanto, voc� n�o precisa importar
		//a classe Math para utiliz�-la.] Adote as seguintes f�rmulas (r � o raio):
		
		System.out.print("Digite o raio do c�rculo: ");
		Scanner input = new Scanner(System.in);
		int raio = input.nextInt();
		
		System.out.printf("Di�metro do circulo � %d%n", 2 * raio);
		System.out.printf("circunfer�ncia do circulo � %f%n", 2 * Math.PI * raio);
		System.out.printf("�rea do circulo � %f%n", Math.PI * raio * raio);

		
		//2.29 (O valor inteiro de um caractere) Eis outra pr�via do que 
		//vir� adiante. Neste cap�tulo, voc� aprendeu 
		//sobre inteiros e o tipo int. O
		//Java tamb�m pode representar letras mai�sculas, min�sculas e 
		//uma variedade consider�vel de s�mbolos especiais. Cada caractere tem
		//uma representa��o correspondente de inteiro. O conjunto de 
		//caracteres que um computador utiliza com as respectivas representa��es na
		//forma de inteiro desses caracteres � chamado de conjunto de 
		//caracteres desse computador. Voc� pode indicar um valor de caractere em um
		//programa simplesmente incluindo esse caractere entre aspas simples, como em �A'.
		
		char[] caracteres = { 'A', 'B', 'C', 'a', 'b', 'c', '0', '1', '2', '$', '*', '+', '/', ' '};
		for( int i = 0; i < caracteres.length; i++ ){
			System.out.printf( "O caractere %c tem como valor inteiro %d%n", caracteres[i], (int)caracteres[i] );
		}
		
		
		
		System.out.print("Digite cinco d�gitos: ");
		Scanner input = new Scanner(System.in);
		String text   = input.nextLine();
				
		for( char c : text.toCharArray()){
			System.out.print( c + " " );	
		}
		
		
		//2.31 (Tabela de quadrados e cubos) Utilizando apenas as 
		//t�cnicas de programa��o que aprendeu neste cap�tulo, 
		//escreva um aplicativo que
		//calcule os quadrados e cubos dos n�meros de 0 a 10 e imprima os 
		//valores resultantes em formato de tabela como a seguir:
		
		System.out.printf("%-10s%-10s%-10s%n", "n�mero", "quadrado", "Cubo");
		for( int i = 0; i <= 10; i++ ){
			System.out.printf("%-10d%-10d%-10d%n", i, i * i, i * i* i);
		} 
		
		Scanner input = new Scanner(System.in);
		System.out.printf("Digite o peso em quilogramas: ");
		double quiloGramas = input.nextDouble();
		System.out.printf("Digite sua altura: ");
		double altura = input.nextDouble();
		double imc = quiloGramas / ( altura * altura );
		System.out.println();
		System.out.println();
		System.out.printf("%s: %f%n", "�ndice de massa corporal", imc);
		System.out.printf("%-15s %s%n", "Abaixo do peso:", "menor que 18.5");
		System.out.printf("%-15s %s%n", "Normal:", "entre 18.5 e 24.9");
		System.out.printf("%-15s %s%n", "Acima do peso:", "entre 25 e 29.9");
		System.out.printf("%-15s %s%n", "Obeso:", "30 ou mais");
		
		
		double populacaoMundialAtual = 7.600000000;
		double taxaDeCrescimento     = 0.33;
		
		for( int i = 1; i <= 5; i++  ){
			double diferenca = 
				( populacaoMundialAtual * taxaDeCrescimento ) / 100;
			
		populacaoMundialAtual += diferenca;		                    
			System.out.printf( "%d� %s: %f%n", i, "ano", populacaoMundialAtual );	
		}
		*/
		//2.35 (Calculadora de economia da faixa solid�ria) 
		//Pesquise v�rios sites sobre faixa solid�ria. Crie um 
		//aplicativo que calcule o custo di�rio
		//de dirigir, para estimar quanto dinheiro pode ser economizado 
		//com o uso da faixa solid�ria, que tamb�m tem outras vantagens, como
		//reduzir emiss�es de carbono e congestionamento de tr�fego. 
		//O aplicativo deve introduzir as seguintes informa��es e 
		//exibir o custo por dia
		//de dirigir para o trabalho do usu�rio:
		//a) Quil�metros totais dirigidos por dia.
		//b) Pre�o por litro de gasolina.
		//c) Quil�metros m�dios por litro.
		//d) Taxas de estacionamento por dia.
		//e) Ped�gio por dia.
		
		Scanner input = new Scanner(System.in);
		System.out.printf("Digite quil�metros totais dirigidos por dia: ");
		int quilometros = input.nextInt(); 
	    //System.out.printf("Digite pre�o por litro de gasolina");
		double precoPorLitro = 3.89;//input.nextInt();
		//System.out.printf("Digite quil�metros m�dios por litro.");
		int quilometrosMediosPorLitro = 13;//input.nextInt();
		System.out.printf("Digite taxas de estacionamento por dia: ");
		double estacionamento = input.nextInt();
		System.out.printf("Digite ped�gio por dia: ");
		double pedagio = input.nextInt();
		System.out.printf("Digite quantas pessoas o acompanham no carro: ");
		double qtdPessoas = input.nextInt();
		
		double total;
		
		if( quilometros < quilometrosMediosPorLitro ){
			int diferenca = quilometrosMediosPorLitro - quilometros;
			total = diferenca * precoPorLitro / 
				quilometrosMediosPorLitro + estacionamento + pedagio;
				
			System.out.printf("Custo di�rio trabalho: %f", total );
		}
		else if( quilometros == quilometrosMediosPorLitro ){
			total = precoPorLitro + estacionamento + pedagio;
			System.out.printf("Custo di�rio trabalho: %f", precoPorLitro + estacionamento + pedagio );
		}
		else{
			int diferenca = quilometros / quilometrosMediosPorLitro;
			int resto = quilometros % quilometrosMediosPorLitro;
			double resultadoFinal = (diferenca * precoPorLitro) + 
				(( resto * precoPorLitro ) / quilometrosMediosPorLitro + estacionamento + pedagio );
			total = resultadoFinal;
			System.out.printf("Custo di�rio trabalho: %f%n", resultadoFinal );
		}
		
		if( qtdPessoas <= 1 ){
			System.out.printf("Voc� n�o economizou e n�o ajudou o meio ambiente");
		}
		else{
			System.out.printf( "%s %f %s", "Voc� economizou", total - (total / qtdPessoas), 
				"e ajudou o meio ambiente");
		}
		
		
		
		
		
		
	}
}
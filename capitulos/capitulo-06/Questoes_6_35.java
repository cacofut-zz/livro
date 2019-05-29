
import java.util.Scanner;
import java.security.SecureRandom;

public class Questoes_6_35{

	/*
	Escreva um programa que ajudará um aluno da escola elementar a aprender multiplicação. Utilize um objeto SecureRandom para produzir
	dois inteiros positivos de um algarismo. O programa deve então fazer ao usuário uma pergunta, como
	Quanto é 6 vezes 7?
	O aluno insere então a resposta. Em seguida, o programa verifica a resposta do aluno. Se estiver correta, exiba a mensagem "Muito bem!"
	e faça uma outra pergunta de multiplicação. Se a resposta estiver errada, exiba a mensagem "Não. Por favor, tente de novo." e
	deixe que o aluno tente a mesma pergunta várias vezes até que por fim ele acerte. Um método separado deve ser utilizado para gerar cada
	nova pergunta. Esse método deve ser chamado uma vez quando a aplicação inicia a execução e toda vez que o usuário responde a pergunta
	corretamente.
	*/
	
	
	private static int numero1;
	private static int numero2;
	private static int respostaCorreta;
	private static SecureRandom random = new SecureRandom();
	private static Scanner input = new Scanner(System.in);
	private static String[] mensagensCorretas = {
		"Muito bom!",
		"Excelente!",
		"Bom trabalho!",
		"Mantenha um bom tabalho!"
	};
	private static String[] mensagensInCorretas = {
		"Não. Por favor, tente de novo.",
		"Errado. Tente mais uma vez.",
		"Não desista!",
		"Não. Continue tentando."
	};
	
	public static void main(String[] args){
		
		novaTabuada();			
		int respostaDoAluno = input.nextInt();
			
		while( respostaDoAluno != -1 ){			
						
			while( respostaDoAluno == respostaCorreta && respostaDoAluno != -1 ){
				System.out.printf("%s%n", mensagensCorretas[random.nextInt(mensagensInCorretas.length)]);
				novaTabuada();			
			    respostaDoAluno = input.nextInt();
			}
			
			while( respostaDoAluno != respostaCorreta && respostaDoAluno != -1 ){
				System.out.printf("%s%n", mensagensInCorretas[random.nextInt(mensagensInCorretas.length)]);						
			    respostaDoAluno = input.nextInt();
			}
			System.out.printf("%s%n", mensagensCorretas[random.nextInt(mensagensInCorretas.length)]);	
			
			novaTabuada();			
			respostaDoAluno = input.nextInt();
			
		}
		
		
	}
	
	public static void novaTabuada(){
		numero1 = random.nextInt(10);
		numero2 = random.nextInt(10);
		System.out.printf("%n%nQuanto é %d * %d = ?: ", numero1, numero2);
		respostaCorreta = numero1 * numero2;
		
	}
}
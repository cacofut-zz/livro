
import java.util.Scanner;
import java.security.SecureRandom;

public class Questoes_6_35{

	/*
	Escreva um programa que ajudar� um aluno da escola elementar a aprender multiplica��o. Utilize um objeto SecureRandom para produzir
	dois inteiros positivos de um algarismo. O programa deve ent�o fazer ao usu�rio uma pergunta, como
	Quanto � 6 vezes 7?
	O aluno insere ent�o a resposta. Em seguida, o programa verifica a resposta do aluno. Se estiver correta, exiba a mensagem "Muito bem!"
	e fa�a uma outra pergunta de multiplica��o. Se a resposta estiver errada, exiba a mensagem "N�o. Por favor, tente de novo." e
	deixe que o aluno tente a mesma pergunta v�rias vezes at� que por fim ele acerte. Um m�todo separado deve ser utilizado para gerar cada
	nova pergunta. Esse m�todo deve ser chamado uma vez quando a aplica��o inicia a execu��o e toda vez que o usu�rio responde a pergunta
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
		"N�o. Por favor, tente de novo.",
		"Errado. Tente mais uma vez.",
		"N�o desista!",
		"N�o. Continue tentando."
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
		System.out.printf("%n%nQuanto � %d * %d = ?: ", numero1, numero2);
		respostaCorreta = numero1 * numero2;
		
	}
}
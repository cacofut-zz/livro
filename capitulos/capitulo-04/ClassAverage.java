
import java.util.Scanner;

public class ClassAverage{
	
	public static void main(String[] args){
		
		//cria Scanner para obter entrada da janela de comando
		Scanner input = new Scanner(System.in);
		
		//fase de inicializaçao
		int total = 0;
		int contadorDeNotas = 0;
		
		System.out.print("Digite a nota ou -1 para sair: ");
		int nota = input.nextInt();
		
		//fase de processamento utiliza repetição controlada por contador
		while(nota != -1){			
			total += nota;
			contadorDeNotas++;
			System.out.print("Digite a nota ou -1 para sair: ");
			nota = input.nextInt();
		}
		
		if( contadorDeNotas != 0 ){
			double media = (double) total / contadorDeNotas;
			System.out.printf("%nO Total de %d notas inseridas é %d%n",
				contadorDeNotas, total);
			System.out.printf("Média da class é %.2f%n", media);
		}                                
		else{
			System.out.printf("Nenhuma nota foi inserida!");
		}
		
		

	}
	
	

}
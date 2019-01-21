
import java.util.Scanner;

public class Analysis{

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int aprovados = 0;
		int reprovados = 0;
		int contadorEstudante = 1;
		
		while(contadorEstudante <= 10){
			System.out.print("Digite o resultado (1 = aprovado, 2 = reprovado): ");
			int resultado = input.nextInt();
			if( resultado == 1 )
				aprovados++;
			else
				reprovados++;
			contadorEstudante++;
			
		}
		
		System.out.printf("Aprovados: %d%nReprovados: %d%n", 
			aprovados, reprovados);
		if(aprovados > 8)
			System.out.println("Bônus para o instrutor!");
	}

}
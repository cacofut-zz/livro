import java.util.Scanner;

public class Questoes_6_8{

	private static Scanner input = new Scanner(System.in);
/*
(Taxas de estacionamento) Um estacionamento cobra uma tarifa mínima de R$ 2,00 para estacionar por até três horas. Um adicional
de R$ 0,50 por hora não necessariamente inteira é cobrado após as três primeiras horas. A tarifa máxima para qualquer dado período
de 24 horas é R$ 10,00. Suponha que nenhum carro fique estacionado por mais de 24 horas por vez. Escreva um aplicativo que calcule e
exiba as tarifas de estacionamento para cada cliente que estacionou nessa garagem ontem. Você deve inserir as horas de estacionamento
para cada cliente. O programa deve exibir a cobrança para o cliente atual e calcular e exibir o total dos recibos de ontem. Ele deve utilizar
o método calculateCharges para determinar a tarifa para cada cliente.
*/
	public static void main(String[] args){
		
		double tarifa_minima   = 2.00;
		double ate_tres_horas  = 3.00;
		System.out.printf("Digite a quantidade de horas: ");
		double total_horas     = input.nextDouble();
		double adicional       = 0.50;
		double diferenca_horas = ate_tres_horas - total_horas;
		double valor_a_pagar   = tarifa_minima;
		
		if( diferenca_horas < 0 ){
			valor_a_pagar += Math.ceil(Math.abs(diferenca_horas)) * adicional;
		}
		
		System.out.printf("%nO valor do estacionamento foi de: %.2f%n", valor_a_pagar);
		
	}
}
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Exercicios{

	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args){
		//exercicio_4_17();
		//exercicio_4_18();
		exercicio_4_19();
	}
	
	public static void exercicio_4_17(){
		
		int quilometros = 0;
		int gasolina    = 0;
		double total    = 0.0;
		System.out.printf("%nDigite a quantidade de quil�metros percorridos ou (-1) para sair: ");
		quilometros = input.nextInt();
		
		while(quilometros != -1){
			
			System.out.printf("%nDigite a quantidade em litros de gasolina: ");
			gasolina = input.nextInt();
			
			total = (double) quilometros / gasolina;
			System.out.printf("%nTotal de quil�metros %d", quilometros);
			System.out.printf("%nTotal de gasolina %d", gasolina);
			System.out.printf("%nTotal de gasolina por quil�metro rodado %.2f", total);
			
			System.out.printf("%nDigite a quantidade de quil�metros percorridos ou (-1) para sair: ");
			quilometros = input.nextInt();

		}
		
	}
	
	
	/*
	(Calculador de limite de cr�dito) Desenvolva um aplicativo Java que 
	 determina se um cliente de uma loja de departamentos excedeu o
	limite de cr�dito em uma conta-corrente. Para cada cliente, 
	 os seguintes dados est�o dispon�veis:
	a) N�mero de conta.
	b) Saldo no in�cio do m�s.
	c) Total de todos os itens cobrados desse cliente no m�s.
	d) Total de cr�ditos aplicados ao cliente no m�s.
	e) Limite de cr�dito autorizado.
	O programa deve inserir todos esses dados como inteiros, calcular o novo saldo 
	 (= saldo inicial + despesas � cr�ditos), exibir o novo saldo e
	determinar se o novo saldo excede ao limite de cr�dito do cliente. 
	Para aqueles clientes cujo limite de cr�dito foi excedido, o programa deve
	exibir a mensagem "Limite de cr�dito excedido".
	*/
	public static void exercicio_4_18(){
		// Inicializar �s vari�veis
			int numeroDaConta = 0;
			int saldoInicial = 0;
			int valorDosItensCobrados = 0;
			int creditosAplicados = 0;
		    int limiteDeCredito = 0;
		    int novoSaldo = 0;
		    
		// Realizar o processamento
			System.out.printf("Digite o n�mero da conta: ");
			numeroDaConta = input.nextInt();
			System.out.printf("Digite o saldo inicial: ");
			saldoInicial = input.nextInt();
			System.out.printf("Digite o valor dos itens cobrados: ");
			valorDosItensCobrados = input.nextInt();
			System.out.printf("Digite o valor dos cr�ditos aplicados: ");
			creditosAplicados = input.nextInt();
			System.out.printf("Digite o limite de cr�dito: ");
			limiteDeCredito = input.nextInt();			
			novoSaldo = saldoInicial + valorDosItensCobrados - creditosAplicados;
			
			// Mostrar os resultados
			System.out.printf("%nO seu novo saldo � de %d",novoSaldo);
			if( novoSaldo >  limiteDeCredito )
				System.out.printf("%nLimite de cr�dito excedido");
			
		
	}
	
	/*
	(Calculador de comiss�o de vendas) Uma grande empresa paga seu pessoal 
	de vendas com base em comiss�es. O pessoal de vendas
	recebe R$ 200 por semana mais 9% de suas vendas brutas durante esse 
	per�odo. Por exemplo, um vendedor que realiza um total de vendas
	de mercadorias de R$ 5.000 em uma semana recebe R$ 200 mais 9% de R$ 5.000,
	um total de R$ 650. Foi-lhe fornecida uma lista dos itens
	vendidos por cada vendedor. Os valores desses itens s�o como segue:
		Item Value
		1 239.99
		2 129.75
		3 99.95
		4 350.89
	Desenvolva um aplicativo Java que recebe entrada de itens vendidos por um 
	vendedor durante a �ltima semana e calcula e exibe os rendimentos
	do vendedor. N�o existe nenhum limite para o n�mero de itens que pode ser vendido.
	*/
	public static void exercicio_4_19(){
		// inicialzar vari�veis
		double valorPagoPorSemana  = 200.00;
		double vendaBrutaPorSemana = 0.00;
		int percentual   = 9;
		double total     = 0.0;
		double itemAtual = 0.0;
		double totalDosItensVendidos = 0.0;
		List<Double> itens = new ArrayList<>();    
		
		//Processamento
		System.out.println( "Digite os itens vendidos ou (-1) para sair" );
		itemAtual = input.nextDouble();
		
		while(itemAtual != -1){
			itens.add(itemAtual);			
			System.out.println( "Digite os itens vendidos ou (-1) para sair" );
			itemAtual = input.nextDouble();			
		}
		
		System.out.printf("%-10s %s%n", "Item", "Value");
		for( Double valor : itens ){
			totalDosItensVendidos += valor;
			//System.out.printf("Valor do rendimento semana � de %.2f", total);
		}
		total = ( totalDosItensVendidos * percentual / 100 ) + valorPagoPorSemana;
		
		//Mostrar resultados
		
		System.out.printf("Valor do rendimento semana � de %.2f", total);
		
	
	}
	
	
}
import java.security.SecureRandom;
import java.util.Scanner;

/*
	6.29 (Cara ou coroa) Escreva um aplicativo que simula o jogo de cara ou coroa. 
		Deixe o programa lançar uma moeda toda vez que o usuário
		escolher a opção "Toss Coin" no menu. Conte o número de vezes que cada lado da 
		moeda aparece. Exiba os resultados. O programa
		deve chamar um método flip separado que não aceita argumentos e retorna 
		um valor a partir de um Coin enum (HEADS e TAILS).
		[Observação: se o programa simular de modo realista o arremesso de moeda, 
		cada lado da moeda deve aparecer aproximadamente metade
		das vezes.]
*/
public class Questoes_6_29{
	private static Scanner input = new Scanner(System.in);
	private static SecureRandom random = new SecureRandom();
	private static int qtd_caras = 0;
	private static int qtd_coroas = 0;
			
	public static void main(String[] args){
		
		//System.exit(0);
		System.out.printf("%nEscolha uma opção: %n");
		System.out.printf("1 - Toss Coin: %n");
		System.out.printf("2 - Quit: %n");
		Opcoes escolha = Opcoes.toEnum(input.nextInt());
		
		/*for( Opcoes opcao : Opcoes.values() )
			System.out.println(opcao.getValorOpcao());*/
		
		while( escolha != Opcoes.QUIT ){
			Coin coin = flip();
			if( coin == Coin.HEADS )
				qtd_caras++;
			else if( coin == Coin.TAILS )
				qtd_coroas++;
			
			System.out.printf("Número de caras %d%n", qtd_caras);
			System.out.printf("Número de coroas %d%n", qtd_coroas);
			
			System.out.printf("Escolha uma opção: %n");
			System.out.printf("1 - Toss Coin: %n");
			System.out.printf("2 - Quit: %n");
			escolha = Opcoes.toEnum(input.nextInt());
		}
	}
	
	public static Coin flip(){
		int intRandom = random.nextInt(Coin.values().length);
		Coin coin = Coin.toEnum(intRandom);
		return coin;
	}
}

enum Coin{
	HEADS(0), TAILS(1);
	
	private int valor;
	Coin(int valor){
		this.valor = valor;
	}
	public int getValor(){
		return this.valor;
	}
	
	public static Coin toEnum( Integer valor ){
		if( valor == null )
			return null;
		for( Coin c : Coin.values() ){
			if( valor.equals(c.getValor())){
				return c;
			}
		}
		
		throw new IllegalArgumentException("Valor inválido");
	}
}

enum Opcoes{
	TOSS_COIN(1), QUIT(2);
	
	private int valorOpcao;
	Opcoes(int valor){
		valorOpcao = valor;
	}
	
	public int getValorOpcao(){
		return valorOpcao;
	}
	
	public static Opcoes toEnum( Integer opcao ){
		if( opcao == null )
			return null;		
		for( Opcoes op : Opcoes.values() ){
			if( opcao.equals(op.getValorOpcao())){
				return op;
			}
		}		
		throw new IllegalArgumentException("Opção inválida");
	}
}
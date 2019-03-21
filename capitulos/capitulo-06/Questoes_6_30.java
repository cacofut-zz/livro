import java.util.Scanner;
import java.security.SecureRandom;

public class Questoes_6_30{
	
	private static SecureRandom random = new SecureRandom();
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args){				
		EstadoDoJogo estadoDoJogo = EstadoDoJogo.INICIAR;		
		while( estadoDoJogo == EstadoDoJogo.INICIAR || 
			   estadoDoJogo == EstadoDoJogo.CONTINUAR ){		
			int numeroAlvo = 1 + random.nextInt(1000);
			int qtdTentativas = 0;
			System.out.printf("%nAdivinhe um número entre 1 e 1000: ");
			int numeroEscolhido = input.nextInt();
			
			while( estadoDoJogo != EstadoDoJogo.ACERTOU ){	
				qtdTentativas++;
				System.out.printf("tentativas %d%n", qtdTentativas);
				if( numeroEscolhido < numeroAlvo ){
					System.out.printf("Muito baixo. Tente novamente%n");
					estadoDoJogo = EstadoDoJogo.MUITO_BAIXO;
				}
				else if( numeroEscolhido > numeroAlvo ){
					System.out.printf("Muito alto. Tente novamente%n");
					estadoDoJogo = EstadoDoJogo.MUITO_ALTO;
				}
				else if( numeroEscolhido == numeroAlvo ){
					if( qtdTentativas < 10 )
						System.out.printf("%nVocê sabe o segredo ou tem nuita sorte");
					else if( qtdTentativas == 10 )
						System.out.printf("%nAha! Você sabe o segredo");
					else
						System.out.printf("%nVocê deve ser capaz de fazer melhor");
					
					System.out.printf("%nParabéns. Você adivinhou o número");
					System.out.printf("%nGostaria de jogar novamente? (5-sim) ou (4-não)");
					estadoDoJogo = EstadoDoJogo.toEnum(input.nextInt());											
					break;
				}
				
				numeroEscolhido = input.nextInt();
							
			}// fim while
			
		}// fim while
		
	}// fim main
}

enum EstadoDoJogo{
	MUITO_ALTO(0, "Muito alto"), 
	MUITO_BAIXO(1, "Muito baixo"), 
	ACERTOU(2, "Acertou"),
	INICIAR(3, "Iniciar"),
	FINALIZAR(4, "Finalizar"),
	CONTINUAR(5, "Continuar");
	
	private int valor;
	private String descricao;
	
	EstadoDoJogo( int valor, String descricao ){
		this.valor = valor;
		this.descricao = descricao;
	}
	
	public int getValor(){
		return this.valor;
	}
	
	public String getDescricao(){
		return this.descricao;
	}
	
	public static EstadoDoJogo toEnum( Integer valor ){
		if( valor == null )
			return null;
		for( EstadoDoJogo estado : EstadoDoJogo.values() ){
			if( valor.equals(estado.getValor())){
				return estado;	
			}
		}
		throw new IllegalArgumentException("Valor inválido");
	}
}
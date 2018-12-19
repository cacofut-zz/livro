import javax.swing.JOptionPane;

public class FaturaTest{

	public static void main(String[] args){
		
		String numero = JOptionPane
			.showInputDialog("Digite o n�mero da fatura");
		String descricao = JOptionPane
			.showInputDialog("Digite a descri��o da fatura");
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade"));
		double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o pre�o"));
		Fatura fatura = new Fatura(numero, "Computador", quantidade, 1200.00);
		
		System.out.printf("O valor da fatura: %.2f %n", fatura.getInvoiceAmount());
		
		System.out.println( "quantidade " +  quantidade);
		System.out.println( "Pre�o " + preco);
		
		String mensagem = String.format(
				"%-20s: %-20s%n%-20s: %-20s%n %-20s: %-20d%n %-20s: %-20.2f", 
				"Fatura", numero, "Descri��o", descricao, "Quantidade", quantidade, "Pre�o", preco);
		JOptionPane.showMessageDialog(null, mensagem);
		
	}
}
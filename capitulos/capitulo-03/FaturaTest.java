import javax.swing.JOptionPane;

public class FaturaTest{

	public static void main(String[] args){
		
		String numero = JOptionPane
			.showInputDialog("Digite o número da fatura");
		String descricao = JOptionPane
			.showInputDialog("Digite a descrição da fatura");
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade"));
		double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço"));
		Fatura fatura = new Fatura(numero, "Computador", quantidade, 1200.00);
		
		System.out.printf("O valor da fatura: %.2f %n", fatura.getInvoiceAmount());
		
		System.out.println( "quantidade " +  quantidade);
		System.out.println( "Preço " + preco);
		
		String mensagem = String.format(
				"%-20s: %-20s%n%-20s: %-20s%n %-20s: %-20d%n %-20s: %-20.2f", 
				"Fatura", numero, "Descrição", descricao, "Quantidade", quantidade, "Preço", preco);
		JOptionPane.showMessageDialog(null, mensagem);
		
	}
}
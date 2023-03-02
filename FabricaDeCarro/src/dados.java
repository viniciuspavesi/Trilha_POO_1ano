import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class dados {

	public static int opcoesPerguntas() {
		
		String[] opcoes = {"Fabricar um novo carro", "Vender um carro", "Ver informações de um carro", "Sair do programa"};
		
		JComboBox<String> menu = new JComboBox<String> (opcoes);
		
		JOptionPane.showConfirmDialog(null, menu, "Por favor escolha a opção desejada", JOptionPane.OK_CANCEL_OPTION);
		
		return menu.getSelectedIndex();
	}
	
	public static String solicitaCor(String cor) {
			return JOptionPane.showInputDialog("Informe a cor do carro");
	}
	
	public static String solicitaModelo(String modelo) {
		return JOptionPane.showInputDialog("Informe o modelo do carro");
	}
	
	public static String solicitaMarca(String marca) {
		return JOptionPane.showInputDialog("Informe a marca do carro");
	}
	
	//public static int solicitaAno(int ano) {
		//return JOptionPane.showInputDialog("Informe o ano do carro");
	//}
	
	public static void exibeMsgEncerraPrograma() {
		JOptionPane.showMessageDialog(null, "O programa será encerrado!");
	
	}
}

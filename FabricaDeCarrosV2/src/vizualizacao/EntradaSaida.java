package vizualizacao;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class EntradaSaida {

public static int opcoesPerguntas() {
		
		String[] opcoes = {"Fabricar um novo carro", "Vender um carro", "Ver informações de um carro", "Sair do programa"};
		
		JComboBox<String> menu = new JComboBox<String> (opcoes);
		
		JOptionPane.showConfirmDialog(null, menu, "Por favor escolha a opção desejada", JOptionPane.OK_CANCEL_OPTION);
		
		return menu.getSelectedIndex();
	}
	
	public static String solicitaCor() {
			return JOptionPane.showInputDialog("Informe a cor do carro");
	}
	
	public static String solicitaModelo() {
		return JOptionPane.showInputDialog("Informe o modelo do carro");
	}
	
	public static String solicitaMarca() {
		return JOptionPane.showInputDialog("Informe a marca do carro");
	}
	
	public static void exibeMsgEncerraPrograma() {
		JOptionPane.showMessageDialog(null, "O programa será encerrado!");
	
	}

	public static int solicitarQuantidade() {
		return Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de carros que você deseja fabricar"));
	}

}


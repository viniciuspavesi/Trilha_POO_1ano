import javax.swing.JOptionPane;

public class controladora {

private fabrica fabrica = new fabrica();
private carro carro = new carro(); 
	
	public void exibeMenu() {
		
		int opcoes;
		
		do {
			opcoes = dados.opcoesPerguntas();

			switch(opcoes) {
				case 0:
					String cor = dados.solicitaCor("cor");
					String modelo = dados.solicitaModelo("modelo");
					String marca = dados.solicitaMarca("marca");
					System.exit(0);
				break;
				
				case 1:
					JOptionPane.showMessageDialog(null, "Você está na área de vender um carro");
					System.exit(0);
				break;
				
				case 2:
					JOptionPane.showMessageDialog(null, "Você está na área de solicitar inforções sobre um carro");
					System.exit(0);
				break;
			}
			
		} while (opcoes != 3);
		
		dados.exibeMsgEncerraPrograma();
		
		System.exit(0);
		
	}
	
}

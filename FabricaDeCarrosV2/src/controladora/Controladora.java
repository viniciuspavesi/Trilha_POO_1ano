package controladora;

import javax.swing.JOptionPane;

import vizualizacao.EntradaSaida;
import controladora.Fabrica;


public class Controladora {

	private Fabrica fabrica = new Fabrica();
	private Carro carro = new Carro();

	public void exibeMenu() {
			
			int opcoes;
			
			do {
				opcoes = EntradaSaida.opcoesPerguntas();

				switch(opcoes) {
				
					case 0:
						
						private void fabricarCarro() {
							
							int qtde = EntradaSaida.solicitarQuantidade();
							int i;
							for(i=0;i<qtde;i++) {
								carro.setModelo(EntradaSaida.solicitaModelo());
								carro.setMarca(EntradaSaida.solicitaMarca());
								carro.setCor(EntradaSaida.solicitaCor());
								fabrica.fabricarCarro(carro.getModelo(),carro.getCor(),carro.getMarca());
							}
						}
					break;
					
					case 1:
						
					break;
					
					case 2:
						fabrica.exibirEstoque();
						
					break;
				}
				
			} while (opcoes != 3);
			
			EntradaSaida.exibeMsgEncerraPrograma();
			
			System.exit(0);
			
		}

}

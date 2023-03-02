package controle;

import vizualizacao.EntradaSaida;

public class Controladora {
	
	public void exibeMenu() {
		
		int opcao;
		do {
			opcao = EntradaSaida.solicitaOpcao();
			
			switch(opcao){
				case 0:
					String cor = EntradaSaida.solicitaDescricao("cor");
					String ano = EntradaSaida.solicitaDescricao("ano");
					String marca = EntradaSaida.solicitaDescricao("marca");
					String modelo = EntradaSaida.solicitaDescricao("modelo");
				break;
			}
		}while(opcao!=1);
	}
}

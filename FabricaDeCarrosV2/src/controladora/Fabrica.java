package controladora;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Fabrica {

	ArrayList<Carro> carrosFab = new ArrayList<>();
	
	public void fabricarCarro(String modelo, String cor, String marca) {
		
		Carro carro = new Carro();
		carro.setModelo(modelo);
		carro.setCor(cor);
		carro.setMarca(marca);
		carrosFab.add(carro);
	}
	
	public void exibirEstoque() {
		
		for(int i = 0;i< carrosFab.size(); i++) {
			Carro c=carrosFab.get(i);
			JOptionPane.showMessageDialog(null, c.getModelo()+" "+c.getCor()+" "+c.getMarca());
			
		}
	}
	
	public void venderCarro(String modelo, String cor, String marca) {
		
		for(int i = 0; i < carrosFab.size(); i++) {
			
			Carro c = carrosFab.get(i);
			if ((c.getModelo().equals(modelo))&&(c.getCor().equals(cor))&&(c.getMarca().equals(marca))) {
				System.out.println("Quero");
				carrosFab.remove(c);
			}else {
				System.out.println("Não quero");
			}
		}
	}
}

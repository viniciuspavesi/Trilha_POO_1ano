
import java.util.ArrayList;

public class fabrica {

		ArrayList<carro> carrosFab = new ArrayList<>();
		
		public void fabricarCarro(String modelo, String cor, String marca) {
			
			carro carro = new carro();
			carro.setModelo(modelo);
			carro.setCor(cor);
			carro.setMarca(marca);
			carrosFab.add(carro);
		}
}

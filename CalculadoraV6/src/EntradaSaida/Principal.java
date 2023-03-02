package EntradaSaida;

import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args) {
		
		int continuar;
		double resultado = 0;
		Operacoes oper = null;
		
		do {
			double num1 = EntradaSaida.solicitaNumero("1�"); 
			double num2 = EntradaSaida.solicitaNumero("2�");
			int operacao = EntradaSaida.solicitaOperacao();
			
			switch(operacao) {
			case 1:
				oper = new Soma(); // HERAN�A
				break;
			case 2:
				oper = new Subtracao(); // HERAN�A
				break;
			case 3:
				oper = new Multiplicacao(); // HERAN�A
				break;
			case 4:
				while (num2==0) {
					num2=EntradaSaida.solicitaNumero("2�");
				}
				oper = new Divisao(); // HERAN�A
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opera��o inv�lida! A calculadora ser� encerrada!");
				System.exit(0); 
			}
			oper.setNum1(num1); // POLIMORFISMO
			oper.setNum2(num2); // POLIMORFISMO
			resultado=oper.calcula(); // POLIMORFISMO
			
			EntradaSaida.mostraResultado(resultado, operacao);
			continuar=Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar calculando? 1-Sim  2- N�o"));
		
		} while (continuar==1);

	}
	
}

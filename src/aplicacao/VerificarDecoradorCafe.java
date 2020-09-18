package aplicacao;

import javax.swing.*;

import componentes.Bebida;
import componentes.Expresso;
import decoradores.Leite;

public class VerificarDecoradorCafe {
	public static void main(String[] args) {
		String resultado= "";
		JTextArea saida = new JTextArea(10, 40);
		
		saida.setText("PEDIDOS STARBUZZCOFFEE \n\n");
		saida.setLineWrap(true);
		
		// CASO 1 CAFÉ EXPRESSO SEM CONDIMENTO
		Bebida expresso1 = new Expresso();
		resultado = "CASO 1 " + expresso1.getDescricao() + " R$" + expresso1.custo() + "\n";
		saida.append(resultado);
		// CASO 2 CAFÉ EXPRESSO COM LEITE
		Bebida expresso2 = new Expresso();
		expresso2 = new Leite(expresso2);
		resultado = "CASO 2 " + expresso2.getDescricao() + " R$" + expresso2.custo() + "\n"; 
		saida.append(resultado);
		JOptionPane.showMessageDialog(null, saida);
		//TODO Continuar:
		// CASO 3 CAFÉ DESCAFEINADO COM: SOJA, LEITE E CHOCOLATE
		// NOVA SAÍDA SÓ PARA CASO 3
		// CASO 4 MISTURA DA CASA COM CHOCOLATE E LEITE
		// NOVA SAÍDA SÓ PARA CASO 4
	}
}

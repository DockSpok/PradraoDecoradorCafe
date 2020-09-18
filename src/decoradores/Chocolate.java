package decoradores;

import componentes.Bebida;

public class Chocolate extends DecoradorCondimento {
	Bebida bebida;
	public Chocolate(Bebida bebida) {
		this.bebida = bebida;
	}
	public String getDescricao(){
		return bebida.getDescricao() + ", DECORADO COM CHOCOLATE";
	}
	@Override
	public double custo() {
		return 1.00 + bebida.custo();
	}
}

package decoradores;

import componentes.Bebida;

public class Soja extends DecoradorCondimento {
	Bebida bebida;
	public Soja(Bebida bebida) {
		this.bebida = bebida;
	}
	@Override
	public String getDescricao() {
		return bebida.getDescricao() + ", DECORADO COM SOJA";
	}
	@Override
	public double custo() {
		return 1.50 + bebida.custo();
	}
}

package decoradores;

import componentes.Bebida;

public class Leite extends DecoradorCondimento{
	Bebida bebida;
	public Leite(Bebida bebida) {
		this.bebida = bebida;
	}
	@Override
	public String getDescricao() {
		return bebida.getDescricao() + ", DECORADO COM LEITE";
	}
	@Override
	public double custo() {
		return 0.50 + bebida.custo();
	}
}

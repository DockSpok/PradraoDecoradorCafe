package componentes;

public class Expresso extends Bebida{
	public Expresso() {
		descricao = "EXPRESSO";
	}
	@Override
	public double custo() {
		return 1.50;
	}

}

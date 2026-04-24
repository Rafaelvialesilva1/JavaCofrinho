package empresa;

public class Euro extends Moeda {
	private static final double euro = 6.00; 
	
	
	public Euro(double valor) {
		super(valor);
	}
	
	//mostra informacoes da moeda euro caso necessario
	@Override
	public void info() {
		System.out.println("Euro: €" + valor);
	}
	
	//converte euro em real
	@Override
	public double converter() {
		return valor * euro;
	}

}

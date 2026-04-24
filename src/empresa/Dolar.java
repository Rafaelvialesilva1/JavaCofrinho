package empresa;

public class Dolar extends Moeda {
	//a taxa de câmbio é a mesma para todos os dólares, por isso usei static final
	private static final double dolar = 5.50; 
	
	public Dolar(double valor) {
		super(valor);
		}
	
	//mostra informacoes da moeda dolar caso necessario
	@Override
	public void info() {
		System.out.println("Dolar: $" + valor);
	}

	//converte dolar em real
	@Override //@Override nos alerta quando cometemos erros de digitacao
	public double converter() {
		return valor * dolar;
	}
	
}

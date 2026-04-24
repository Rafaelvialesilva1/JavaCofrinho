package empresa;

public class Real extends Moeda {
    
	//chama construtor da classe mae
    public Real(double valor) {
        super(valor);
    }
    
    //mostra informacoes da moeda real caso necessario
    @Override
    public void info() {
        System.out.printf("Real: R$%.2f%n", valor);
    }
    
    //real ja esta em reais nao precisa conversao
    @Override
    public double converter() {
        return valor;
    }
}
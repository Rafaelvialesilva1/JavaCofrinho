package empresa;

//abstract nao pode ser instanciada diretamente
public abstract class Moeda {
    
	//valor da moeda e um protected para ser acessivel pelas classes filhas
    protected double valor;
    
    //inicializa o valor
    public Moeda(double valor) {
        this.valor = valor;
    }
    
    //metodo para obter valor
    public double getValor() {
        return valor;
    }
    
    //metodo para alterar valor
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    //metodo abstrato para mostrar informacoes
    public abstract void info(); 
    
    //metodo abstrato para converter para real, cada classe filha converte de forma diferente
    public abstract double converter();
}
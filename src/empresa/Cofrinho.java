package empresa;

import java.util.ArrayList;

//armazena varias moedas
public class Cofrinho {
    
	//lista para armazenar moedas (usa arraylist para lista dinamica)
    private ArrayList<Moeda> listaMoedas = new ArrayList<>();
     
    //construtor vazio (ria cofrinho sem moedas)
    public Cofrinho() {}
     
    //metodo para obter lista de moedas
    public ArrayList<Moeda> getListaMoedas() {
        return listaMoedas;
    }

    //metodo para adicionar moeda (recebe objeto moeda como parametro)
    public void adicionar(Moeda m) {
        listaMoedas.add(m);
    }
     
    //metodo para remover moeda
    public boolean remover(int tipo, double valor) {
        
    	//percorre a lista de moedas
    	for (int i = 0; i < listaMoedas.size(); i++) {
            Moeda m = listaMoedas.get(i);
            
            //verifica se moeda corresponde ao tipo e valor
            if (tipo == 1 && m instanceof Real && m.getValor() == valor) {
                //remove moeda real
                listaMoedas.remove(i);
                return true;
            } else if (tipo == 2 && m instanceof Dolar && m.getValor() == valor) {
                //remove moeda dolar
                listaMoedas.remove(i);
                return true;
            } else if (tipo == 3 && m instanceof Euro && m.getValor() == valor) {
                //remove moeda euro
                listaMoedas.remove(i);
                return true;
            }
        }
        //se moeda nao encontrada
        return false;
    }
     
    //metodo para listar moedas
    public void listagemMoedas() {
        
    	//variaveis para acumular os totais
    	double somaReal = 0;
        double somaDolar = 0;
        double somaEuro = 0;
             
        //percorre todas as moedas
        for (Moeda m : listaMoedas) {
        	
        	//verifica tipo da moeda
            if (m instanceof Real) {
            	//acumula o valor de reais
            	somaReal += m.getValor();
            } 
            else if (m instanceof Dolar) {
                //acumula o valor de dolares
                somaDolar += m.getValor();
            }
            else if (m instanceof Euro) {
                //acumula o valor de euros
                somaEuro += m.getValor();
            }
        }
         
        //exibe totais formatados
        System.out.printf("Real - %.2f \n", somaReal);
        System.out.printf("Dolar - %.2f \n", somaDolar);
        System.out.printf("Euro - %.2f \n", somaEuro);
    }
     
    // metodo para calcular total convertido (converte todas as moedas para real)
    public double totalConvertido() {
        double total = 0;
        
        //percorre todas as moedas
        for (Moeda m : listaMoedas) {
            //chama o converter especifico de cada moeda
            total += m.converter();
        }
        return total;
    }
}
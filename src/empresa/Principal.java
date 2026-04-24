package empresa;

/*Rafael Viale da Silva 
RU: 5210410*/

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		//scanner para ler entrada do usuario
		Scanner teclado = new Scanner(System.in);
		
		//cria um novo cofrinho vazio
	    Cofrinho cofrinho = new Cofrinho(); 
	    
	    //inicializa com -1 para entrar no loop
	    int opcao = -1;
	        
	    //repete enquanto opcao diferente de zero
	    while (opcao != 0) {
	    	
	    	//mostra menu de opcoes
	    	System.out.println("\nCOFRINHO");
	        System.out.println("1-Adicionar Moeda");
	        System.out.println("2-Remover Moeda");
	        System.out.println("3-Listar Moedas");
	        System.out.println("4-Calcular Total convertido para Real");            
	        System.out.println("0-Encerrar Programa");
	        System.out.print("Escolha: ");
	        
	        //le opcao do usuario
	        opcao = teclado.nextInt();
	            
	        //executa acao conforme opcao escolhida
	        switch (opcao) {
	        	case 1:
	        		//chama metodo para adicionar moeda
	        		adicionarMoeda(teclado, cofrinho);
	                break;
	                    
	            case 2:
	                //chama metodo para remover moeda
	                removerMoeda(teclado, cofrinho);
	                break;
	                    
	            case 3:
	                //chama metodo para listar moedas
	                listarMoedas(cofrinho);
	                break;
	                    
	            case 4:
	                //chama metodo para calcular total
	                calcularTotal(cofrinho);
	                break;
	                    
	            case 0:
	                //encerra programa
	                System.out.println("Final do programa");
	                break;
	                    
	            default:
	                //opcao invalida
	                System.out.println("Opção inválida!");
	         	}
	    	}
	    
	    //fecha scanner
	    teclado.close();
	}
	    
	//metodo para adicionar moeda, recebe scanner e cofrinho como parametros
    private static void adicionarMoeda(Scanner teclado, Cofrinho cofrinho) {
        
    	//mostra tipos de moeda disponiveis
    	System.out.println("Escolha Moeda");
        System.out.println("1-Real");
        System.out.println("2-Dolar");
        System.out.println("3-Euro");
        
        //le tipo de moeda
        int tipo = teclado.nextInt();
        
        //le valor da moeda
        System.out.print("Digite o valor: ");
        double valor = teclado.nextDouble();
        
        //cria moeda conforme tipo escolhido
        Moeda moeda;
        switch (tipo) {
            case 1:
                // cria moeda real
                moeda = new Real(valor);
                break;
            case 2:
                //cria moeda dolar
                moeda = new Dolar(valor);
                break;
            case 3:
                //cria moeda euro
                moeda = new Euro(valor);
                break;
            default:
                //tipo invalido
                System.out.println("Tipo inválido!");
                return;
        }
        
        //adiciona moeda ao cofrinho
        cofrinho.adicionar(moeda);
        System.out.println("Moeda adicionada com sucesso!");
    }
    
    //metodo para remover moeda
    private static void removerMoeda(Scanner teclado, Cofrinho cofrinho) {
        
    	//mostra tipos de moeda
        System.out.println("Escolha Moeda");
        System.out.println("1-Real");
        System.out.println("2-Dolar");
        System.out.println("3-Euro");
        
        //le tipo de moeda
        int tipo = teclado.nextInt();
        
        //le valor da moeda
        System.out.print("Digite o valor: ");
        double valor = teclado.nextDouble();
        
        //usa metodo remover do cofrinho passando tipo e valor
        if (cofrinho.remover(tipo, valor)) {
            System.out.println("Moeda removida com sucesso!");
        } else {
            System.out.println("Moeda não encontrada!");
        }
    }
    
    //metodo para listar moedas (recebe cofrinho como parametro)
    private static void listarMoedas(Cofrinho cofrinho) {
        
        //chama metodo listagemMoedas do cofrinho e mostra soma dos valores por tipo
        cofrinho.listagemMoedas();
    }
    
    //metodo para calcular total convertido e recebe cofrinho como parametro
    private static void calcularTotal(Cofrinho cofrinho) {
        
    	//chama metodo totalConvertido do cofrinho e soma todas as moedas convertidas para real
        double total = cofrinho.totalConvertido();
        
        //mostra resultado formatado
        System.out.println("O total convertido para real é " + String.format("%.2f", total));
    }
}
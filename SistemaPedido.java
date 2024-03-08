package Pedido;
import java.util.Scanner;

public class SistemaPedido {
	
	public static void main(String[] args) {
		Pedido pedido = new Pedido();
		Pagamento pagamento = new Pagamento();
		Scanner ler = new Scanner(System.in);
		
		
		setCliente(ler, pedido);
		
		setClienteCPF(pedido, ler);
		
		setPedido(pedido,ler, null,null );
		
		Confirmacao(pedido, ler, pagamento);
		
		setValorPedido(pedido, pagamento, ler, args,ler);
		pedidoParaViagem (ler);
				
	}

	
	public static void setCliente(Scanner ler, Pedido pedido) {
		
		System.out.print("Qual o nome e sobrenome do Cliente? ");
        String nomeCompleto = ler.nextLine();

        // Remove espaços adicionais após o primeiro nome
        String[] partesNome = nomeCompleto.split("\\s+");
        String primeiroNome = partesNome[0].substring(0, 1).toUpperCase() + partesNome[0].substring(1).toLowerCase();
        pedido.setNomeCliente(primeiroNome);

        // Verifica se há sobrenome e o define
        if (partesNome.length > 1) {
            String sobrenome = partesNome[1].substring(0, 1).toUpperCase() + partesNome[1].substring(1).toLowerCase();
            pedido.setSobrenomeCliente(sobrenome);
        } else {
            pedido.setSobrenomeCliente(""); // Define como vazio se não houver sobrenome
        }

        pedido.setNomeCompleto(pedido.getNomeCliente() + " " + pedido.getSobrenomeCliente());
        
	}
	
	public static void setClienteCPF(Pedido pedido, Scanner ler) {
		
	//CPF na nota
    System.out.println("Cliente deseja incluir CPF na nota? (Digite 1 para sim e 2 para não) ");
    byte escolha = ler.nextByte();
    ler.nextLine();
    
    if(escolha == 1) {
    	
    	System.out.println("");
    	System.out.println("Digite o CPF...");
    	String cpf = ler.nextLine();
    	    	
    	 // Formatação do CPF
        String cpfFormatado = formatarCPF(cpf);
        pedido.setCpf(cpfFormatado);
        
    	}else if(escolha ==2) {
    }
  
}
		
	
	private static String formatarCPF(String cpf) {
		
        // Remove qualquer caractere não numérico
        cpf = cpf.replaceAll("[^0-9]", "");

        // Adiciona as pontuações
        return cpf.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
    }
	
	
	public static void setPedido(Pedido pedido, Scanner ler, String[] Pedido, String[] bebida) {
	    String[] Pedidos = {"Hamburguer", "Misto", "Sanduba"};

	    System.out.println("___________________________");
	    System.out.println("Digite o número referente ao produto que o cliente deseja. ");

	    for (int i = 0; i < 3; i++) {
	        System.out.println("[" + i + "]" + Pedidos[i]);
	    }
	    System.out.println(" ");
	    Byte escolha = ler.nextByte();

	    // Escolha do pedido e atribuição ao objeto pedido na variável nomePedido
	    if (escolha == 0) {
	        pedido.setNomePedido("Hamburguer");
	    } else if (escolha == 1) {
	        pedido.setNomePedido("Misto");
	    } else if (escolha == 2) {
	        pedido.setNomePedido("Sanduba");
	    } else {
	        System.err.println("Escolha inválida, reinicie o código.");
	        return;  // Sai do método se a escolha for inválida
	    }

	    // Cliente deseja bebida?
	    System.out.println("Cliente deseja bebida? Digite 1 para (Sim) e 2 para (Não)");
	    escolha = ler.nextByte();
	    ler.nextLine();  // Limpa o buffer do teclado

	    if (escolha == 1) {
	        // Caso escolha 1, informamos as bebidas e o cliente escolhe
	        String[] bebidas = {"Refrigerante", "Suco", "Refresco"};
	        System.out.println("___________________________");
	        for (int i = 0; i < 3; i++) {
	            System.out.println("[" + i + "]" + bebidas[i]);
	        }

	        // Escolha bebidas
	        System.out.println("Escolha a bebida referente ao número ao lado da mesma.");
	        escolha = ler.nextByte();
	        ler.nextLine();

	        if (escolha == 0) {
	            pedido.setNomeBebida("Refrigerante");
	        } else if (escolha == 1) {
	            pedido.setNomeBebida("Suco");
	        } else if (escolha == 2) {
	            pedido.setNomeBebida("Refresco");
	        } else {
	            System.err.println("Escolha inválida, reinicie o código.");
	            return;  // Sai do método se a escolha for inválida
	        }
	    } else if (escolha == 2) {
	          
	        System.out.println("Cliente não deseja bebida.");
	    } else {
	        System.err.println("Escolha inválida, reinicie o código.");
	        return;  // Sai do método se a escolha for inválida
	    }
	}

	
	public static void Confirmacao(Pedido pedido, Scanner ler, Pagamento pagamento) {
	    System.out.println("___________________________");
	    System.err.println("Atenção!");
	    System.out.println("Nome:" + pedido.getNomeCompleto());
	    System.out.println("CPF:" + pedido.getCpf());
	    System.out.println("Pedido:" + pedido.getNomePedido());
	    System.out.println("Bebidas:" + pedido.getNomeBebida());
	    System.out.println("Data e Hora da Ação: " + pagamento.getDataHoraAcao());
	    System.out.println("Pedido Confere? Digite 1 para (Sim) e 2 para (Não)");
	    byte pedidoValidar1 = ler.nextByte();

	    // Valida se o pedido está correto
	    if (pedidoValidar1 == 1) {
	        // Pedido correto, nada mais a fazer
	    } else if (pedidoValidar1 == 2) {
	        System.err.println("Atenção!");
	        System.out.println("Qual o erro? CPF[0], NOME[1] ou PEDIDO[2] ");
	        byte validador = ler.nextByte();
	        ler.nextLine();

	        // Validar se a opção é 0, 1 ou 2
	        while (validador < 0 || validador > 2) {
	            System.err.println("Opção inválida, escolha uma opção válida!");
	            System.out.println("Qual o erro? CPF[0], NOME[1] ou PEDIDO[2] ");
	            validador = ler.nextByte();
	            ler.nextLine();
	        }

	        // Corrigir a informação incorreta
	        if (validador == 0) {
	            setClienteCPF(pedido, ler);
	            System.out.println("Digite o CPF...");
	            pedido.setCpf(ler.nextLine());
	        } else if (validador == 1) {
	            setCliente(ler, pedido);
	        } else if (validador == 2) {
	            setPedido(pedido, ler, null, null);
	            System.out.println("Escolha a bebida referente ao número ao lado da mesma.");
	        }
	    } else {
	        System.err.println("Opção inválida, escolha uma opção válida!");
	        Confirmacao(pedido, ler, pagamento);
	    }
	}

	
	public static void setValorPedido(Pedido pedido, Pagamento pagamento, Scanner ler, String[] bebidas, Scanner ler1) {
	    System.out.println("_____________________________________________________");
	    System.err.print("     		    Subtotal     ");																	
	    System.out.println(" ");
	    
	    Double valorPedido,valorBebida ;
	    	    
	    if(pedido.getNomePedido().equals("Hamburguer")) {
	    	valorPedido = pagamento.getValorLanche()[0];
	    }else if(pedido.getNomePedido().equals("Misto")) {
	    	valorPedido = pagamento.getValorLanche()[1];
	    }else if(pedido.getNomePedido().equals("Sanduba")) {
	    	valorPedido = pagamento.getValorLanche()[2];
	    } else {
	    	System.err.println("ERRO!");
	    	System.err.println("ERRO!");
	    	System.err.println("ERRO!");
	    	System.err.println("ERRO!");
	    	System.err.println("Reinicie o Sistema");
	    	return;
	    }
	    
	    
	    // Verifica a escolga do cliente e atribui o valor da bebida a variavel valorBebida
	    if(pedido.getNomeBebida().equals("Refrigerante") ) {
	    	valorBebida = pagamento.getValorBebida()[0];
	    }else if(pedido.getNomeBebida().equals("Suco")) {
	    	valorBebida = pagamento.getValorBebida()[1];
	    }else if(pedido.getNomeBebida().equals("Refresco")) {
	    	valorBebida = pagamento.getValorBebida()[2];
	    } else {
	    	System.err.println("ERRO!");
	    	System.err.println("ERRO!");
	    	System.err.println("ERRO!");
	    	System.err.println("ERRO!");
	    	System.err.println("Reinicie o Sistema");
	    	return;
	    }
	    
	    
	    
	    
	    
	     System.out.println("      " + pedido.getNomeBebida()+" R$ " + valorBebida
	     				+	"   |   " + pedido.getNomePedido() + " R$ " + valorPedido
	    		 );
	     System.out.println("_________________________________________________________________");
	     System.err.print("Atenção!!\n");
	     System.out.println("Confirmar pedido digite (1) para cancelar Digite qualquer outra coisa: ");
	     Byte escolha1 = ler1.nextByte();
	     ler.nextLine();
	     
	     if(escolha1.equals(1)) {
	    	 System.out.println("Pedido encaminhado para preparação favor fique atento será informado nome e sobrenome no telão após produto estiver pronto.");
	     }else {
	    	 System.err.println("Reinicie o sistema");
	    	 return;
	     }
	     
	     
	     
	}
	
	public static void pedidoParaViagem(Scanner ler) {
	    System.out.println("O pedido é para viagem? (SIM ou NÃO)");
	    String confirmacao = ler.nextLine();

	    if (confirmacao.equalsIgnoreCase("SIM")) {
	        System.out.println("Pedido para viagem. Aguarde a preparação e retire no balcão.");
	    } else if (confirmacao.equalsIgnoreCase("NÃO")) {
	        System.out.println("Pedido para consumo no local.");
	    } else {
	        System.err.println("Opção inválida. Por favor, responda com SIM ou NÃO.");
	        pedidoParaViagem(ler);
	        // Adicione uma lógica para lidar com a entrada inválida se necessário
	    }
	}

}	

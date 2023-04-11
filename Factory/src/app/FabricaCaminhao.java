package app;

public class FabricaCaminhao implements FabricaTransporte {/* Define a classe FabricaCaminhao que implementa a interface FabricaTransporte */
	
	public Transporte criarTransporte() { /* Define método criarTransporte */
		
		return new Caminhao(); /* Retorna o objeto do tipo Transporte criado a partir da classe Caminhao */
		
	}

}

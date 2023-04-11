package app;

public class FabricaCaminhao implements FabricaTransporte {/* Define a classe FabricaCaminhao que implementa a interface FabricaTransporte */
	
	public Transporte criarTransporte() { /* Define m�todo criarTransporte */
		
		return new Caminhao(); /* Retorna o objeto do tipo Transporte criado a partir da classe Caminhao */
		
	}

}

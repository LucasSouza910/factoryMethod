package app;

public class FabricaNavio implements FabricaTransporte { /* Define a classe Navio e implemente a interface Transporte */
	
	public Transporte criarTransporte() { /* Define m�todo criarTransporte */
		
		return new Navio(); /* Retorna o objeto do tipo Transporte criado a partir da classe Caminhao */
		
	}

}

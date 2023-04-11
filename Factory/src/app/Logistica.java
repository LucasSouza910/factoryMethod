package app;

public class Logistica { /* Define a classe Logistico */
	
	public static void main(String[] args) { /* Cria��o do m�todo main */
		FabricaTransporte fabricaCaminhao = new FabricaCaminhao(); /* Cria��o do objeto FabricaTransporte instanciado como FabricaCaminhao */
		FabricaTransporte fabricaNavio = new FabricaNavio(); /* Cria��o do objeto FabricaTransporte instanciado como FabricaNavio */
		
		Transporte caminhao = fabricaCaminhao.criarTransporte(); /*Cria��o do objeto transporte para FabricaCaminhao  */
		caminhao.entregar(); /* Chamada do m�todo de entrega do caminhao */
		
		Transporte navio = fabricaNavio.criarTransporte(); /*Cria��o do objeto transporte para FabricaNavio */
		navio.entregar(); /* Chamada do m�todo de entrega do navio */
	}

}

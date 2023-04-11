package app;

public class Logistica { /* Define a classe Logistico */
	
	public static void main(String[] args) { /* Criação do método main */
		FabricaTransporte fabricaCaminhao = new FabricaCaminhao(); /* Criação do objeto FabricaTransporte instanciado como FabricaCaminhao */
		FabricaTransporte fabricaNavio = new FabricaNavio(); /* Criação do objeto FabricaTransporte instanciado como FabricaNavio */
		
		Transporte caminhao = fabricaCaminhao.criarTransporte(); /*Criação do objeto transporte para FabricaCaminhao  */
		caminhao.entregar(); /* Chamada do método de entrega do caminhao */
		
		Transporte navio = fabricaNavio.criarTransporte(); /*Criação do objeto transporte para FabricaNavio */
		navio.entregar(); /* Chamada do método de entrega do navio */
	}

}

/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
  *
  * É a nossa classe 'Sopa Original', protegida com o PP: 'Private Class Data'.
  *
  */

public class SopaOriginal {

	private DadosDaSopa ingredientes;
	
	public SopaOriginal(int numBatatas, int numCenouras, int numCarne, int numPimentas) {
		ingredientes = new DadosDaSopa(numBatatas, numCenouras, numCarne, numPimentas);
	}
	
	public void mistura() {
    System.out.println(" -----------------------------------------------------------------");
		System.out.println(String.format("🍲  Misturando os ingredientes da nossa sopa original temos:\n -> %d de batatas, %d cenouras, %d carne e %d de pimenta!",
				ingredientes.getNumBatatas(), ingredientes.getNumCenouras(), ingredientes.getNumCarne(), ingredientes.getNumPimentas()));
    System.out.println(" -----------------------------------------------------------------");
	}
}
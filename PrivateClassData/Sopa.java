/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
  *
  * É a nossa classe 'Mútavel' de Sopa.
  *
  */

public class Sopa  {
	
	private int numBatatas;
	private int numCenouras;
	private int numCarne;
	private int numPimentas;
	
	public Sopa(int numBatatas, int numCenouras, int numCarne, int numPimentas) {
		this.numBatatas = numBatatas;
		this.numCenouras = numCenouras;
		this.numCarne = numCarne;
		this.numPimentas = numPimentas;
	}
	
	public void mistura() {
    System.out.println(" -----------------------------------------------------------------");
		System.out.println(String.format("🍲  Misturando os ingredientes da nossa sopa temos:\n -> %d de batatas, %d cenouras, %d carne e %d de pimenta!",
				numBatatas, numCenouras, numCarne, numPimentas));
    System.out.println(" -----------------------------------------------------------------");
	}
	
	public void provar() {
    System.out.println(" -----------------------------------------------------------------");
		System.out.println("🥣  Provando nossa sopa...  👨‍🍳  ~ \"Delícia!\"");
    System.out.println(" -----------------------------------------------------------------");
		if (numBatatas > 0) { 
			numBatatas--; 
		}
		if (numCenouras > 0) { 
			numCenouras--; 
		}
		if (numCarne > 0) { 
			numCarne--; 
		}
		if (numPimentas > 0) { 
			numPimentas--; 
		}
	}
}


/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
  *
  * São os ingredientes que vão na nossa Sopa, ~ delícia! 😊.
  *
  */

public class DadosDaSopa {

	private int numBatatas;
	private int numCenouras;
	private int numCarne;
	private int numPimentas;
	
	public DadosDaSopa(int numBatatas, int numCenouras, int numCarne, int numPimentas) {
		this.numBatatas = numBatatas;
		this.numCenouras = numCenouras;
		this.numCarne = numCarne;
		this.numPimentas = numPimentas;
	}

	public int getNumBatatas() {
		return numBatatas;
	}

	public int getNumCenouras() {
		return numCenouras;
	}

	public int getNumCarne() {
		return numCarne;
	}

	public int getNumPimentas() {
		return numPimentas;
	}
}
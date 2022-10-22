/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
	*/

public abstract class Picape extends Carro {

	public int eixos_das_rodas;

	public Picape(int rodas, boolean diesel, int eixos) {
		super(rodas, diesel);
		this.eixos_das_rodas = eixos;
	}

	public abstract String getName();

}
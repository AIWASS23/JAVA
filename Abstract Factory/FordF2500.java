/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
	*/

public class FordF2500 extends Picape {

	int Numero_de_cavalos = 2500;

	public FordF2500(FactoryFord factoryFord, int wheel, boolean diesel, int axles) {
		super(wheel, diesel, axles);
	}

	@Override
	public String getName() {
		return this.getClass().getName();
	}

	@Override
	public String toString() {
		return "FordF2500 [Numero de cavalos = " + Numero_de_cavalos + ",  Numero de eixos = " + eixos_das_rodas + ", Rodas = " + num_Rodas + ", Vem com diesel = " + vem_com_diesel
				+ "]";
	}

}
/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
	*/

public class FordMustang extends Sedan {

	boolean GT = true;

	public FordMustang(FactoryFord factoryFord, int wheel, boolean diesel, boolean coupe, boolean GT) {
		super(wheel, diesel, coupe);
		this.GT = GT;
	}

	@Override
	public String getName() {
		return this.getClass().getName();
	}

	@Override
	public String toString() {
		return "FordMustang [É do tipo GT = " + GT + ", Tem coupe = " + tem_coupe + ", Rodas = " + num_Rodas + ", Vem com diesel = " + vem_com_diesel + "]";
	}

}
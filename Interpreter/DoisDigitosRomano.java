/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
	*/

public class DoisDigitosRomano extends NumeroRomanoInterpreter {

	@Override
	public String um() {
		return "X";

	}

	@Override
	public String quatro() {
		return "XL";

	}

	@Override
	public String cinco() {
		return "L";

	}

	@Override
	public String nove() {
		return "XC";

	}

	@Override
	public int multiplicador() {
		return 10;
    
	}

}
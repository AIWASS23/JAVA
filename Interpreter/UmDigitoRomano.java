/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
	*/

public class UmDigitoRomano extends NumeroRomanoInterpreter {

	@Override
	public String um() {
		return "I";

	}

	@Override
	public String quatro() {
		return "IV";

	}

	@Override
	public String cinco() {
		return "V";

	}

	@Override
	public String nove() {
		return "IX";

	}

	@Override
	public int multiplicador() {
		return 1;
    
	}

}
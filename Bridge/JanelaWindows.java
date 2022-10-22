/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
	*/

public class JanelaWindows implements JanelaImplementada {

	@Override
	public void desenharJanela(String titulo) {
		System.out.println(titulo + " - Janela Windows");
    
	}

	@Override
	public void desenharBotao(String titulo) {
		System.out.println(titulo + " - Botão Windows");

	}

}
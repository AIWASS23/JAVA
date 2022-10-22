/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
	*/

public class JanelaAviso extends JanelaAbstrata {

	public JanelaAviso(JanelaImplementada j) {
		super(j);

	}

	@Override
	public void desenhar() {
		desenharJanela("Janela de Aviso");
		desenharBotao("Ok");
    
	}

}
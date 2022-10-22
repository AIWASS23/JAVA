/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
	*/

public abstract class Colleague {
	protected Mediator mediator;

	public Colleague(Mediator m) {
		mediator = m;
	}

	public void enviarMensagem(String mensagem) {
		mediator.enviar(mensagem, this);
	}

	public abstract void receberMensagem(String mensagem);
}
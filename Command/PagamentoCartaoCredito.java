/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
	*/

public class PagamentoCartaoCredito implements PagamentoCommand {

	@Override
	public void processarCompra(Compra compra) {
		System.out.println("$ Compra emitida!\n" + compra.getInfoNota());

	}

}
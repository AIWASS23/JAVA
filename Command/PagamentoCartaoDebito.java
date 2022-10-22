/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
	*/

public class PagamentoCartaoDebito implements PagamentoCommand {

	@Override
	public void processarCompra(Compra compra) {
		System.out.println("$ Compra debitada!\n" + compra.getInfoNota());

	}

}
/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
	*/

public class PagamentoBoleto implements PagamentoCommand {

	@Override
	public void processarCompra(Compra compra) {
		System.out.println("📝 $ Boleto criado!\n" + compra.getInfoNota());

	}

}
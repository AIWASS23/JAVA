/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
  *
  */

public class BancoB extends BancoChain {

	public BancoB() {
		super(IDBancos.bancoB);
	}

	@Override
	protected void efetuaPagamento() {
		System.out.println("💰✔️  Pagamento efetuado no: 🏦  Banco B");
	}

}
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

public class BancoC extends BancoChain {

	public BancoC() {
		super(IDBancos.bancoC);
	}

	@Override
	protected void efetuaPagamento() {
		System.out.println("💰✔️  Pagamento efetuado no: 🏦  Banco C");
	}

}
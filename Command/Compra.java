/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
	*/

//Classe da nossa compra efetuada com as características básicas que queremos que sejam exibidas como o nome da loja onde foi feita a compr, seu valor total e id
public class Compra {

	private static int CONTADOR_ID;//incremeta a cada nova compra feita de determinada classe (Débito, crédito ou boleto (incrmenta o valor do id para sabermos em qual ordem está determinada compra)
	protected int idNotaFiscal;
	protected String nomeDaLoja;
	protected double valorTotal;

	public Compra(String nomeDaLoja) {
		this.nomeDaLoja = nomeDaLoja;
		idNotaFiscal = ++CONTADOR_ID;

	}

	public void setValor(double valor) {
		this.valorTotal = valor;

	}

	public String getInfoNota() {
		return new String(">> Nota fiscal nº: " + idNotaFiscal + "\nLoja: " + nomeDaLoja + "\nValor: " + valorTotal);
	}

}
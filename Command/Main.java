/**********************************************************************************************
  * *Comentários: "Command"
  *********************************************************************************************
  * *Obs. Mais um exemplo simples que apresento, um pouco grande, mas é para ficar organizado e de fácil entendimento. Aqui mostro os resultados da interação que temos entre as classes Loja e Compra através das classes Pagamento que temos, todas gerenciadas pela classe que implementa nosso PP: "PagamentoCommand.java". Um sistema de pagamentos em lojas é umbomexemplo de aplicação para esse padrão Command afinal tal PP permite que você encapsule ações(Compras e como nforam efetuadas/pagas) em objetos(Loja), provendo os meios necessários de "desacoplar" o "cliente" do seu "receptor".
  *********************************************************************************************
  * * ("Command") - Segundo a definição da Wikipédia: 
  * Na programação orientada a objeto, o padrão Command é um padrão de projeto comportamental no qual um objeto é usado para encapsular toda informação necessária para executar uma ação ou ativar um evento em um momento posterior. Esta informação inclui o nome do método, o objeto que possui o método e os valores para os parâmetros do método.
  *********************************************************************************************
	*/

public class Main {

	public static void main(String[] args) {

    System.out.println(" ");
    System.out.println("---------------------------------------------------------------");
    System.out.println("Command ");
    System.out.println("---------------------------------------------------------------");
    System.out.println(" ");

    //
		Loja lojasAmericanas = new Loja("Americanas");
    System.out.println("--------------------");
		lojasAmericanas.executarCompra(999.00, new PagamentoCartaoCredito());
    System.out.println("--------------------");
		lojasAmericanas.executarCompra(49.00, new PagamentoBoleto());
    System.out.println("--------------------");
		lojasAmericanas.executarCompra(99.00, new PagamentoCartaoDebito());
    System.out.println("--------------------");

		Loja MagazineLuiza = new Loja("Magazine Luíza");
		MagazineLuiza.executarCompra(19.00, new PagamentoCartaoCredito());
    System.out.println("--------------------");

	}

}
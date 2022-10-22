/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
	*/

// Nossa classe que implementa o PP - Command:
public interface PagamentoCommand {

	void processarCompra(Compra compra); // Bem simples, mas afinal, para nosso exemplo de demonstração apenas temos de processar o tipo de compra e os dados que vem nela...

}
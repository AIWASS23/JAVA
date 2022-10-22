/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
	*/

// Classe "padrão" para as outras que deriam de objetos do tipo "imagem"
public interface ImagemTarget {

	void carregarImagem(String nomeDoArquivo);

	void desenharImagem(int posX, int posY, int largura, int altura);

}
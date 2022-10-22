/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
	*/

//Adapter da Classe representante da API "SDL". Aqui se faz a adaptação para essa classe de um objeto que queira receber os métodos e atributos dela sendo de outra classe diferente em alguns aspectos
public class SDLImagemAdapter extends SDL_Surface implements ImagemTarget {

	@Override
	public void carregarImagem(String nomeDoArquivo) {

		SDL_CarregarSurface(nomeDoArquivo);

	}

	@Override
	public void desenharImagem(int posX, int posY, int largura, int altura) {

		SDL_DesenharSurface(largura, altura, posX, posY);

	}

}
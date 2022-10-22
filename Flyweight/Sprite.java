/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
	*/

// O Flyweight concreto
public class Sprite extends SpriteFlyweight {
	protected Imagem imagem;

	public Sprite(String nomeDaImagem) {
		imagem = new Imagem(nomeDaImagem);

	}

	@Override
	public void desenharImagem(Ponto ponto) {
		imagem.desenharImagem();
		System.out.println("No ponto (" + ponto.x + "," + ponto.y + ")!");

	}
  
}
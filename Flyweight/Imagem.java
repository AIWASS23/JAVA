/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
	*/

//Estado extrínseco
public class Imagem {
	protected String nomeDaImagem;

	public Imagem(String imagem) {
		nomeDaImagem = imagem;

	}

	public void desenharImagem() {
		System.out.println(nomeDaImagem + " desenhada!");
    
	}

}
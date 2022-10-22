/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
	*/

//Classe exemplo, aqui representando uma famosa API de computação gráfica
public class SDL_Surface {

	public void SDL_CarregarSurface(String arquivo) {

		System.out.println("Imagem " + arquivo + " carregada.");

	}

	public void SDL_DesenharSurface(int largura, int altura, int posicaoX, int posicaoY) {

    System.out.println(" ________________________");
    System.out.println("|.----------------------.|");
    System.out.println("||                      ||");
    System.out.println("||       ______         ||");
    System.out.println("||     .;;;;;;;;.       ||");
    System.out.println("||    /;;;;;;;;;;;\\     ||");
    System.out.println("||   /;/`    `-;;;;; . .||");
    System.out.println("||   |;|__  __  \\;;;|   ||");
    System.out.println("||.-.|;| e`/e`  |;;;|   ||");
    System.out.println("||   |;|  |     |;;;|'--||");
    System.out.println("||   |;|  '-    |;;;|   ||");
    System.out.println("||   |;;\\ --'  /|;;;|   ||");
    System.out.println("||   |;;;;;---'\\|;;;|   ||");
    System.out.println("||   |;;;;|     |;;;|   ||");
    System.out.println("||   |;;.-'     |;;;|   ||");
    System.out.println("||'--|/`        |;;;|--.||");
    System.out.println("||;;;;    .     ;;;;.\\;;||");
    System.out.println("||;;;;;-.;_    /.-;;;;;;||");
    System.out.println("||;;;;;;;;;;;;;;;;;;;;;;||");
    System.out.println("||jgs;;;;;;;;;;;;;;;;;;;||");
    System.out.println("'------------------------'");
		System.out.println("Imagem no \"SDL_Surface\" - desenhada");

	}

}
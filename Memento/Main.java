/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
  * *Comentários: Código implementando o PP do tipo "Memento"
  *********************************************************************************************
  * *Obs. Esse PP é sobre a ideia de 'capturar e armazenar o estado atual de um objeto' de uma 
  forma que isso possa ser restaurado futuramente de forma tranquila. Aqui fazemos isso usando
  de um simples exemplo com 'linhas de texto', onde criamos elas e as printamos em sequencias
  diferentes baseado no modo que nossa classe 'TextoMemento.java' vai guardando. (Ps. gosto de 
  associar o nome 'memento' com livros 😊, por isso usei de textos, e memento é exatamente o
   termo 'lembrar' em Latim o que combina perfeitamente como o nome desse padrão!)
  *********************************************************************************************
  * * (Definindo o PP - "Memento") - Segundo a definição da Wikipédia: 
  * O pattern Memento é um design pattern que proporciona a habilidade de restaurar um objeto 
  a seu estado anterior (desfazer por meio de reversão).
  *********************************************************************************************
	*/

class Main {

	public static void main(String[] args) {

    System.out.println(" ");
    System.out.println("---------------------------------------------------------------");
    System.out.println("IFCE - Prof.Ronaldo Ramos 🎷 - PP - Mediator ");
    System.out.println("---------------------------------------------------------------");
    System.out.println(" ");

		Texto texto = new Texto();

		texto.escreverTexto("📝 Primeira linha do texto\n");
		texto.escreverTexto("📝 Segunda linha do texto\n");
		texto.escreverTexto("📝 Terceira linha do texto\n");

		texto.mostrarTexto();
		texto.desfazerEscrita();

		texto.mostrarTexto();
		texto.desfazerEscrita();

		texto.mostrarTexto();
		texto.desfazerEscrita();

		texto.mostrarTexto();
		texto.desfazerEscrita();

		texto.mostrarTexto();

	}

}
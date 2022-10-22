/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
  * *Comentários: Código implementando o PP do tipo "Template"
  *********************************************************************************************
  * *Obs. Esse PP (Também referenciado como "Template Method") define o esqueleto de como um algoritmo pode ser executado, mas deixa a implementação destes "passos", por assim dizer, para as classes que chamaremos de "filhas". No caso aqui a classe "Pai" do qual terá o papél de designar o esqueleto de funcionamento do código é a nossa classe "OrdenadorTemplate.java" com suas muitas "Filhas" que herdam dela. Aqui o exemplo escolhido para trabalhar tal PP foi um sistema de "Armazenar" músicas num classe Playlist dentro de uma classe que seria um modelo de sistema de um MP3 e como tais músicas na playlist são reproduzidas, baseado em uma ordem específica (que vai ser estruturada pelo nosso PP Template e sua implementação aqui).
  *********************************************************************************************
  * * (Definindo o PP - "Template") - Segundo a definição da Wikipédia: 
  * Na engenharia de software, o padrão template method é um padrão de projeto comportamental que define o esqueleto de programa de um algoritmo em operação, delegando alguns passos para as subclasses. Ele permite que seja possível redefinir alguns passos do algoritmo sem mudar a estrutura do mesmo.
  *********************************************************************************************
	*/

class Main {

  public static void main(String[] args) {

    System.out.println(" ");
    System.out.println("---------------------------------------------------------------");
    System.out.println("IFCE - Prof.Ronaldo Ramos 🎷 - PP - Template ");
    System.out.println("---------------------------------------------------------------");
    System.out.println(" ");

    PlayList minhaPlayList = new PlayList(ModoDeReproducao.porNome);
		minhaPlayList.adicionarMusica("Everlong", "Foo Fighters", "1997", 5);
		minhaPlayList.adicionarMusica("Song 2", "Blur", "1997", 4);
		minhaPlayList.adicionarMusica("American Jesus", "Bad Religion", "1993",
				3);
		minhaPlayList.adicionarMusica("No Cigar", "Milencollin", "2001", 2);
		minhaPlayList.adicionarMusica("Ten", "Pearl Jam", "1991", 1);

		System.out.println("=== Lista por Nome de Musica ===");
		minhaPlayList.mostrarListaDeReproducao();

		System.out.println("\n=== Lista por Autor ===");
		minhaPlayList.setModoDeReproducao(ModoDeReproducao.porAutor);
		minhaPlayList.mostrarListaDeReproducao();

		System.out.println("\n=== Lista por Ano ===");
		minhaPlayList.setModoDeReproducao(ModoDeReproducao.porAno);
		minhaPlayList.mostrarListaDeReproducao();

		System.out.println("\n=== Lista por Estrela ===");
		minhaPlayList.setModoDeReproducao(ModoDeReproducao.porEstrela);
		minhaPlayList.mostrarListaDeReproducao();

  }

}
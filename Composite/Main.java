
  /* *Comentários:  "Composite"
  *********************************************************************************************
  * *Obs. Esse Programa deixa o cliente tratar objetos individuais de maneira uniforme. Aqui, esse 'objetos'
  tomam forma nas classes 'Arquivos' onde a classe 'ArquivoComposite.java' é quem trata dessa 'uniformidade'
  entre tais objetos individualmente.
  *********************************************************************************************
  * * ("Composite") - Segundo a definição da Wikipédia: 
  * Em engenharia de software, o Composite Patter é um design pattern de particionamento. O Composite Pattern descreve que um grupo de objetos deverá ser tratado da mesma maneira que apenas uma instancia de um objeto. A intensão de um Composite é "compor" objetos em estrutura de arvore representando parte de uma hierarquia. Implementar o Composite Patter é permitir que clientes tratem objetos individuais e composições de maneira uniforme.
  *********************************************************************************************
	*/

class Main {
  public static void main(String[] args) {

    System.out.println(" ");
    System.out.println("---------------------------------------------------------------");
    System.out.println(" Composite ");
    System.out.println("---------------------------------------------------------------");
    System.out.println(" ");

    // O cliente precisa conhecer a implementação das classes concretas,
		// pois a interface de um ArquivoVideo é diferente de um
		// ArquivoComposite
		ArquivoComponent meuVideo = new ArquivoVideo("meu video.rmvb");
		ArquivoComponent meuOutroVideo = new ArquivoVideo("novo video.rmvb");
		// No entanto previne que o usuário possa fazer esse tipo de chamada:
		// meuVideo.adicionar(meuOutroVideo);

		ArquivoComponent minhaPasta = new ArquivoComposite("minha pasta/");

		// Para utilizar os métodos específicos de um composite é necessário
		// realizar um cast. Mas é preciso ter certeza que o objeto pode ser
		// convertido, caso contrário uma exceção será disparada
		((ArquivoComposite) minhaPasta).adicionar(meuVideo);
		((ArquivoComposite) minhaPasta).adicionar(meuOutroVideo);
		minhaPasta.printNomeDoArquivo();

  }
}
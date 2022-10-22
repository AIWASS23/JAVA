/**********************************************************************************************
  * *Comentários: "Adapter"
  *********************************************************************************************
  * *Obs. Exemplo simples que mostra uma situação real para um uso do PP do tipo Adapter, afinal, como o padrão Adapter permite que você envolva um objeto incompatível em um "adaptador" para torná-lo compatível com outra classe foi escolhido aqui associar tal descrição a classes de "API's livres utilizadas na computação gráfica e suas áreas": OpenGl e SDL. Temos nossa classe "alvo" que é "ImagemTarget.java" que é a classe de um objeto que representaria um arquivo gráfico em geral e duas API's diferentes com seus próprios arquivos, aqui, as classes Adapters de cada uma delas ("OpenGLImageAdapter.java" e "SDLImagemAdapter.java") torna possível esse  compatibilidade com outra classe.
  *********************************************************************************************
  * * ("Adapter") - Segundo a definição da Wikipédia: 
  * Na engenharia de software, o padrão do Adapter é um padrão de design de software que permite que a interface de uma classe existente seja usada como outra interface. É freqüentemente usado para fazer com que as classes existentes trabalhem com outras sem modificar seu código-fonte.
  **********************************************************************************************/

public class Main {

	public static void main(String[] args) {

    System.out.println(" ");
    System.out.println("---------------------------------------------------------------");
    System.out.println(" Adapter ");
    System.out.println("---------------------------------------------------------------");
    System.out.println(" ");

    //Aqui carregamos nosso objeto do tipo ImagemTarget para o formato atendido por nossa classe SDL.
		ImagemTarget imagem = new SDLImagemAdapter();
    System.out.println("-----(Saída - Adapter - Image no SDL)--------------------------");
		imagem.carregarImagem("teste.png");
		imagem.desenharImagem(0, 0, 10, 10);// infelizmente aqui

    System.out.println(" ");

    //Agora, carregamos nosso objeto do tipo ImagemTarget no formato SDL para o formato atendido por nossa outra classe OpenGL e vemos se os métodos de tal classe são executados corretamente após a adaptação dos tipos da classe (SDL -> OpenGL).
		imagem = new OpenGLImageAdapter();
    System.out.println("-----(Saída - Adapter - Image no OpenGL)-----------------------");
		imagem.carregarImagem("teste.png");
		imagem.desenharImagem(0, 0, 10, 10);
    System.out.println("---------------------------------------------------------------");

	}

}
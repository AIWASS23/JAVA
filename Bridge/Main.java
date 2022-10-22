/**********************************************************************************************
  * *Comentários: "Bridge"
  *********************************************************************************************
  * *Obs. Esse PP é de forma "simples" sobre preferir a "composição sobre herança". Detalhes de implementação são empurrados de uma hierarquia, para outro objeto com uma hierarquia separada. Aqui isso pode ser visto no código implementado usando de múltiplas classe que implementam "Janelas" de GUI's, algumas saõ genéricas (Como as Janelas de: Aviso, Dialogo) e herdam de uma hierarquia que vem da classe "JanelaAbstrata.java", enquanto outras tem suas próprias especificações (Como as: Linux e Windows.) Que HERDAM da hierarquia da classe "JanelaImplementada.java". Aqui, não existe,uma classe que usamos parafa fazer o método "Bridge", como já foi visto em outros códigos de PP's que mostrei anteriormente, aqui o método está nessa preferência pela "composição sobre herança".
  *********************************************************************************************
  * * (Definindo o PP - "Bridge") - Segundo a definição da Wikipédia: 
  * O bridge é um padrão de projeto usado na engenharia de software que destina-se a "desacoplar uma abstração de sua implementação para que os dois possam variar independentemente".
  *********************************************************************************************
	*/

class Main {

  public static void main(String[] args) {

    System.out.println(" ");
    System.out.println("---------------------------------------------------------------");
    System.out.println(" Bridge ");
    System.out.println("---------------------------------------------------------------");
    System.out.println(" ");

		JanelaAbstrata janela = new JanelaDialogo(new JanelaLinux());
		janela.desenhar();
		janela = new JanelaAviso(new JanelaLinux());
		janela.desenhar();

		janela = new JanelaDialogo(new JanelaWindows());
		janela.desenhar();
    
	}

}
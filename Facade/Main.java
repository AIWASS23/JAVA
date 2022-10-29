/**********************************************************************************************
  * *Comentários: Código implementando o PP do tipo "Facade"
  *********************************************************************************************
  * *Obs. Já que esse PP provê uma interface simples para um "subsistema complexo" decidiu-se implementar um código que trabalhe com uma representação "mais simplificada" de um sistema que agrega uma série de outros sistemas em seu funcionamento (como é comum de se ver em classe do tipo "Library"), temos várias classes que represetam aqui sistemas dos mais diversos tipos e funções (escolhi coisas simples e do cotidiano que fossem "fáceis" de perceber a atuação desse PP neles) e uma classe ("SistemasFacade.java") que proporciona uma "inerface de código" mais organizada e simples ao desenvolvedor que for trabalhar nas interações e oganizações de tais classes. 
  *********************************************************************************************
  * * (Definindo o PP - "Facade") - Segundo a definição da Wikipédia: 
  * Uma Facade é um objeto que provê uma interface simples para uma grande porção de código como uma Class Library.
  **********************************************************************************************/

public class Main {

	public static void main(String[] args) {

    System.out.println(" ");
    System.out.println("---------------------------------------------------------------");
    System.out.println(" Facade ");
    System.out.println("---------------------------------------------------------------");
    System.out.println(" ");

    System.out.println("     _________                 ");
    System.out.println("    / ======= \\                ");
    System.out.println("   / __________\\               ");
    System.out.println("  | ___________ |              ");
    System.out.println("  | | -       | |              ");
    System.out.println("  | |         | |              ");
    System.out.println("  | |_________| |____________  ");
    System.out.println("  \\=____________/            ) ");
    System.out.println("  / \"\"\"\"\"\"\"\"\"\"\" \\           /  ");
    System.out.println(" / ::::::::::::: \\       =D-'        ");
    System.out.println("(_________________)                   ");
    System.out.println(" ");

		System.out.println(">--------[ Façade - Configurando subsistemas ]:");
    System.out.println(" ");
		SistemasFacade fachada = new SistemasFacade();
		fachada.inicializarSubsistemas();
    System.out.println(" ");
    System.out.println("||||||||||||||||| - 100%");
    System.out.println(" ");

		System.out.println(">--------[  Facade - Utilizando subsistemas ]:");
    System.out.println(" ");
		fachada.renderizarImagem("imagem.png");
		fachada.reproduzirAudio("teste.mp3");
		fachada.lerInput();
    System.out.println("///<");
    
	}

}
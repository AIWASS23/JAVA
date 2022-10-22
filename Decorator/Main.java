/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
  * *Comentários: Código implementando o PP do tipo "Decorator"
  *********************************************************************************************
  * *Obs. Mais um exemplo simples que escohi no intuito de "mostrar" a característica básica desse padrão que nada mais é do que permitir que se altere o comportamento de um objeto em tempo de execução (envolvendo este por um objeto de uma classe "Decorator" que aqui representei pelo pela classe "CoquetelDecorator.java" que "envolve" nosso objeto principal "Coquetel.java")! Por isso escolhi esse tema de "Coqueteis" afinal nada melhor para demonstrar esse ato de "adicionar" métodos/ações/comportamentos a um objeto do que usar do termo "coquetel" que é o ato de ir adicionando diversos drinks e suas características em um só novo "drink", aqui nós fazemos o mesmo só quem sem um "bartender" e sim nossa classe Decorator ;)
  *********************************************************************************************
  * * (Definindo o PP - "Decorator") - Segundo a definição da Wikipédia: 
  * Em programação orientada a objeto, o Decorator Pattern permite que se adicione comportamentos para um objeto, tanto de maneira estatica quanto dinâmica, sem afetar o comportamento de outros objetos da mesma classe. O Decorator Pattern é muito útil para ser aderente ao principio de responsabilidade única, uma vez que ele permite que funcionalidades sejam divididas entre classes que compartilhe uma única preocupação.
  *********************************************************************************************
	*/

public class Main {

	public static void main(String[] args) {

    System.out.println("    _                        ");
    System.out.println("   {_}                       ");
    System.out.println("   |(|                       ");
    System.out.println("   |=|                       ");
    System.out.println("  /   \\                      ");
    System.out.println("  |.--|                      ");
    System.out.println("  ||  |                      ");
    System.out.println("  ||  |    .    ' .          ");
    System.out.println("  |'--|  '     \\~~~/         ");
    System.out.println("  '-=-' \\~~~/   \\_/          ");
    System.out.println("         \\_/     Y           ");
    System.out.println("          Y     _|_          ");
    System.out.println("  jgs    _|_            ~ Bar \"Decorator Coquetéis\" kkkk    ");

    System.out.println("---------------------------------------------------------------");
    System.out.println("IFCE - Prof.Ronaldo Ramos 🎷 - PP - Decorator (Exemplo - simples) ");
    System.out.println("---------------------------------------------------------------");
    System.out.println(" ");

    System.out.println("---(Teste - Antes do uso do Decorator)-------------------------");
    //Crio nosso primerio objeto do tipo "coquetel" com as características instanciadas na classe que extende a de "Coquetel.java" chamada "Cachaca.java" kkk
		Coquetel meuCoquetel = new Cachaca();
    System.out.println("Bebida de entrada:");
		System.out.println(meuCoquetel.getNome() + " = " + meuCoquetel.getPreco());
    System.out.println("---------------------------------------------------------------");
    System.out.println(" ");

    System.out.println("---(Teste - Após o uso do Decorator)---------------------------");
    //Depois crio nosso "coquetel" ao misturar nosso objeto do tipo "Refrigerante.java" a nossa classe do tipo "cachaca.java", como "Refrigerante.java" irá se "juntar" a classe "cachaca.java" ele herda as características de um objeto do tipo "CoquetelDecorator.java" exatamente porque vai "envolver" nosso primerio objeto instanciado anteriormente e suas características
		meuCoquetel = new Refrigerante(meuCoquetel);//Decorator junta ao meuCoquetel as características e atributos da classe "Refrigerante.java"
    System.out.println("Coquetel:");
		System.out.println(meuCoquetel.getNome() + " = " + meuCoquetel.getPreco());//aqui temos a prova dessa natureza que o PP "Decorator" tem de "adicionar comportamentos"! Note que ao printarmos os atributos de meuCoquetel temos agora dois nomes e a soma dos preços como resultado.
    System.out.println("---------------------------------------------------------------");

	}

}
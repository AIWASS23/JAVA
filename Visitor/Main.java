/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
  * *Comentários: Código implementando o PP do tipo "Visitor"
  *********************************************************************************************
  * *Obs. Esse 'PP' permite que você adicione operações adicionais a objetos sem ter que modificá-los. Aqui, fazemos isso para diversas ramificações de 'árvores binárias'.
  *********************************************************************************************
  * * (Definindo o PP - "Visitor") - Segundo a definição da Wikipédia: 
  * Na programação orientada a objetos e engenharia de software, o padrão de design visitor é uma maneira de separar um algoritmo da estrutura de um objeto no qual ele opera. Um resultado prático dessa separação é a habilidade de adicionar novas operações a objetos existentes sem ter que modificar suas estruturas. É uma maneira de seguir o princípio de aberto/fechado.
  *********************************************************************************************
	*/

class Main {

	public static void main(String[] args) {

    System.out.println(" ");
    System.out.println("---------------------------------------------------------------");
    System.out.println("IFCE - Prof.Ronaldo Ramos 🎷 - PP - Visitor ");
    System.out.println("---------------------------------------------------------------");
    System.out.println(" ");

		ArvoreBinaria arvore = new ArvoreBinaria(7);

		arvore.inserir(15);
		arvore.inserir(10);
		arvore.inserir(5);
		arvore.inserir(2);
		arvore.inserir(1);
		arvore.inserir(20);

		System.out.println("🌳  Exibindo Árvore: Em Ordem >>>");
    System.out.println("///////////////////////////////////////:");
		arvore.aceitarVisitante(new ExibirInOrderVisitor());
    System.out.println(" ");
		System.out.println("🌳  Exibindo Árvore: Pré Ordem >>>");
    System.out.println("///////////////////////////////////////:");
		arvore.aceitarVisitante(new ExibirPreOrdemVisitor());
    System.out.println(" ");
		System.out.println("🌳  Exibindo Árvore: Pós Ordem >>>");
    System.out.println("///////////////////////////////////////:");
		arvore.aceitarVisitante(new ExibirPostOrderVisitor());
    System.out.println(" ");
		System.out.println("🌳  Exibindo Árvore: Identado >>>");
    System.out.println("///////////////////////////////////////:");
		arvore.aceitarVisitante(new ExibirIndentadoVisitor());
    System.out.println(" ");

	}

}
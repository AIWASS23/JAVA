/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
  * *Comentários: Código implementando o PP do tipo "Iterator"
  *********************************************************************************************
  * *Obs. Esse PP apresenta uma maneira de 'acessar os elementos' de um objeto sem expor a toda a estrutura, achei interessante abordar nessa estratégia a imaginando como um 'controle remoto'
  de uma TV, e as classe como canais específicos onde podemos 'acessar' sem necessariamente 
  querer ver 'tudo' que o canal dispõe ao longo do dia por exemplo.
  *********************************************************************************************
  * * (Definindo o PP - "Iterator") - Segundo a definição da Wikipédia: 
  * Na programação orientada a objetos, um iterador se refere tanto ao objeto que permite ao programador percorrer um container, (uma coleção de elementos) particularmente listas,quanto ao design pattern Iterator, no qual um iterador é usado para percorrer um container e acessar seus elementos. O padrão Iterator desacopla os algoritmos dos recipientes, porém em alguns casos, os algoritmos são necessariamente específicos dos containers e, portanto, não podem ser desacoplados.
  *********************************************************************************************
	*/

class Main {

  public static void main(String[] args) {

    System.out.println(" ");
    System.out.println("---------------------------------------------------------------");
    System.out.println("IFCE - Prof.Ronaldo Ramos 🎷 - PP - Iterator ");
    System.out.println("---------------------------------------------------------------");
    System.out.println(" ");

    CanaisEsportes meusCanais = new CanaisEsportes();
		System.out.println("Iterando com for:");

		for (IteradorCanais it = meusCanais.criarIterator(); !it.isDone(); it
				.proximoCanal()) {
			System.out.println(it.getNomeCanal());

		}

		System.out.println("\nIterando manualmente:");
		IteradorCanais it = meusCanais.criarIterator();
		System.out.println(it.getNomeCanal());
		it.proximoCanal();
		System.out.println(it.getNomeCanal());
		it.proximoCanal();
		System.out.println(it.getNomeCanal());
		it.proximoCanal();
		System.out.println(it.getNomeCanal());
		it.proximoCanal();
		System.out.println(it.getNomeCanal());

		System.out.println("\nIterando fora dos limites:");
		it.proximoCanal();
		System.out.println(it.getNomeCanal());
		it.first();
		it.voltarCanal();
		System.out.println(it.getNomeCanal());

  }

}
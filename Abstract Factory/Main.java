/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
  * *Comentários: Código implementando o PP do tipo "Abstract Factory"
  *********************************************************************************************
  * *Obs. Não pus tantos comentários dessa vez porque acho que o código está bem organizado
  *  e fácil de entender o que faz, até porque como havia dito é uma estrutura simples que constrói carros dos tipos Sedan ou Truck(Picape) em modelos ou da Ford ou da Dodge com especificações dadas pelo usuário.
  *********************************************************************************************
  * * (Definindo o PP - "Factory") - Segundo a definição da Wikipédia: 
  * O Abstract Factory Pattern provê uma maneira de encapsular um grupo de Factories que tem um tema em comum sem especificar suas classes concretas.
  *********************************************************************************************
	*/

public class Main {

	public static void main(String[] args) {
		
		// Fez-se a implementação parecida como o passo-a-passo do site: https://www.tutorialspoint.com/design_pattern/abstract_factory_pattern.htm

    //Abaixo criamos 2 classes abstratas e encapsuladas de exemplo das marcas que estabelecemos (Um Dodge e um Ford):
		AbstractFactory factoryDodge = FactoryProvider.getFactory("DODGE");
		AbstractFactory factoryFord = FactoryProvider.getFactory("FORD");

    // Criando 4 tipos de modelos diferentes de carros com as especificações que solicitei:
		Sedan makeSedan1 = factoryDodge.makeSedan(4, false, false);
		Picape makeTruck1 = factoryDodge.makeTruck(8, true, 3);

		Sedan makeSedan2 = factoryFord.makeSedan(4, false, true);
		Picape makeTruck2 = factoryFord.makeTruck(6, false, 2);

    System.out.println(" ");
    System.out.println("---------------------------------------------------------------");
    System.out.println("IFCE - Prof.Ronaldo Ramos 🎷 - PP - Abstract Factory (Exemplo) ");
    System.out.println("---------------------------------------------------------------");
    System.out.println(" ");
    System.out.println("Criando modelos de carros e suas especificações...\n");

    // Esses "prints" bonitinhos dos carrinhos em ascii poderiam ficar mais "compactos" dentro das funções nas classes mas devido ao tempo e outras complicações vou deixar aqui desse jeito mesmo kkkk.
    
    System.out.println("  ______          ");
    System.out.println(" /|_||_\\`.__      ");
    System.out.println("(   _    _ _\\     ");
    System.out.println("=`-(_)--(_)-'    *Carro criado!");
    System.out.println("+--(Informações do modelo)-------------------------------------------------+");
		System.out.println(makeSedan1.getName() + " : " + makeSedan1);
    System.out.println("+--------------------------------------------------------------------------+\n");

    System.out.println("  ______          ");
    System.out.println(" /|_||_\\`.__      ");
    System.out.println("(   _    _ _\\     ");
    System.out.println("=`-(_)--(_)-'    *Carro criado!");
    System.out.println("+--(Informações do modelo)-------------------------------------------------+");
		System.out.println(makeTruck1.getName() + " : " + makeTruck1);
    System.out.println("+--------------------------------------------------------------------------+\n");

    System.out.println("  ______          ");
    System.out.println(" /|_||_\\`.__      ");
    System.out.println("(   _    _ _\\     ");
    System.out.println("=`-(_)--(_)-'    *Carro criado!");
    System.out.println("+--(Informações do modelo)-------------------------------------------------+");
		System.out.println(makeSedan2.getName() + " : " + makeSedan2);
    System.out.println("+--------------------------------------------------------------------------+\n");

    System.out.println("  ______          ");
    System.out.println(" /|_||_\\`.__      ");
    System.out.println("(   _    _ _\\     ");
    System.out.println("=`-(_)--(_)-'    *Carro criado!");
    System.out.println("+--(Informações do modelo)-------------------------------------------------+");
		System.out.println(makeTruck2.getName() + " : " + makeTruck2);
    System.out.println("+--------------------------------------------------------------------------+\n");

	}

}
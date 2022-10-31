  /*********************************************************************************************
  * "Prototype"
  *********************************************************************************************
  * *Obs. Não pus tantos comentários dessa vez porque acho que o código está bem organizado
  *  e fácil de entender o que ele faz, até porque como havia dito é uma estrutura simples que, mais uma vez assim como a anterior, trabalha com modelos de carros dos tipos Fiesta, Gol e Palio. Aqui temos 3 classes "Prototype" referentes aos 3 modelos trabalhados de carros e 1 classe prototype mais "geral" referente aos objetos do tipo "carro" mesmo e é por ela que fazemos "clones" de objetos de uma das 3 classes dos modelos trabalhadoso, ou seja, nos permite criar uma cópia ( aqui sendo os objetos da classe CarroPrototype.java) de um objeto existente (aqui sendo as classes FiestaPrototype.java, GolPrototype.java e PalioPrototype.java) e modificá-lo de acordo com suas necessidades(aqui escolhi trabalhar somente com um atributo mesmo para simplificar nossa vida kkkk, no caso seria o preço da "compra" dos automóveis em questão), ao invés de ter que passar por toda dificuldade de criar um objeto do zero e configurá-lo.
  *  o Projeto do tipo "Abstract Factory", mesmo com muitas classes, é possível ver o que temos aqui.
  *********************************************************************************************
  * * ("Prototype") - Segundo a definição da Wikipédia: 
  * O padrão prototype é um padrão criacional no desenvolvimento de software. Ele é utilizado quando o tipo do objeto a ser criado é determinada por uma instancia prototipada, a qual é clonada para produzir novos objetos.
  *********************************************************************************************
	*/  
  
public class Main {

	public static void main(String[] args) {

		PalioPrototype prototipoPalio = new PalioPrototype(); // Só instancio um objeto da classe "PalioPrototype.java"

    FiestaPrototype prototipoFiesta = new FiestaPrototype(); // Só instancio um objeto da classe "PalioPrototype.java"

    GolPrototype prototipoGol = new GolPrototype(); // Só instancio um objeto da classe "PalioPrototype.java"

    // Apartir da classe "CarroPrototype.java" posso "clonar" a classe e seus métodos/atributos sem ter repetoções de instâncias excessivamente, que é a vantagem maior desse tipo de padrão de projeto!
		CarroPrototype palioNovo = prototipoPalio.clonar(); 
		palioNovo.setValorCompra(27900.0); // Setando preço da classe "clone".
		CarroPrototype palioUsado = prototipoPalio.clonar();
		palioUsado.setValorCompra(21000.0); // Setando preço da segunda classe "clone". O mesmo se segue para os outros exemplos abaixo.

    CarroPrototype fiestaNovo = prototipoFiesta.clonar(); 
		fiestaNovo.setValorCompra(21300.0); 
		CarroPrototype fiestaUsado = prototipoFiesta.clonar();
		fiestaUsado.setValorCompra(20120.0); 

    CarroPrototype golNovo = prototipoGol.clonar(); 
		golNovo.setValorCompra(32140.0); 
		CarroPrototype golUsado = prototipoGol.clonar();
		golUsado.setValorCompra(28750.0); 

    System.out.println(" ");
    System.out.println("---------------------------------------------------------------");
    System.out.println("Prototype");
    System.out.println("---------------------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("+--(Veja os *carros 🚗  que você comprou!)->>>\n");   

    //Print dos resultados das entradas:
    palioNovo.exibirInfo();
    palioUsado.exibirInfo();

    fiestaNovo.exibirInfo();
    fiestaUsado.exibirInfo();

    golNovo.exibirInfo();
    golUsado.exibirInfo();

	}

}
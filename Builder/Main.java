/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
  * *Comentários: Código implementando o PP do tipo "Builder"
  *********************************************************************************************
  * *Obs. Não pus tantos comentários dessa vez porque acho que o código está bem organizado
  *  e fácil de entender o que ele faz, até porque como havia dito é uma estrutura simples que, mais uma vez assim como a anterior, trabalha com modelos de carros dos tipos Fiat e Volkswagen. Aqui temos 2 classes "Builder" referentes aos 2 modelos trabalhados de carros e 1 classe builder mais "geral" referente aos objetos do tipo "carro" mesmo e é por ela que transmitimos aos objetos de uma das 2 classes dos modelos trabalhados os métodos e atributos "gerais" especificados para um objeto do tipo "carro". Além das classes "Builders" temos as classes auxiliares "CarroProduct.java" e "ConcessionariaDirector.java" que auxiliam na criação dos objetos organizando melhor o código e o seu entendimento. Para mais detalhes olhe as outras classes para ver resumidamente cada classe faz!
  *********************************************************************************************
  * * (Definindo o PP - "Builder") - Segundo a definição da Wikipédia: 
  * O padrão Builder é um design pattern de criação com a intenção de encontrar a solução anti-pattern "constructor telescoping".
  *********************************************************************************************
	*/

public class Main {

	public static void main(String[] args) {

		ConcessionariaDirector concessionaria = new ConcessionariaDirector(new FiatBuilder());

    System.out.println(" ");
    System.out.println("---------------------------------------------------------------");
    System.out.println("IFCE - Prof.Ronaldo Ramos 🎷 - PP - Builder (Exemplo) ");
    System.out.println("---------------------------------------------------------------");
    System.out.println(" ");
	 
	  concessionaria.construirCarro();
	  CarroProduct carro = concessionaria.getCarro();
    System.out.println("---------------------------------------------------------------");
    System.out.println("* 🚗  O Modelo construído pelo Builder criado é: ");
    System.out.println("---------------------------------------------------------------");
    System.out.println("\\ō͡≡o˞̶      ****************************************************");
    System.out.println("Carro: " + carro.modelo + "/" + carro.montadora
            + "\nAno: " + carro.anoDeFabricacao + "\nMotor: "
            + carro.dscMotor + "\nValor: " + carro.preco);
	 
	  System.out.println();
	 
    concessionaria = new ConcessionariaDirector(new VolksBuilder());
    concessionaria.construirCarro();
    carro = concessionaria.getCarro();
    System.out.println("---------------------------------------------------------------");
    System.out.println("* 🚗  O Modelo construído pelo Builder criado é: ");
    System.out.println("---------------------------------------------------------------");
    System.out.println("\\ō͡≡o˞̶      ****************************************************");
    System.out.println("Carro: " + carro.modelo + "/" + carro.montadora
            + "\nAno: " + carro.anoDeFabricacao + "\nMotor: "
            + carro.dscMotor + "\nValor: " + carro.preco);

	}

}
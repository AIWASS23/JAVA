/*********************************************************************************************
  * *Comentários: Código implementando o Projeto do tipo "flyweight"
  *********************************************************************************************
  * *Obs. Esse Projeto (que traduzido literalmente é 'Peso-Mosca' kkkkk,por isso fiz a 'piadinha' com os emojis de moscas nos println) é usado para minimizar o 'uso de memoria' ou gasto computacional, compartilhando o máximo que der com objetos semelhantes(aqui são as classes: Imagem, Ponto e Sprite que interagem entre isso através de mais duas outras classes que interagem de acordo com o padrão aqui abordado).
  *********************************************************************************************
  * * ("flyweight") - Segundo a definição da Wikipédia: 
  * Em programa de computadores, Flyweight é um padrão de design de software. Um Flyweight Pattern é um objeto que minimiza o uso de memória, compartilhando o máximo possível de indormações com objetos similares; Esta é uma maneira de usar objetos em larga escala quando uma simples representação repedida poderia usar uma iniceitavel quantidade de memória.
  **********************************************************************************************/

class Main {

	public static void main(String[] args) {

    System.out.println(" ");
    System.out.println("---------------------------------------------------------------");
    System.out.println(" Flyweight ");
    System.out.println("---------------------------------------------------------------");
    System.out.println(" ");

		FlyweightFactory factory = new FlyweightFactory();

		factory.getFlyweight(FlyweightFactory.Sprites.CENARIO_1).desenharImagem(new Ponto(0, 0));

		factory.getFlyweight(FlyweightFactory.Sprites.JOGADOR).desenharImagem(new Ponto(10, 10));

		factory.getFlyweight(FlyweightFactory.Sprites.INIMIGO_1).desenharImagem(new Ponto(100, 10));
		factory.getFlyweight(FlyweightFactory.Sprites.INIMIGO_1).desenharImagem(new Ponto(120, 10));
		factory.getFlyweight(FlyweightFactory.Sprites.INIMIGO_1).desenharImagem(new Ponto(140, 10));

		factory.getFlyweight(FlyweightFactory.Sprites.INIMIGO_2).desenharImagem(new Ponto(60, 10));
		factory.getFlyweight(FlyweightFactory.Sprites.INIMIGO_2).desenharImagem(new Ponto(50, 10));

		factory.getFlyweight(FlyweightFactory.Sprites.INIMIGO_3).desenharImagem(new Ponto(170, 10));

    System.out.println(" ");
    System.out.println("~ 'Padrão de projeto leve até no nome kkk'");
    System.out.println(" ");

	}

}
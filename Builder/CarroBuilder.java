/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
	*/

// Builder dos objetos do tipo ou que herdam o tipo "Carro", o uso desse e das outras classes "Builders" permite que se criem diferentes variedades de um objeto (aqui, do tipo "Carro") enquanto evita-se poluição de um ou mais tipos de construtores muito chamados no código. É bem Útil quando poderia haver diversas variedades de um objeto (Ou quando há muitos passos envolvida na criação de um objeto, que aqui há poucos casos), como aqui temos as classes "ConcessionariaDirector.java", "FiatBuilder.java" e "VolksBuilder.java" que chamam o construtor de "CarroBuilder.java", ou seja este é chamado 3 VEZES! 

public abstract class CarroBuilder {

	protected CarroProduct carro = new CarroProduct();
	public abstract void buildPreco();
	public abstract void buildDscMotor();
	public abstract void buildAnoDeFabricacao();
	public abstract void buildModelo();
	public abstract void buildMontadora();

	public CarroProduct getCarro(){
		return carro; // retorna o objeto depois de construido automatizando o código;

	};

}
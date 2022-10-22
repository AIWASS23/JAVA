/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
	*/

// Apartir da classe "CarroPrototype.java" posso "clonar" a classe e seus métodos/atributos sem ter repetoções de instâncias excessivamente, que é a vantagem maior desse tipo de padrão de projeto!
//Por isso para realizar tal "clonagem" nada melhor do que essa classe ser abstrata!
public abstract class CarroPrototype {

	protected double valorCompra;

	public abstract void exibirInfo();

	public abstract CarroPrototype clonar();

	public double getValorCompra() {
		return valorCompra;

	}

  //Como só trabalhamos em setar o valor de compra do carro só temos essse método mesmo mas a ideia pode muito bem ser extendida aplamente, aqui, só optei por um exemplo simples e fácil de entender...
	public void setValorCompra(double valorCompra) {

		this.valorCompra = valorCompra;

	}

}
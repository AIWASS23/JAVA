/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
	*/

//Classe exemplo, que dever ser criada uma vez e nada mais do que isso, objetos do tipo CarroPrototype é que irão "cloná-la" em caso de se necessitar mais objetos dela!
public class FiestaPrototype extends CarroPrototype {

	protected FiestaPrototype(FiestaPrototype fiestaPrototype) {

		this.valorCompra = fiestaPrototype.getValorCompra();
    
	}

	public FiestaPrototype() {

		valorCompra = 0.0;

	}

	@Override
	public void exibirInfo() {

    System.out.println("+--(Modelo Comprado: * 🚗 Fiestinha)--------------------------------------------+");
    System.out.println("    ______");
    System.out.println(" __/   |_\\_");
    System.out.println("|  _     _  ``-.    ");
    System.out.println("'-(_)---(_)----'   ~");
    System.out.println("+--(Informações da compra $)-------------------------------------------------+");
    System.out.println("Modelo: Fiesta - Montadora: Ford" + " - Valor: R$" + getValorCompra());
    System.out.println("+--------------------------------------------------------------------------+\n");

	}

	@Override
	public CarroPrototype clonar() {

		return new FiestaPrototype(this);

	}

}
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
public class GolPrototype extends CarroPrototype {

	protected GolPrototype(GolPrototype golPrototype) {

		this.valorCompra = golPrototype.getValorCompra();
    
	}

	public GolPrototype() {

		valorCompra = 0.0;

	}

	@Override
	public void exibirInfo() {

    System.out.println("+--(Modelo Comprado: * 🚗 Golzinho)--------------------------------------------+");
    System.out.println("   _____          ");
    System.out.println(" (|_||_\\`.__     ");
    System.out.println("(   _    _ _\\    ");
    System.out.println("=`-(_)--(_)-'    ~");
    System.out.println("+--(Informações da compra $)-------------------------------------------------+");
    System.out.println("Modelo: Gol - Montadora: Wolkswagen" + " - Valor: R$" + getValorCompra());
    System.out.println("+--------------------------------------------------------------------------+\n");

	}

	@Override
	public CarroPrototype clonar() {

		return new GolPrototype(this);

	}

}
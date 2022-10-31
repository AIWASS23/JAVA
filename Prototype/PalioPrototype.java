
//Classe exemplo, que dever ser criada uma vez e nada mais do que isso, objetos do tipo CarroPrototype é que irão "cloná-la" em caso de se necessitar mais objetos dela!
public class PalioPrototype extends CarroPrototype {

	private PalioPrototype(PalioPrototype palioPrototype) {

		this.valorCompra = palioPrototype.getValorCompra();

	}

	public PalioPrototype() {

		valorCompra = 0.0;

	}

	@Override
	public void exibirInfo() {

    System.out.println("+--(Modelo Comprado: * 🚗 Paliozinho)--------------------------------------------+");
    System.out.println("  _.-.___\\__     ");
    System.out.println(" |  _      _  `-._     ");
    System.out.println(" '-(_)----(_)-----  ~");
    System.out.println("+--(Informações da compra $)-------------------------------------------------+");
    System.out.println("Modelo: Palio - Montadora: Fiat" + " - Valor: R$" + getValorCompra());
    System.out.println("+--------------------------------------------------------------------------+\n");

	}

	@Override
	public CarroPrototype clonar() {

		return new PalioPrototype(this);

	}

}
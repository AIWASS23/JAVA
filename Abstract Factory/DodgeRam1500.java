public class DodgeRam1500 extends Picape {
	
	int numero_de_cavalos = 1500;

	public DodgeRam1500(FactoryDodge factoryDodge, int wheel, boolean diesel, int axles) {
		super(wheel, diesel, axles);
	}

	@Override
	public String getName() {
		return this.getClass().getName();
	}

	@Override
	public String toString() {
		return "DodgeRam1500 [Numero de cavalos = " + numero_de_cavalos + ", Numero de eixos = " + eixos_das_rodas + ", Rodas = " + num_Rodas + ", Vem com diesel = " + vem_com_diesel
				+ "]";
	}

}
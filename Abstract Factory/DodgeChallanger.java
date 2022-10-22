public class DodgeChallanger extends Sedan {
	
	String tipo_de_modelo = "velho";

	public DodgeChallanger(FactoryDodge factoryDodge, int wheel, boolean diesel, boolean coupe) {
		super(wheel, diesel, coupe);
	}

	@Override
	public String getName() {
		return this.getClass().getName();
	}

	@Override
	public String toString() {
		return "DodgeChallanger [Tipo do modelo = " + tipo_de_modelo + ", Tem coupe = " + tem_coupe + ", Rodas = " + num_Rodas + ", Vem com diesel = " + vem_com_diesel + "]";
	}
	
}
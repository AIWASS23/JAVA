public abstract class Sedan extends Carro {//Uma carroceria sedã(Chamei de "Sedan" para evitar o "ã" no código), também denominada berlina, turismo ou três volumes, é um dos tipos mais comuns de carroceria e é o formato que a maioria das pessoas atualmente associa com o carro moderno.
	
	public boolean tem_coupe; // Atualmente o termo "Coupe ou Coupé" Atualmente, a designação se refere a automóveis de capota fixa geralmente para dois ocupantes ou 2+2 e de duas portas.
	
	public Sedan(int rodas, boolean diesel, boolean coupe) {
		super(rodas, diesel);
		this.tem_coupe = coupe;
	}

	public abstract String getName();

}//
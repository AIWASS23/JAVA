/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
	*/

public class Sorvete_De_Acai implements Sorvete {

	private final String ingredientes;
	private String coberturas;

	public Sorvete_De_Acai() {
		ingredientes = "*Feito da polpa do Açai, 1\\2 de creme de leite, 1 litro de água, 200 gr de açúcar, 20 gr de estabilizante e 80 gr de glucose de milho.";
	}

	@Override
	public void preparar_soverte() {
		System.out.println("Aqui! Seu saboroso sorvete de Açai🍨 "
				+ (this.coberturas != null && !this.coberturas.isEmpty() ? ("com a cobertura \"" + this.coberturas + "\" de sua escolha.")
						: " sem cobertura. "));
    System.out.println(ingredientes);

	}

	public void setCoberturas(String coberturas) {
		this.coberturas = coberturas;
	}

}

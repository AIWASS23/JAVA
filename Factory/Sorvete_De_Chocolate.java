/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
	*/

public class Sorvete_De_Chocolate implements Sorvete {

	private final String ingredientes;
	private String coberturas;

	public Sorvete_De_Chocolate() {
		ingredientes = "* Feito com creme de leite, leite condensado, pó de cacau e extrato de baunilha.";
	}

	@Override
	public void preparar_soverte() {
		System.out.println("Aqui! Seu saboroso sorvete de Chocolate🍨 "
				+ (this.coberturas != null && !this.coberturas.isEmpty() ? ("com a cobertura \"" + this.coberturas + "\" de sua escolha.")
						: " sem cobertura. "));
    System.out.println(ingredientes);

	}

	public void setCoberturas(String coberturas) {
		this.coberturas = coberturas;
	}

}

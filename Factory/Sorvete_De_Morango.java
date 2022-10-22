/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
	*/

public class Sorvete_De_Morango implements Sorvete {

	private final String ingredientes;
	private String coberturas;

	public Sorvete_De_Morango() {
		ingredientes = "*Feito com leite, creme, pedaços de Morango natural e açúcar.";
	}

	@Override
	public void preparar_soverte() {
		System.out.println("Aqui! Seu saboroso sorvete de Morango🍨 "
				+ (this.coberturas != null && !this.coberturas.isEmpty() ? ("com a cobertura \"" + this.coberturas + "\" de sua escolha.")
						: " sem cobertura. "));
    System.out.println(ingredientes);
	}

	public void setCoberturas(String coberturas) {
		this.coberturas = coberturas;
	}

}

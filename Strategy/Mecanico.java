/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
	*/

public class Mecanico extends Musico{
	
  // Abaixo, o construtor de todos os objetos 'Mecanico':

	public Mecanico(){
		
		super();
		
		setNome("Joao da Borracha");
    setTipo("Mecanico");
		setInstrumento("Furadeira");
		
		// Obs. Setamos a interface da classe 'TocaInstrumento.java' de forma polimórfica. 
		// Abaixo 'setamos' a capacidade do musico como inapta para tocar seu instrumento de uso indicado.
		capacidade_de_tocar_instrumento = new NaoSabeTocar();
		
	}
	
}

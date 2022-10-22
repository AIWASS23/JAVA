/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
	*/

public class Saxofonista extends Musico{

	// Abaixo, o construtor de todos os objetos 'Saxofonista':
	
	public Saxofonista(){
		
		super();
		
    setNome("Ronaldo Ramos");
    setTipo("Saxofonista");
		setInstrumento("Sax");
		
		// Obs. Setamos a interface da classe 'TocaInstrumento.java' de forma polimórfica. 
		// Abaixo 'setamos' a capacidade do musico como apta para tocar seu instrumento de uso indicado.
		capacidade_de_tocar_instrumento = new SabeTocar();
		
	}
	
}

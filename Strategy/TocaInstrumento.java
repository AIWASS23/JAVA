/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************

  *Comentários:

  // A interface é implementada por muitas outras
  // subclasses que permitem vários tipos de mudanças
  // na capacidade de determinado músico de saber ou não
  // tocar seu instrumento, isso sem afetar as classes 
  // 'Musico.java' ou 'TovaInstrumento.java' e suas relações 
  // de métodos e etc.

  // O uso de classes que implementam novas subclasses com interfaces do tipo 'TocaInstrumento'
  // EVITA duplicações/repetições desnecessárias de código.

  // Aqui fazemos uso de 'decoupling' : Encapsular um conceito que varia/muda.

  *********************************************************************************************

	*/

public interface TocaInstrumento {
	
   String capacidade_de_tocar();
   
}

//Classe usada em caso do Musico não ser apto a tocar seu instrumento
class SabeTocar implements TocaInstrumento{

	public String capacidade_de_tocar() {
		
		return "Sabe tocar e muito esse instrumento!";
		
	}
	
}

//Classe usada em caso do Musico ser apto a tocar seu instrumento
class NaoSabeTocar implements TocaInstrumento{

	public String capacidade_de_tocar() {
		
		return "Nao sabe tocar esse instrumento.";
		
	}
	
}
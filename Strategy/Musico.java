/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
	*Comentários:

  // Em vez de usar uma interface de forma tradicional
	// usamos uma variável de instância que é uma subclasse
	// da interface da classe TocaInstrumento.
	
	// A nossa classe 'Musico.java' não se importa com o que 'capacidade_de_tocar_instrumento' faz,
	// ela apenas sabe que tal 'comportamento' está disponível para suas subclasses
	
	// Isso é conhecido como 'Composição': Em vez de herdar
	// uma habilidade por herança a classe é composta
	// com objetos com a habilidade certa.
	
	// Usar de 'Composição' aqui também nos dá muitas outras vantagens 
  //(Principalmente quanto a rodar nossa aplicação em TEMPO DE EXECUÇÃO ;D)

  *********************************************************************************************
  */

public class Musico {
	private String nome;
  private String tipo;
  private String instrumento;
	
	public TocaInstrumento capacidade_de_tocar_instrumento;
	
  public void setNome(String newNome){ tipo = newNome; }
	public String getNome(){ return tipo; }

	public void setTipo(String newTipo){ nome = newTipo; }
	public String getTipo(){ return nome; }

  public void setInstrumento(String newInstrumento){ instrumento = newInstrumento; }
	public String getInstrumento(){ return instrumento; }
	
	/* Obs. Cuidado:
	* Não queremos adicionar metodos a super classe.
	* Precisamos separar o que é DIFERENTE entre as subclasses e a super classe!
	*/
	
	public String tocarInstrumento(){
		
		return capacidade_de_tocar_instrumento.capacidade_de_tocar();
		
	}
	
	// O método abaixo permite-nos "setar" dinamicamente a capacidade de um dos músicos "tocar" ou não seu instrumento!
	public void setCapacidadeDeTocar(TocaInstrumento newCapacidadeDeTocarInstrumento){
		
		capacidade_de_tocar_instrumento = newCapacidadeDeTocarInstrumento;
		
	}
	
}

	
	
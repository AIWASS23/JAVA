/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
  *
  * É aonde se define os objetos gerenciados pelos 'Pools' do nosso padrão.
  * 
  */

public class Funcionario {
	private String nome;

	public Funcionario(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}
}
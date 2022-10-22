/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
  *
  */

public class No {

	protected int chave;
	No esquerdo, direito;

	public No(int chave) {
		this.chave = chave;
		esquerdo = null;
		direito = null;

	}

	public String toString() {
		return String.valueOf(chave);

	}

	public int getChave() {
		return chave;

	}

	public No getEsquerdo() {
		return esquerdo;

	}

	public void setEsquerdo(No esquerdo) {
		this.esquerdo = esquerdo;

	}

	public No getDireito() {
		return direito;

	}

	public void setDireito(No direito) {
		this.direito = direito;
    
	}

}
/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
	*/

public abstract class ArquivoComponent {
	String nomeDoArquivo;

	public String getNomedoArquivo() {
		return this.nomeDoArquivo;
    
	}

	public void printNomeDoArquivo() {
		System.out.println(this.nomeDoArquivo);

	}

}
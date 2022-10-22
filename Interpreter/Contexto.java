/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
	*/

public class Contexto {

	protected String input;
	protected int output;

	public Contexto(String input) {
		this.input = input;

	}

	public String getInput() {
		return input;

	}

	public void setInput(String input) {
		this.input = input;

	}

	public int getOutput() {
		return output;

	}

	public void setOutput(int output) {
		this.output = output;
    
	}

}
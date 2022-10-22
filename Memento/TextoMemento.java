/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
	*/

public class TextoMemento {

    protected String estadoTexto;

    public TextoMemento(String texto) {
      estadoTexto = texto;
    }

    public String getTextoSalvo() {
      return estadoTexto;
    }
    
}
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

public class ExibirPostOrderVisitor implements ArvoreVisitor {

	@Override
	public void visitar(No no) {
		if (no == null){
			return;

    }

		visitar(no.getEsquerdo());
		visitar(no.getDireito());
    
		System.out.println(no + "🌱");

	}

}
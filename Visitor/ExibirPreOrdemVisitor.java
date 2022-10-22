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

public class ExibirPreOrdemVisitor implements ArvoreVisitor {

	@Override
	public void visitar(No no) {
		if (no == null){
			return;

    }

		System.out.println(no + "🌱");
    
		visitar(no.getEsquerdo());
		visitar(no.getDireito());

	}

}
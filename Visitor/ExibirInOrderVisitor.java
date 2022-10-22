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

public class ExibirInOrderVisitor implements ArvoreVisitor {

	@Override
	public void visitar(No no) {
		if (no == null){
			return;
      
    }

		this.visitar(no.getEsquerdo());

		System.out.println(no + "🌱");

		this.visitar(no.getDireito());

	}

}
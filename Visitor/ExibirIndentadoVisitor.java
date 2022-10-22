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

public class ExibirIndentadoVisitor implements ArvoreVisitor {

	@Override
	public void visitar(No no) {
		if (no == null) {
			return;

		}

		System.out.println(no);

		visitar(no.getEsquerdo(), 1);
		visitar(no.getDireito(), 1);

	}

	private void visitar(No no, int qtdEspacos) {
		if (no == null) {
			return;

		}

		for (int i = 0; i < qtdEspacos; i++) {
			System.out.print("-");
      
		}

		System.out.println(no + "🌱");

		visitar(no.getEsquerdo(), qtdEspacos + 1);
		visitar(no.getDireito(), qtdEspacos + 1);

	}

}
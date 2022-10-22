/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
  * *Comentários: Código implementando o PP do tipo "Chain of Responsability"
  *********************************************************************************************
  * *Obs. Esse 'PP' ajuda a criar uma cadeia de objetos. Requer entradas de uma saída e lê objeto por objeto até encontrar um resultado adequado.
  *********************************************************************************************
  * * (Definindo o PP - "Chain of Responsability") - Segundo a definição da Wikipédia: 
  * Em orientação a objeto, o Pattern Chain of Responsibility é um design que consiste de um fonte com objetos de comandos e uma série de objetos de processamento. Cada objeto de processamento contem uma lógica que define objetos de comando que ele pode realizar; O demais é passado para o proximo objeto da cadeia.
  *********************************************************************************************
	*/

class Main {

	public static void main(String[] args) {

    System.out.println(" ");
    System.out.println("---------------------------------------------------------------");
    System.out.println("IFCE - Prof.Ronaldo Ramos 🎷 - PP - Chain of Responsability ");
    System.out.println("---------------------------------------------------------------");
    System.out.println(" ");
    System.out.println("Carregando...");
    System.out.println("    ...Cadeia de Responsabilidades (Cidade):  ");
    System.out.println(" ");
    System.out.println("             🏡 🏡 🏦 🏡 🏡 🏠 🏨 🏠 🏠 🏠 🏦 💒 🏡 🏡 🏡 🏡 🏦 🏡 🏡 🏦     🏃 <<< ");
    System.out.println(" ");
    System.out.println("Bancos:          *A              *B          *C    *D   *Cliente");
    System.out.println(" ");
    System.out.println("Carregando...");
    System.out.println("    ...Operações efetuadas (Bancos):  ");
    System.out.println(" ");

		BancoChain bancos = new BancoA();
		bancos.setNext(new BancoB());
		bancos.setNext(new BancoC());
		bancos.setNext(new BancoD());
		
		try {
			bancos.efetuarPagamento(IDBancos.bancoC);
			bancos.efetuarPagamento(IDBancos.bancoD);
			bancos.efetuarPagamento(IDBancos.bancoA);
			bancos.efetuarPagamento(IDBancos.bancoB);

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}



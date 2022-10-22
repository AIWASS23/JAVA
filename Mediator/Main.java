/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
  * *Comentários: Código implementando o PP do tipo "Mediator"
  *********************************************************************************************
  * *Obs. Esse padrão adiciona um 'objeto de terceiros' (chamado de mediador) para controlar a 
  interação entre os dois objetos (chamados de colegas). Esse processo ajyda na redução do '
  acoplamento entre as classes' que estão comunicando entre si, pois agora elas não têm a 
  necessidade de conhecer a implementação uma da outra. Aqui, a classe 'Mediator.java' faz esse 
  papel através de uma classe que herda desta chamada de 'MensagemMediator.java' que vai fazer 
  esse 'controle' entre as classes 'Colleages' implementadas, que simulam um chat entre pessoas
  com diferentes aparelhos conversando entre si.
  *********************************************************************************************
  * * (Definindo o PP - "Mediator") - Segundo a definição da Wikipédia: 
  * Na engenharia de software, o pattern mediator define um objeto que encapsula como conjunto
   de objetos interagem. Este pattern um pattern comportamental (behavioral pattern), pois ele 
   pode alterar o comportamento do programa.
  *********************************************************************************************
	*/

class Main {

	public static void main(String[] args) {

    System.out.println(" ");
    System.out.println("---------------------------------------------------------------");
    System.out.println("IFCE - Prof.Ronaldo Ramos 🎷 - PP - Mediator ");
    System.out.println("---------------------------------------------------------------");
    System.out.println(" ");

		MensagemMediator mediador = new MensagemMediator();
	
		AndroidColleague android = new AndroidColleague(mediador);
		IOSColleague ios = new IOSColleague(mediador);
		SymbianColleague symbian = new SymbianColleague(mediador);
	
		mediador.adicionarColleague(android);
		mediador.adicionarColleague(ios);
		mediador.adicionarColleague(symbian);
		
		symbian.enviarMensagem("💬  Oi, eu sou um Symbian!\n");
		System.out.println("=========");
		android.enviarMensagem("💬  Oi Symbian! Eu sou um Android!\n");
		System.out.println("=========");
		ios.enviarMensagem("💬  Olá todos, sou um iOs!\n");

	}

}
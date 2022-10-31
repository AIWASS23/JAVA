
  /* *Comentários: Código implementando o Projeto do tipo "Proxy"
  *********************************************************************************************
  * *Obs. Usando esse padrão de projeto (PP), uma classe irá, basicamente, representar a 
  'funcionalidade' de outra classe. Fiz dessa vez uma exemplo mais simples que só usa de duas 
  classes: 'BancoUsuarios.java' e 'BancoProxy.java'. A classe 'BancoProxy.java' é que irá exercer
  esse papel de 'representar' a funcionalidade da classe 'BancoUsuarios.java'. Aqui na classe 'Main'
  faço um exemplo de um 'Ataque Hacker - Proxy' a um banco de dados de usuáio, um cenário que se você
  parar para pensar pode representar esse PP de uma forma bem interessante.
  *********************************************************************************************
  * * (Definindo o PP - "Proxy") - Segundo a definição da Wikipédia: 
  * Um Proxy, de forma geral, é uma classe funcionando como uma interface para outra coisa. Um Proxy é um envolucro (wrapper) ou Agent Object que é chamado pelo cliente para acessar o objeto real por traz da cena. O uso de Proxy pode ser simplesmente para repassar para um objeto real ou então adicionar lógica a ele. Na lógica adicional que o Proxy pode adicionar temos por exemplo cache para operações que consomem muitos recursos.
  *********************************************************************************************
	*/

class Main {

	public static void main(String[] args) {

    System.out.println(" ");
    System.out.println("---------------------------------------------------------------");
    System.out.println(" Proxy ");
    System.out.println("---------------------------------------------------------------");
    System.out.println(" ");

		System.out.println("🕵️  Hacker acessando...");

    // Tenta acessar com uma senha diferente da que o banco conhece, logo dá null
		BancoUsuarios banco = new BancoProxy("Hacker", "1234"); 
		System.out.println(banco.getNumeroDeUsuarios());
		System.out.println(banco.getUsuariosConectados());

		System.out.println("\n👨‍💼  Administrador acessando...");

    //Acessa com a senha definida para o Banco de Dados, logo tem acesso!
		banco = new BancoProxy("admin", "admin");
		System.out.println(banco.getNumeroDeUsuarios());
		System.out.println(banco.getUsuariosConectados());

	}

}
/**********************************************************************************************
  * *Comentários: "Object Pool"
  *********************************************************************************************
  * *Obs. Esse Projeto nos possibilita o 'reaproveitamento de objetos' basicamente, o que é muito
  vanajoso quando os objetos são caros para criar e são necessários apenas por curtos períodos 
  de tempo. Um exemplo 'simple' que imaginei é algo bem 'real' do nosso dia-a-dia, uma 'Pool'
  de objetos do tipo 'Funcionários', isso pode ser algo que um sistema de cadastro ou de administração
  de uma empresa possa precissar na exclusão, modificação ou ingressão de novos trabalhadores, por
  exemplo, aqui faço um 'simples esboço' de umasituação que usa isso, mas bem no 'básico' mesmo kkkk.
  *********************************************************************************************
  * * ("Object Pool") - Segundo a definição da Wikipédia: 
  * O padrão de 'pool de objetos' é um padrão de design criacional de software que usa um conjunto 
  de objetos inicializados, prontos para uso - um "pool" - em vez de alocá-los e destruí-los sob 
  demanda. 
  *********************************************************************************************
	*/

class Main {

  public static void main(String[] args) {

    System.out.println(" ");
    System.out.println("---------------------------------------------------------------");
    System.out.println(" Object Pool ");
    System.out.println("---------------------------------------------------------------");
    System.out.println(" ");

    Pool<Funcionario> funcionarioPool = new FuncionarioPool();
		Funcionario funcionario = funcionarioPool.adquirir();
		
    System.out.println("*👥  'Object Pool' dos funcionários criados: ");
    System.out.println("---------------------------------------------------------------");

		while (funcionario != null) {
			System.out.println(funcionario.getNome());
			funcionario = funcionarioPool.adquirir();

		}

  }

}
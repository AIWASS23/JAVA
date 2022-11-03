/*
  *********************************************************************************************
  * *Comentários: Código implementando o Projeto do tipo "Strategy" para um sistema que exibe as 
  * informações de "músicos" e se sabem ou não tocar seus instrumentos. Os músicos são criados
  * no código e sua "capacidade de tocar ou não seu instrumento" pode ser mudada dinamicamente
  * no código também, tudo usando o "Strategy" para gerir nossas classes e dados.
  *********************************************************************************************
  * *Segundo a Wikipedia: O objetivo é representar uma operação a ser realizada sobre os elementos de uma estrutura de objetos.[1] O padrão Strategy permite definir novas operações sem alterar as classes dos elementos sobre os quais opera. Segundo o catálogo GOF o padrão tem como meta: "Definir uma família de algoritmos, encapsular cada uma delas e torná-las intercambiáveis. Strategy permite que o algoritmo varie independentemente dos clientes que o utilizam."[2]
  *********************************************************************************************
	*/

public class Main{

	public static void main(String[] args){

		Musico joao = new Mecanico(); // Criando primeiro objeto de classe que herda a de Musico
		Musico ronaldo = new Saxofonista(); // Criando segundo objeto de classe que herda a de Musico

    System.out.println("----------------------------------------------------------------------------------- ");
    System.out.println(" Strategy ");
    System.out.println("----------------------------------------------------------------------------------- \n");

    System.out.println("--(Dados do Primeiro Musico: )----------------------------------------------------- ");

    System.out.println("*Nome do musico: " + ronaldo.getNome());
    System.out.println("*Tipo de musico: " + ronaldo.getTipo());
    System.out.println("*Instrumento: " + ronaldo.getInstrumento());
    System.out.println("*Proeficiencia: " + ronaldo.tocarInstrumento() + "\n");

    System.out.println("--(Dados do Segundo Musico: )------------------------------------------------------ ");

		System.out.println("*Nome do musico: " + joao.getNome());
    System.out.println("*Tipo de musico: " + joao.getTipo());
    System.out.println("*Instrumento: " + joao.getInstrumento());
    System.out.println("*Proeficiencia: " + joao.tocarInstrumento() + "\n");

    System.out.println("--(Resultado apos mudar dinamicamente no codigo a proeficiencia do musico: Joao)--------: ");

		// Aqui, podemos mudar dinamicamente o dado "capacidade_de_tocar_instrumento" de qualquer objeto da classe "Musico"! Essa é a " operação a ser realizada sobre os elementos de uma estrutura de objetos" que estamos representando aqui (uma bem simples mas que mostra o padrão).
		joao.setCapacidadeDeTocar(new SabeTocar());
		System.out.println("*Proeficiencia(Nova): " + joao.tocarInstrumento() + "\n");

    System.out.println("---------------------------------------------------------------------------------------- \n");

	}

}

/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
  * *Comentários: Código implementando o PP do tipo "Interpreter"
  *********************************************************************************************
  * *Obs. O padrão Interpreter descreve como definir uma grámatica para linguagens simples, 
  representar sentenças na linguagem e interpretar essas sentenças, aqui usa-se
  um exemplo comum de aplicação disso: Converter algarismos romanso em números decimais.
  *********************************************************************************************
  * * (Definindo o PP - "Interpreter") - Segundo a definição da Wikipédia: 
  * Dada uma determinada linguagem, o padrão Interpreter define uma representação para sua gramática 
  juntamente com um interpretador que usa a representação para interpretar sentenças na língua. 
  Ou mapear um domínio para uma língua, a língua para uma gramática e a gramática para um projeto 
  de design hierárquico orientado a objetos.
  *********************************************************************************************
	*/

import java.util.ArrayList;

class Main {

	public static void main(String[] args) {

    System.out.println(" ");
    System.out.println("---------------------------------------------------------------");
    System.out.println("IFCE - Prof.Ronaldo Ramos 🎷 - PP - Interpreter ");
    System.out.println("---------------------------------------------------------------");
    System.out.println(" ");

    // Cria-se uma lista de interpretadores e adiciona-se os métodos que vão-se usar
    // para converter a entrada, que está em números romanos, para números decimais: 
		ArrayList<NumeroRomanoInterpreter> interpretadores = new ArrayList<NumeroRomanoInterpreter>();
		interpretadores.add(new QuatroDigitosRomano());
		interpretadores.add(new TresDigitosRomano());
		interpretadores.add(new DoisDigitosRomano());
		interpretadores.add(new UmDigitoRomano());

    // Nossa entrada em números romanos:
		String numeroRomano = "CXCIV";
		Contexto contexto = new Contexto(numeroRomano);

    System.out.println(" Entrada (Em algarismos romanos - i ii iii ...): " + numeroRomano);

    // 'Interpretando' os números romanos da entrada 'um por um':
		for (NumeroRomanoInterpreter numeroRomanoInterpreter : interpretadores) {
			numeroRomanoInterpreter.interpretar(contexto);

		}

    System.out.println("   ");
    System.out.println(" | ");
    System.out.println(" | ");
    System.out.println(" | ");
    System.out.println(" V ");
    System.out.println("   ");

    // Nossa saída, em números decimais:
		System.out.println(" Saída (Em números decimais - 1 2 3 ...): " + Integer.toString(contexto.getOutput()));

	}

}
/**********************************************************************************************
  * *Comentários: Código implementando o Projeto do tipo "Factory" usando de um sistema de escolha
  *  de sabores de sorvetes e suas coberturas, usamos de uma estruturasimples na classe 
  *  "Sorvete_Factory.java" para retornar determinado sorvete escolhido pelo usuário junto da
  *  cobertura definida pelo mesmo que será adicionada a classe do sorvete escolhido. Usou-se
  *  uma analogia simples mas como todo PP tal estrutura aqui usada pode sim ser mais complexa
  *  se aberta e implementada para casos mais específicos, por questões de tempo e para faciliar
  *  sua vida professor kkkk eu fiz mais simples mesmo.
  *********************************************************************************************
  * *Obs. Não pus tantos comentários dessa vez porque acho que o código está bem organizado
  *  e fácil de entender o que faz, até porque como havia dito é uma estrutura simples que simula
  *  o Projeto do tipo "Factory".
  *********************************************************************************************
  * * ("Factory") - Segundo a definição da Wikipédia: 
  * Na programação baseada em classes, o padrão de método de factory é um padrão de criação que usa métodos de factory * para lidar com o problema de criação de objetos sem precisar especificar a classe exata do objeto que será criado. * Isso é feito criando objetos chamando um método de factory - ou especificado em uma interface e implementado por
  * classe filho, ou implementado em uma classe base e opcionalmente substituído por classes derivadas - em vez de 
  * chamar um construtor.
  **********************************************************************************************/

import java.util.Scanner;

public class Main{

  public static void main(String[] args) {

    System.out.println(" ");
    System.out.println("        .-\"`'\"-.        ");
    System.out.println("       /        \\        ");
    System.out.println("       |        |         ");
    System.out.println("       /'---'--`\\        ");
    System.out.println("      |          |        ");
    System.out.println("      \\.--.---.-./       ");
    System.out.println("      (_.--._.-._)        ");
    System.out.println("        \\=-=-=-/         ");
    System.out.println("         \\=-=-/          ");
    System.out.println("          \\=-/           ");
    System.out.println("    jgs    \\/    \"Sorveteria 3 Sabores\" -                                \n");
    System.out.println("                    (( Porque só temos 3 sabores no momento kkkkk))         \n");
    System.out.println("------------------------------------------------------");
    System.out.println(" Factory ");
    System.out.println("------------------------------------------------------");
    System.out.println("------------------------------------------------------");
    System.out.println("Digite o numero do sorvete a ser pedido:    ");
    System.out.println("------------------------------------------------------");
    System.out.println("1- Açaí, 2- Morango, 3- Chocolate, 4- Sair  ");
    System.out.println("--(🍦 Sorvete escolhido)-------------------------------");
    Scanner scanner = new Scanner(System.in);
    String type = scanner.nextLine();
    if(type.equalsIgnoreCase("4") ) {
        System.out.println("(Saiu da sorveteria) - Obrigado, tenha um dia refrescante! 🍨");
        System.exit(0);
    }
    System.out.println("\n------------------------------------------------------");
    System.out.println("Digite as coberturas que deseja (4-Sair): ");
    System.out.println("--(💩 Cobertura escolhida)-------------------------------");
    String coberturas = scanner.nextLine();
    System.out.println("\n------------------------------------------------------");

    if(coberturas.equalsIgnoreCase("4") ) {
        System.out.println("(Saiu da sorveteria) - Obrigado, tenha um dia refrescante! 🍨");
        System.exit(0);
    }

    Sorvete sorvete = null;

    while(!type.equalsIgnoreCase("4")) {
      sorvete = Sorvete_Factory.getInstance(type);
      sorvete.setCoberturas(coberturas);
      sorvete.preparar_soverte();
      
      System.out.println("------------------------------------------------------------  ");
      System.out.println("Digite o numero do sorvete a ser pedido novamente (4-Sair) :  ");
      System.out.println("--(🍦 Sorvete escolhido)--------------------------------------  ");
      type = scanner.nextLine();
      System.out.println("\n------------------------------------------------------------  ");

      if(!type.equalsIgnoreCase("4") ) {
        System.out.println("Digite as coberturas que deseja novamente (4-Sair) : ");
        System.out.println("--(💩 Cobertura escolhida)------------------------------------  ");
        coberturas = scanner.nextLine();
        System.out.println("\n------------------------------------------------------------  ");
      }
      
    }

    System.out.println("(Saiu da sorveteria) - Obrigado, tenha um dia refrescante! 🍨");
  }
}
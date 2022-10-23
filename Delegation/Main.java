/***********************************************************************************************
  * *Comentários: "Delegation"
  *********************************************************************************************
  * *Obs. Esse Programa é uma forma de 'delegar uma responsabilidade' para 'outro objeto próximo'.
  É onde o objeto expressa determinado comportamento para o exterior, deixando a responsabilidade 
  de determinado comportamento para outro objeto. É um 'PP' bem comum, mas é muitas vezes usado 
  por outros padrões, em 'conjunto', alguns desses PP's incluem: Visitor, Observer, Strategy, Event Listener e outros. Aqui mesmo, nossa classe 'delegadora' (ControllerImpressora) é quem vai fazer
  essa 'delegação' das classes 'delegadas' da classe 'Impressora', que são as classes
  'ImpressoraHP', 'ImpressoraCanon' e 'ImpressoraEpson'.
  *********************************************************************************************
  * * ("Delegation") - Segundo a definição da Wikipédia: 
  * O padrão de delegação é um padrão de design orientado a objetos que permite a composição de objetos para obter a mesma reutilização de código como herança (Traduzido do inglês). Nesse 'PP', um objeto lida com uma solicitação delegando a um segundo objeto (o delegado ). O delegado é um objeto auxiliar , mas com o contexto original .
  *(Obs. Mais info no link: https://en.wikipedia.org/wiki/Delegation_pattern).
  *********************************************************************************************
	*/

class Main {

  private static final String MENSAGEM_PRINTADA = "💻 : \"Hello world!\"";

  public static void main(String[] args) {

    System.out.println(" ");
    System.out.println("---------------------------------------------------------------");
    System.out.println(" Delegation ");
    System.out.println("---------------------------------------------------------------");
    System.out.println(" ");
    System.out.println("👮📢 ~ Delegando as impressoras para printar...");
    System.out.println(" ");

    var controllerImpressoraHP = new ControllerImpressora(new ImpressoraHP());
    var controllerImpressoraCanon = new ControllerImpressora(new ImpressoraCanon());
    var controllerImpressoraEpson = new ControllerImpressora(new ImpressoraEpson());

    controllerImpressoraHP.print(MENSAGEM_PRINTADA);
    controllerImpressoraCanon.print(MENSAGEM_PRINTADA);
    controllerImpressoraEpson.print(MENSAGEM_PRINTADA);

  }

}
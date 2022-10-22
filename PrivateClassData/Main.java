/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
  * *Comentários: Código implementando o PP do tipo "Private Class Data"
  *********************************************************************************************
  * *Obs. Esse padrão busca reduzir a exposição de atributos limitando sua 'visibilidade' em 
  relação as outras classes. Também, reduz o número de atributos de classe, encapsulando-os 
  em um único objeto de dados. Ele permite que o designer da classe remova o 'privilégio 
  da gravação de atributos' que devem ser definidos apenas durante a construção da classe, 
  mesmo a partir de métodos da classe alvo. Nesse simples exemplo trato a situação como uma 
  'aula de culinária de ensopado (Aqui chamo de 'Sopa' mesmo kkkk) com alguns ingredientes 
  dados num construtor. Então, temos métodos para enumerar os ingredientes e saborear nossa 
  sopa. O método de 'degustação/Provar' do ensopado altera os membros privados do aula de 
  guisado/Sopa. 
  *********************************************************************************************
  * * (Definindo o PP - "Private Class Data") - Segundo a definição da Wikipédia: 
  * É um padrão de design em programação de computador usado para 'encapsular atributos' de uma 
  classe para sua manipulação. Ele funciona 'extraindo' uma classe de dados para a classe de 
  destino e fornecendo à instância da classe de destino uma instância da classe de dados extraída.

    - A classe de dados expõe cada atributo (variável ou propriedade) por meio de um 'getter'.
    - A classe de dados expõe cada atributo que deve ser alterado após a construção por meio de 
      um 'configurador'. 

    - Mais informações no link (Em inglês) abaixo: 
      https://en.wikipedia.org/wiki/Private_class_data_pattern#Applicability

  - Obs. Como o professor disse, realmente é difícil achar matrerial dese padrão, apesar de não ser
  uma estratégia 'tão complicada' kkkk (Fazer o que né?).
  *********************************************************************************************
	*/

class Main {
  public static void main(String[] args) {

    System.out.println(" ");
    System.out.println("---------------------------------------------------------------");
    System.out.println("IFCE - Prof.Ronaldo Ramos 🎷 - PP - Private Class Data ");
    System.out.println("---------------------------------------------------------------");
    System.out.println(" ");
    System.out.println("👨‍🍳  ~ \"Quem quer sopa?\"  ");
    System.out.println(" ");

    // Aqui, nossa sopa é 'mutável' como 'classe:'
    Sopa sopa = new Sopa(1, 2, 3, 4);
    sopa.mistura();
    sopa.provar();
    sopa.mistura();
    
    // Aqui, nossa sopa é 'imutável' (Por isso chamei de 'Original') como 'classe:'
    // ( A classe é, também, 'protegida' com o 'PP': Private Class Data )
    SopaOriginal sopaOriginal = new SopaOriginal(2, 4, 3, 6);
    sopaOriginal.mistura();

    System.out.println(" ");
    System.out.println("👨‍🍳  ~ \"Muito Bom!\"  ");

  }
}
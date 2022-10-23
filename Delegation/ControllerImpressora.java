/*
  *********************************************************************************************
  * Nossa classe 'Delegator' que vai delegar as implementações da classe 'Impressora', que são as classes
  * 'ImpressoraHP', 'ImpressoraCanon' e 'ImpressoraEpson'. Isso vai nos garantir duas coisas:
  *
  *  - Quando a implementação real da classe 'Impressora' mudar, a delegação ainda estará operacional.
  *  - O benefício real vai ser observado quando houver mais de uma implementação e elas compartilharem 
  *    de um mesmo controle de delegação.
  *
  */

public class ControllerImpressora implements Impressora {

  private final Impressora impressora;

  public ControllerImpressora(Impressora impressora) {
    this.impressora = impressora;
    
  }

  public void print(String mensagem) {
    impressora.print(mensagem);

  }

}
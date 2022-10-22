/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
	*/

//Classe Builder para construção dos objetos do tipo Carro, por isso chamada de "Montadora"!
public class ConcessionariaDirector {

	protected CarroBuilder montadora;
	 
    public ConcessionariaDirector(CarroBuilder montadora) {
        this.montadora = montadora;
    }
 
    public void construirCarro() {
        montadora.buildPreco();
        montadora.buildAnoDeFabricacao();
        montadora.buildDscMotor();
        montadora.buildModelo();
        montadora.buildMontadora();
    }
 
    public CarroProduct getCarro() {
        return montadora.getCarro();
    }

}
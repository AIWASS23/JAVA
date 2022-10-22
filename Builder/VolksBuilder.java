/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
	*/

//Classe Builder do tipo "Volkswagen" de objeto do tipo Carro, aqui atribúi valores específicos que esse tipo possúi para os atributos da classe que do qual o tipo dela deriva(aqui sendo CarroBuilder.java e CarroProduct.java). Essa classe "Build/Constrói" carros Volkswagen, atribuindo em seus atributos os valores que quero que sejam específicos para objetos do tipo Volkswagen.
public class VolksBuilder extends CarroBuilder {
		@Override
		public void buildPreco() {
			carro.preco = 1000.00;
		}

		@Override
		public void buildDscMotor() {
			carro.dscMotor = "1.0 Flex";
		}

		@Override
		public void buildAnoDeFabricacao() {
			carro.anoDeFabricacao = 2010;
		}

		@Override
		public void buildModelo() {
			carro.modelo = "Gol";
		}

		@Override
		public void buildMontadora() {
			carro.montadora = "VolskWagem";
		}

}
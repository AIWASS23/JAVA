public class FactoryFord extends AbstractFactory {//Classe Factory responsável pela montagem dos modelos de carros(do tipo "Sedan") e picapes da marca Ford.

	@Override
	public Sedan makeSedan(int wheel, boolean diesel, boolean coupe) {

		boolean haveEnoughGTEngine = true; // faz checagem para ver se o modelo de "Sedan" a ser feito é um regular ou com tecnologia "GT". Obs: Um "grã-turismo", ou "GT" é um automóvel de luxo e alto desempenho, projetado para ser dirigido por longas distâncias. O formato mais comum é o cupê de duas portas, com dois lugares ou com a configuração 2+2.

		if (haveEnoughGTEngine)
			return new FordMustang(this, wheel, diesel, coupe, true);
		else
			return new FordMustang(this, wheel, diesel, coupe, false);
	}

	@Override
	public Picape makeTruck(int wheel, boolean diesel, int axles) {
		//As PICAPES são todas do mesmo tipo, diferente dos Sedans que tem duas formas diferentes de montagem.
		return new FordF2500(this, wheel, diesel, axles);
	}

}
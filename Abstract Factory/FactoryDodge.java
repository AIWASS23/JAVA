public class FactoryDodge extends AbstractFactory { //Classe Factory responsável pela montagem dos modelos de carros(do tipo "Sedan") e picapes da marca Dodge.

	@Override
	public Sedan makeSedan(int wheel, boolean diesel, boolean coupe) {
		// some logic // see FactoryFord makseSedan
		return new DodgeChallanger(this, 4, false, false);
	}

	@Override
	public Picape makeTruck(int wheel, boolean diesel, int axles) {
		// some logic // see FactoryFord makseSedan
		return new DodgeRam1500(this, wheel, diesel, axles);
	}

}
public abstract class AbstractFactory { // Nossa principal classe que implementa a ideia do Padrão de Projeto "Abstract Factory", aqui, para os dois tipos base de modelos de carros: Os "Trucks ou Picapes" e os Sedans.

	public abstract Sedan makeSedan(int wheel, boolean diesel, boolean coupe);

	public abstract Picape makeTruck(int wheel, boolean diesel, int axles);

}
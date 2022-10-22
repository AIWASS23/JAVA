public class FactoryProvider { // Verifica qual classe "Factory" será chamada para montar o modelo pedido.

	public static AbstractFactory getFactory(String make) {
		if (make.equalsIgnoreCase("FORD")) { //Caso o modelo seja da Ford.
			return new FactoryFord();
		}
		if (make.equalsIgnoreCase("DODGE")) {//Caso o modelo seja da Dodge.
			return new FactoryDodge();
		}
		return null;
	}

}
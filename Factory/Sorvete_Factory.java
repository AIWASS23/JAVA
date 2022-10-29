
public class Sorvete_Factory {

	public static Sorvete getInstance(String type) {

		switch (type) {

		case "1":
			return new Sorvete_De_Acai();
		case "2":
			return new Sorvete_De_Morango();
		case "3":
			return new Sorvete_De_Chocolate();

		}
		return null;
	}
}

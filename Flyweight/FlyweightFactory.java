
import java.util.ArrayList;

public class FlyweightFactory {

	protected ArrayList<SpriteFlyweight> flyweights;

	public enum Sprites {
		JOGADOR, INIMIGO_1, INIMIGO_2, INIMIGO_3, CENARIO_1, CENARIO_2

	}

	public FlyweightFactory() {
		flyweights = new ArrayList<SpriteFlyweight>();
		flyweights.add(new Sprite("⚡ Mata-Moscas.png"));
		flyweights.add(new Sprite("🦟 Mosca 1.png"));
		flyweights.add(new Sprite("🦟 Mosca 2.png"));
		flyweights.add(new Sprite("🦟 Mosca 3.png"));
		flyweights.add(new Sprite("🏠 Cenario1.png"));
		flyweights.add(new Sprite("🏙️ Cenario2.png"));

	}

	public SpriteFlyweight getFlyweight(Sprites jogador) {
		switch (jogador) {
		case JOGADOR:
			return flyweights.get(0);

		case INIMIGO_1:
			return flyweights.get(1);

		case INIMIGO_2:
			return flyweights.get(2);

		case INIMIGO_3:
			return flyweights.get(3);

		case CENARIO_1:
			return flyweights.get(4);

		default:
			return flyweights.get(5);

		}

	}

}
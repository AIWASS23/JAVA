
// Nossa classe decorator que vai fazer essa "junção" das características de objetos
public abstract class CoquetelDecorator extends Coquetel {
	Coquetel coquetel;

	public CoquetelDecorator(Coquetel umCoquetel) {
		coquetel = umCoquetel;
	}

	@Override
	public String getNome() {
		return coquetel.getNome() + " + " + nome;
	}

	public Double getPreco() {
		return coquetel.getPreco() + preco;
	}
}
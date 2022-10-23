
//Por ser do tipo da classe decorator podemos juntá-la a uma outra classe de tipo igual e convergir seus atributos na mesma!
public class Refrigerante extends CoquetelDecorator {

	public Refrigerante(Coquetel umCoquetel) {

		super(umCoquetel);
		nome = "🍹 Refrigerante";
		preco = 1.0;

	}

}
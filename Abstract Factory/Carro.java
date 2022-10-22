
public abstract class Carro {

	public int num_Rodas;
	public boolean vem_com_diesel;

	public Carro(int rodas, boolean diesel) {
		this.num_Rodas = rodas;
		this.vem_com_diesel = diesel;
	}

	abstract String getName();

}
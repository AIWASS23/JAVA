 /*
  *
  * - É a interface dos objetos que controlam a aquisição e a liberação dos Produtos.
  * - @param <T>
  *
  */

public interface Pool<T> {
	T adquirir();

	void liberar(T t);
}
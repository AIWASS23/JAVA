/*
  *
  * É a 'implementação particular' de um Pool que gerencia um Produto específico: Aqui o 'produto' são os funcionários que criamos e inserimos nesse 'pool'
  * 
*/

import java.util.ArrayList;
import java.util.List;


public class FuncionarioPool implements Pool<Funcionario> {
  
	private List<Funcionario> funcionarios;

  //Aonde inserimos os funcionários que irão ser printados na nossa saída de testes na main!
	public FuncionarioPool() {
		this.funcionarios = new ArrayList<Funcionario>();
		this.funcionarios.add(new Funcionario("👨‍💼   Marcelo Martins"));
		this.funcionarios.add(new Funcionario("👨‍💼   Rafael Cosentino"));
		this.funcionarios.add(new Funcionario("👨‍💼   Jonas Hirata"));

	}

	public Funcionario adquirir() {

		if (this.funcionarios.size() > 0) {
			return this.funcionarios.remove(0);

		} else {
			return null;
		}

	}

	public void liberar(Funcionario funcionario) {
		this.funcionarios.add(funcionario);

	}

}
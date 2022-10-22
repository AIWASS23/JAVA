/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
	*/

public class BancoProxy extends BancoUsuarios {

	protected String usuario, senha;

	public BancoProxy(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;

	}

	@Override
	public String getNumeroDeUsuarios() {

		if (temPermissaoDeAcesso()) {
			return super.getNumeroDeUsuarios();

		}else{
      return "   *⚠️  Acesso negado, senha incorreta";

    }

		//return null;

	}

	@Override
	public String getUsuariosConectados() {

		if (temPermissaoDeAcesso()) {
			return super.getUsuariosConectados();

		}else{
      return "   *⚠️  Acesso negado, usuário desconhecido"; 

    }

		//return null;

	}

  //Por isso nosso exemplo com o 'hacker' dá null!
	private boolean temPermissaoDeAcesso() {
		return usuario == "admin" && senha == "admin";

	}

}
/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
	*/

public class BancoUsuarios {

	private int quantidadeDeUsuarios;
	private int usuariosConectados;

	public BancoUsuarios() {
    //Uso random aqui só pra facilitar as coisas rsrsrsrs.
		quantidadeDeUsuarios = (int) (Math.random() * 100); 
		usuariosConectados = (int) (Math.random() * 10);

	}

	public String getNumeroDeUsuarios() {
		return new String("   ->Total de usuários: " + quantidadeDeUsuarios);

	}

	public String getUsuariosConectados() {
		return new String("   ->Usuários conectados: " + usuariosConectados);

	}

}
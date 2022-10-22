/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
*/

public class Pega_Infos_do_Usuario_qComentou_No_Post_Observer implements AdministraEmails_Observer {

	public void update(Comentario_Post dados) {
		//Pegar informaçoes do usuario que comentou em 'Comentario_Post dados'
		
		//Envia email para o usuario que comentou
		this.send(dados, null); //Segundo paranmetro é um lista com o email do usuario que comentou
	}

	public void send(Comentario_Post dados, String[] emails) {

    System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		System.out.println("[ Pega_Infos_do_Usuario_qComentou_No_Post_Observer - 👀 ]:  📨 Email enviado para o usuario que comentou.");

	}

}

public class Pega_Infos_do_Autor_do_Post_Observer implements AdministraEmails_Observer {

	public void update(Comentario_Post dados) {
		//Pegar informaçoes do autor do post que foi comentado em 'Comentario_Post dados'
		
		//Envia email para o usuario que comentou
		this.send(dados, null); //Segundo paranmetro é o email do autor do post que foi comentado
	}

	public void send(Comentario_Post dados, String[] emails) {

    System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		System.out.println("[ Pega_Infos_do_Autor_do_Post_Observer - 👀 ]: 📨  Email enviado para o autor do post comentado.");

	}

}
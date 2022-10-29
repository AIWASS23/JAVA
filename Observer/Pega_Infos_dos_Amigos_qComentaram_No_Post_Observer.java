
public class Pega_Infos_dos_Amigos_qComentaram_No_Post_Observer implements AdministraEmails_Observer {

	public void update(Comentario_Post dados) {	
		//Pegar informaçoes dos amigos do usuario que comentou em 'Comentario_Post dados'
		
		//Envia email para amigos do usuario que comentou
		this.send(dados, null); //lista de email de amigos no segundo paranmetro
	}

	public void send(Comentario_Post dados, String[] emails) {

    System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		System.out.println("[ Pega_Infos_dos_Amigos_qComentaram_No_Post_Observer - 👀 ]:  📨 Email enviado para os amigos do usuario que comentou.");
    System.out.println("-----------------------------------------------------------------------------------------------------------------------");

	}

}
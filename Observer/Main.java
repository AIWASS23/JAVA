/*
  * *Comentários: Código implementando o PP do tipo "Observer" com um exemplo de um sistema de
  *  admnistração de comentários simples, que ao receber uma "entrada" do usuário, aqui retra-
  *  tado como um comentário, notifica 3 "classes Observers" que ficam monitoram essas entradas
  *  de usuários no sistema para depois baseado em se houver ou não novas entradas executarem
  *  suas respectivas funções, no caso optei por "enviarem emails/notificações" a cada tipo
  *  específico de usuário que comentar um post, aqui dividi em 3 tipos, usuários quaisquer(terceiros)
  *  , amigos do dono do post e o próprio autor do post.
*/

public class Main {

	public static void main(String[] args) {
		
		//Testando a rotina dos 'observers' que implementamos nesse padrão:
		
		Admnistra_Comentarios_Post comentario = new Admnistra_Comentarios_Post();
		
		comentario.addObserver(new Pega_Infos_do_Autor_do_Post_Observer());
		comentario.addObserver(new Pega_Infos_do_Usuario_qComentou_No_Post_Observer());
		comentario.addObserver(new Pega_Infos_dos_Amigos_qComentaram_No_Post_Observer());
		
    System.out.println("----------------------------------------------------------------------------------- \n");
    System.out.println(" Observer \n");
    System.out.println("----------------------------------------------------------------------------------- \n");

		Comentario_Post dados_do_comentario = new Comentario_Post(1, 3, 50, "Assistindo");
		
		comentario.postComment(dados_do_comentario);
		
	}

}

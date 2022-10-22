/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
*/

import java.util.ArrayList;

public class Admnistra_Comentarios_Post {
	
	protected ArrayList<AdministraEmails_Observer> observers;
	
	public Admnistra_Comentarios_Post() {
		this.observers = new ArrayList<AdministraEmails_Observer>();
	}
	
	public void postComment(Comentario_Post dados){
		
		//Essa função enviaria um comentário num post, mas aqui, tratando-se de uma simples simulação desse Padrão de Projeto, representamos tal evento como um 'System.out.println()':
		System.out.println("Novo comentario encontrado no Post: '"+dados.getCommentText()+"'\n");
		
		//Abaixo,chama-se a notificação da execução desta função/evento:
		this.notifyObservers(dados);
	}
	
	public void addObserver(AdministraEmails_Observer obs){
		this.observers.add(obs);
	}
	
	public void rmvObserver(AdministraEmails_Observer obs){
		this.observers.remove(obs);
	}
	
	private void notifyObservers(Comentario_Post dados){
		if(this.observers.size() > 0){
      System.out.println("-----------------------------------------------------------------------------------------------------------------------\n");
			System.out.println("📶  Notificando os 'observers'...");
			for(int i = 0; i < this.observers.size(); i++){
				//Atualiza todos os observadores adicionandos nesta classe
				this.observers.get(i).update(dados);
			}
		}else{
			//Colocando esse 'Else' apenas para que os Deuses das boas práticas de programação e do Debugging não me matem kkkkk:
      System.out.println("-----------------------------------------------------------------------------------------------------------------------\n");
			System.out.println("Nenhum 'observer' foi achado");
		}
		
	}
	
}
/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
                             
    *Comentário:
  
    * Abaixo, códigos de basicamente TUDO que compõem nossa classe 'principal' de 'dados', por  
    * assim dizer, que é o comentário(e alguns dos elementos que o formam) de um determinado
    * 'Post'.
  
  *********************************************************************************************
  */

public class Comentario_Post {
	
	private int autorId;
	private int postId;
	private int commenter;
	private  String commentText;
	

	public Comentario_Post(int autorId, int postId, int commenter, String commentText) {
		this.autorId = autorId;
		this.postId = postId;
		this.commenter = commenter;
		this.commentText = commentText;
	}
	
	public int getAutorId() {
		return autorId;
	}
	public void setAutorId(int autorId) {
		this.autorId = autorId;
	}
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public int getCommenter() {
		return commenter;
	}
	public void setCommenter(int commenter) {
		this.commenter = commenter;
	}
	public String getCommentText() {
		return commentText;
	}
	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}
	
}
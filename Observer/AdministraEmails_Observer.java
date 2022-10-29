
public interface AdministraEmails_Observer {

	public void update(Comentario_Post dados);
	public void send(Comentario_Post dados, String[] emails);

}

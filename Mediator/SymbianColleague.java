
public class SymbianColleague extends Colleague {

	public SymbianColleague(Mediator m) {
		super(m);
	}

	@Override
	public void receberMensagem(String mensagem) {
		System.out.println("📱🔔  Symbian recebeu: " + mensagem);
	}

}
// Classe RuntimeException (tratamento opicional de exceções)

package boardgame;

public class BoardException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public BoardException(String msg) {
//		repassa a mensagem para o construtor da super classe "RuntimeException"
		super(msg);
	}
}
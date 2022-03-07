package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

//	Uso interno na camada de tabuleiro "Boardgame"
	protected Board getBoard() {
		return board;
	}
	
}

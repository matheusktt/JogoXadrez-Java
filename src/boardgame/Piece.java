package boardgame;

public abstract class Piece {

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

	public abstract boolean[][] possibleMoves();

//	recebe uma posição e retorna se é possível mover a peça
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}

//	Operação que verifica se existe pelo menos 1 movimento para a peça
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}
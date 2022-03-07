package boardgame;

public class Board {

	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	public Piece piece(int row, int columns) {
		return pieces[row][columns];
	}
	
//	sobrecarga do método retornando as peças pela posições
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	
//	atribuir a matriz a peça que está no argumento no método
	public void placePice(Piece piece, Position position) {
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
}
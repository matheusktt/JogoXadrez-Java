package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {

	private Color color;

//	Construtor da superclasse Piece
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}

//	Fun��o ser� reaproveitada pelo pacote e subclasses
//	Verifica a cor da pe�a � diferente da pe�a selecionada
	protected boolean isThereOpponentPiece(Position position) {
//		Downcasting para ChessPiece
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null && p.getColor() != color;
	}
}
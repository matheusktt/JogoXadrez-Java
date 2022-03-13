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

//	Função será reaproveitada pelo pacote e subclasses
//	Verifica a cor da peça é diferente da peça selecionada
	protected boolean isThereOpponentPiece(Position position) {
//		Downcasting para ChessPiece
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null && p.getColor() != color;
	}
}
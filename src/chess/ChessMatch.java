//	Classe respons�vel pelas regras do jogo

package chess;

import boardgame.Board;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
//	Dimens�o do tabuleiro
		board = new Board(8,8);
		initialSetup();
	}
	
//	Retorna a matriz das pe�as correspondentes da partida
	public ChessPiece[][] getPieces() {
		
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		
//		percorre a matriz de pe�a do tabuleiro e para cada pe�a faz um dowcasting para ChessPiece
		for (int i=0; i<board.getRows(); i++) {
			for (int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePice(piece, new ChessPosition(column, row).toPosition());
	}
	
//	Inicia as pe�as na posi��o padr�o da partida
	private void initialSetup() {
		placeNewPiece('b', 6, new Rook(board, Color.WHITE));
		placeNewPiece('e', 8, new King(board, Color.BLACK));
		placeNewPiece('e', 1, new King(board, Color.WHITE));
	}
}
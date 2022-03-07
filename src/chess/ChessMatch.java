//	Classe responsável pelas regras do jogo

package chess;

import boardgame.Board;

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
//	Dimensão do tabuleiro
		board = new Board(8,8);
	}
	
//	Retorna a matriz das peças correspondentes da partida
	public ChessPiece[][] getPieces() {
		
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		
//		percorre a matriz de peça do tabuleiro e para cada peça faz um dowcasting para ChessPiece
		for (int i=0; i<board.getRows(); i++) {
			for (int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
}
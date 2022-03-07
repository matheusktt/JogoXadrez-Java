//	Classe respons�vel pelas regras do jogo

package chess;

import boardgame.Board;

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
//	Dimens�o do tabuleiro
		board = new Board(8,8);
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
}
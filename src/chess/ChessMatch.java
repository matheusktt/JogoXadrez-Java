//	Classe responsável pelas regras do jogo

package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
//	Dimensão do tabuleiro
		board = new Board(8,8);
		initialSetup();
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
	
//	Inicia as peças na posição padrão da partida
	private void initialSetup() {
		board.placePice(new Rook(board, Color.WHITE), new Position(2, 1));
		board.placePice(new King(board, Color.WHITE), new Position(7, 4));
		board.placePice(new King(board, Color.BLACK), new Position(0, 4));
	}
}
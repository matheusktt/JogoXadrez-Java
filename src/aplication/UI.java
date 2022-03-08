//Interface do tabuleiro

package aplication;

import chess.ChessPiece;

public class UI {

//	percorrer linhas e colunas
	public static void printBoard(ChessPiece[][] pieces) {
//		linhas
		for (int i=0; i<pieces.length; i++) {
			System.out.print((8 - i) + " ");
			for (int j=0; j<pieces.length; j++) {
//				peças
				printPiece(pieces[i][j]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}
	
//	Imprimir uma peça
	private static void printPiece(ChessPiece piece) {
		if (piece == null) {
			System.out.print("-");
		}
		else {
			System.out.print(piece);
		}
		System.out.print(" ");
	}
}

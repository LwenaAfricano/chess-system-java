package chess;

import boardGame.Board;

public class ChessMatch {

	private Board board;
	private int turn;
	
	public ChessMatch() {
		board = new Board(8, 8);
	}
	
	//metodo que retorna uma matriz de peças correspondente a cada partida
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for(int i=0; i<board.getRows(); i++) {
			for(int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	
	
	
	
	
	
}

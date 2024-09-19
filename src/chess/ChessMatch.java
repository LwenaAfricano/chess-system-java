package chess;

import boardGame.Board;
import boardGame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {

	private Board board;
	private int turn;
	
	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
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
	
	//iniciar a partida de chess colocando as peças no taboleiro
	private void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(3, 2));
		board.placePiece(new King(board, Color.BLACK), new Position(1, 4));
		board.placePiece(new King(board, Color.WHITE), new Position(7, 4));
		

	}
	
	
	
	
}

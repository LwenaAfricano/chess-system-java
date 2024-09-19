package boardGame;

public class Piece {

	protected Position position;
	
	private Board board;

	public Piece(Board board) {
		super();
		this.board = board;
		position = null;//por padrão já é null
	}

	protected Board getBoard() {
		return board;
	}

	
	
	
	
}

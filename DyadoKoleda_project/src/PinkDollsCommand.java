
public class PinkDollsCommand implements Command{

	public PinkDollsCommand(Board board) {
		super();
		this.board = board;
	}

	private Board board;
	
	@Override
	public void execute() {
		this.board.IWantPinkDolls();
		
	}

}

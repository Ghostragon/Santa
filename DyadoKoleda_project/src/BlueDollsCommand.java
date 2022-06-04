
public class BlueDollsCommand implements Command{

	public BlueDollsCommand(Board board) {
		super();
		this.board = board;
	}

	private Board board;
	
	@Override
	public void execute() {
		this.board.IWantBlueDolls();
		
	}

}

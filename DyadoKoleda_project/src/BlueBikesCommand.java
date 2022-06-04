
public class BlueBikesCommand implements Command {

	private Board board;
	
	public BlueBikesCommand(Board board) {
		super();
		this.board = board;
	}

	@Override
	public void execute() {
		this.board.IWantBlueBikes();
	}

}

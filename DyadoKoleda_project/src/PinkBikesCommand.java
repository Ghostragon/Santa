
public class PinkBikesCommand implements Command {

	private Board board;
	
	public PinkBikesCommand(Board board) {
		super();
		this.board = board;
	}

	@Override
	public void execute() {
		this.board.IWantPinkBikes();
	}

}

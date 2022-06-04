import java.util.ArrayList;

public class Elf implements Observer{


	private String name;
	private Observable board;

	public Elf(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		if(this.board == null) {
			System.out.println("No toy set");
			return;
		}
		ArrayList<String> lastToy = this.board.getUpdate();
		System.out.println(this.name + " will make a: " + lastToy.get(0) + " " + lastToy.get(1));
	}

	@Override
	public void setBoard(Observable board) {
		this.board = board;
	}
	

}

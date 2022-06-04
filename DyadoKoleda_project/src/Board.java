import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Board implements Observable{
	
	private String toysToMake;
	private List<Observer> observers;
	private String toy;
	private String color;
	
	public Board() {
		this.observers = new ArrayList<>();
	}
	
	public void IWantPinkDolls() {
		System.out.println("On the board appears the words Pink Doll!");
		toysToMake = "Doll";
	}
	
	public void IWantPinkBikes() {
		System.out.println("On the board appears the words Pink Bike!");
		toysToMake = "Bike";
	}
	
	public void IWantBlueDolls() {
		System.out.println("On the board appears the words Blue Doll!");
		toysToMake = "Doll";
	}
	
	public void IWantBlueBikes() {
		System.out.println("On the board appears the words Blue Bike!");
		toysToMake = "Bike";
	}

	

	@Override
	public void subscribe(Observer observer) {
		this.observers.add(observer);
		observer.setBoard(this);
	}

	@Override
	public void unsubscribe(Observer observer) {
		this.observers.remove(observer);
		observer.setBoard(null);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer: this.observers) {
			observer.update();
		}
	}

	@Override
	public ArrayList<String> getUpdate() {
		return new ArrayList<>(Arrays.asList(this.color, this.toy));
	}

	public void setToy(String color, String toy) {
		this.toy = toy;
		this.color=color;
		this.notifyObservers();
	}
}

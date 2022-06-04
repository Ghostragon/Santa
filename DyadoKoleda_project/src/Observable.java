import java.util.ArrayList;

public interface Observable {
	
	void subscribe(Observer observer);
	void unsubscribe(Observer observer);
	
	void notifyObservers();
	ArrayList<String> getUpdate();
}

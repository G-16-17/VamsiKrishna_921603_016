package observer_Pattern;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher extends Subject {

	private List<Observer> observers = new ArrayList<>();

	@Override
	public void attach(Observer ob) {
		observers.add(ob);
	}

	@Override
	public void detach(Observer ob) {
		observers.remove(ob);
	}

	@Override
	public void notifyUpdate(Message msg) {
		for (Observer ob : observers) {
			ob.update(msg);
		}
	}
}
package observer_Pattern;

public abstract class Subject {

	private int state;

	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
		notifyUpdate(new Message("state changed"));
	}
	public abstract void attach(Observer ob);
	public abstract void detach(Observer ob);
	public abstract void notifyUpdate(Message msg);

}
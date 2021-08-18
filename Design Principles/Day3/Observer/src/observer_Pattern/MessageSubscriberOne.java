package observer_Pattern;

public class MessageSubscriberOne implements Observer {

	@Override
	public void update(Message msg) {
		System.out.println("MessageSubscriberOne :: " + msg.getMessageContent());
	}

}
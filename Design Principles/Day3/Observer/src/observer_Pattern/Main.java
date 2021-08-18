package observer_Pattern;

public class Main {

	public static void main(String[] args)

	{

		MessageSubscriberOne s1 = new MessageSubscriberOne();
		MessageSubscriberTwo s2 = new MessageSubscriberTwo();
		MessageSubscriberThree s3 = new MessageSubscriberThree();
		Subject p = new MessagePublisher();
		p.attach(s1);
		p.attach(s2);
		p.setState(10);
		p.notifyUpdate(new Message("First Message")); 
		p.detach(s1);	
		p.attach(s3);	
		p.setState(15);
		p.notifyUpdate(new Message("Second Message"));
	}
}
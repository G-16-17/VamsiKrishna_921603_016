package mediator_Pattern;

public class Client {
	
	public static void main(String[] args) {
		ChatMediator chatMediator=new ChatMediator();
		BasicUser basicuser=new BasicUser("rohith", chatMediator);
		
		PremiumUser premiumuser =new PremiumUser("vidhya", chatMediator);
		
		PremiumUser premiumuser1=new PremiumUser("koti", chatMediator);

		
		chatMediator.AddUser(premiumuser);
		
		chatMediator.AddUser(premiumuser1);
		
		String name=basicuser.getName();
		
		basicuser.SendMessage(name, "Hello Everyone");
	}
}

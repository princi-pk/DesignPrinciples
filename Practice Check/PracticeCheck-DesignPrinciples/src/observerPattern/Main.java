package observerPattern;

public class Main {

	public static void main(String[] args) {
		
		SteveObserver steve=new SteveObserver();
		JohnObserver john=new JohnObserver();
		
		INotificationService ins=new NotificationService();
		ins.addSubscriber(steve);
		ins.addSubscriber(john);
		ins.notifySubscriber();
		ins.removeSubscriber(john);
		
	}

}

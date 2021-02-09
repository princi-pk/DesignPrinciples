package observerPattern;

public class JohnObserver implements INotificationObserver {
	
	String name="John";
	
	@Override
	public void onServerDown() {
		System.out.println(name+ ": Notification has been received");
	}
	
	public String toString() {
		return name;
	}

}

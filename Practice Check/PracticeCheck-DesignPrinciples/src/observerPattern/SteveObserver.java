package observerPattern;

public class SteveObserver implements INotificationObserver {
	
	String name="Steve";
	
	@Override
	public void onServerDown() {
		System.out.println(name+ ": Notification has been received");
	}
	
	public String toString() {
		return name;
	}
}

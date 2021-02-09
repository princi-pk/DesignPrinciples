package observerPattern;

public class AdminObserver implements INotificationObserver {
	
	String name;
	
	@Override
	public void displayNotification() {
		System.out.println(name+": Notification received!!");
	}

	public AdminObserver(String name) {
		super();
		this.name = name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	

}

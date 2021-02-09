package observerPattern;

public class Main {

	public static void main(String[] args) {
		
		AdminObserver admin1=new AdminObserver("Princi");
		AdminObserver admin2=new AdminObserver("Pulkit");
		AdminObserver admin3=new AdminObserver("Pramod");
		AdminObserver admin4=new AdminObserver("Pallavi");
		
		INotificationService ins=new NotificationService();
		
		ins.addSubscriber(admin1);
		ins.addSubscriber(admin2);
		ins.addSubscriber(admin3);
		ins.addSubscriber(admin4);

		ins.removeSubscriber(admin4);
		
		ins.notifySubscriber(150);
		
	}

}

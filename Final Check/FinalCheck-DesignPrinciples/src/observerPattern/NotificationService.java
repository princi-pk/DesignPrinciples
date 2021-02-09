package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements INotificationService {

	List<INotificationObserver> list=new ArrayList<INotificationObserver>();
		
	@Override
	public void addSubscriber(INotificationObserver ino) {
		list.add(ino);
		System.out.println("List of subscribers");
		for(INotificationObserver subscriber:list) {
			System.out.println(subscriber.getName());
		}
	}

	@Override
	public void removeSubscriber(INotificationObserver ino) {
		list.remove(ino);
		System.out.println("List of subscribers");
		for(INotificationObserver subscriber:list) {
			System.out.println(subscriber.getName());
		}
	}

	@Override
	public void notifySubscriber(int count_of_tickets) {
		if(count_of_tickets>=100) {
			for(INotificationObserver subscriber:list) {
				subscriber.displayNotification();
			}
		}
	}

}

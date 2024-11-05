package factory_design_pattern;

public class SmsNotification implements Notification {

	@Override
	public void getNotification() {
		System.out.println("SMS Notification");

	}

}

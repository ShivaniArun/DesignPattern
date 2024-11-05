package factory_design_pattern;

public class FactoryClass {

	public Notification getNotification(String type) {
		switch(type) {
			case "SMS" :
				return new SmsNotification();
			case "Email":
				return new EmailNotification();
			default:
				return new PushNotification();
		}
	}
}

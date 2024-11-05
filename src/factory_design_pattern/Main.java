package factory_design_pattern;

public class Main {

	public static void main(String[] args) {
		Notification notification;
		
		FactoryClass factoryClass = new FactoryClass();
		//Sms notification
		notification = factoryClass.getNotification("SMS");
		notification.getNotification();
		
		//Email Notification
		notification = factoryClass.getNotification("Email");
		notification.getNotification();
		
		//PushNotication
		notification = factoryClass.getNotification("");
		notification.getNotification();
	}

}

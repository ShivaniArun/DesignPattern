package factory_design_pattern;

public class EmailNotification implements Notification {

	@Override
	public void getNotification() {
		System.out.println("Email Notification");
	}

}

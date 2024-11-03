package facade_design_pattern;

public class OrderFacade {

	Product product;
	Payment payment;
	Notification notification;

	public OrderFacade() {
		this.product = new Product();
		this.payment = new Payment();
		this.notification = new Notification();
	}

	public void createOrder() {
		System.out.println(product.getProduct());
		payment.isPaymentDone(true);
		notification.getNotification();
	}
}

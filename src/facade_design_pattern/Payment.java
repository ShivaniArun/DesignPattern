package facade_design_pattern;

public class Payment {

	public boolean isPaymentDone(boolean paymentStatus) {
		if(paymentStatus) return true;
		return false;
	}
}

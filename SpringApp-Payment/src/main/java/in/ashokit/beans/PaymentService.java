package in.ashokit.beans;

public class PaymentService {
	
	private IPayment payment;
	
	
	public PaymentService() {
		System.out.println("PaymentService constructor is created...");
	}

	public PaymentService (IPayment payment) {
		System.out.println("constructor method");
		this.payment = payment;
	}
	
	public void setPayment(IPayment payment) {
		System.out.println("setter method");
		this.payment= payment;
	}
	
	public void doPayment (double billAmnt) {
		
		boolean status = payment.processPayment(billAmnt);
		
		if (status) {
			System.out.println("receipt printing...");
		}
		else {
			System.out.println("card declined...");
		}
	}
}

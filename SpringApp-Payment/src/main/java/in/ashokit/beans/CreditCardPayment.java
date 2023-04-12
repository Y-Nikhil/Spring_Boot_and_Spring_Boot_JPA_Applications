package in.ashokit.beans;

public class CreditCardPayment implements IPayment{

	public CreditCardPayment() {
		System.out.println("CreditCardPayment constructor is created...");
	}
	public boolean processPayment(double billAmnt) {
		System.out.println("Credit Card Payment is successful...");
		return true;
	}

}

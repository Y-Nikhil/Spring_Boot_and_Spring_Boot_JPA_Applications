package in.ashokit.beans;

public class DebitCardPayment implements IPayment{
	
	public DebitCardPayment() {
		System.out.println("DebitCardPayment constructor is created...");
	}

	public boolean processPayment(double billAmnt) {
		System.out.println("Debit card Payment successful..");
		return true;
	}

}

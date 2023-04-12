package in.injection;

public class DieselEngine implements IEngine{

	
	public int start() {
		System.out.println("Diesel Engine started...");
		return 1;
	}
}

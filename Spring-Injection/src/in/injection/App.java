package in.injection;

public class App {

	public static void main(String[] args) {
		/*car c = new car(new DieselEngien());
		c.drive();
		*/
		
		/*car c = new car();
		c.setEng(new DieselEngine());
		c.drive();
		*/
		
		car c = new car();
		c.eng = new DieselEngine();
		c.drive();
	}
}

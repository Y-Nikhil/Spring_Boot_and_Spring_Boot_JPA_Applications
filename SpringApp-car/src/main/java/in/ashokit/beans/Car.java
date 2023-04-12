package in.ashokit.beans;

public class Car {

	private IEngine engine;
	
	public Car() {
		System.out.println("car constructor..");
	}
	
	public Car( IEngine engine) {
		System.out.println("method :: Constructor");
		this.engine=engine;
	}
	
	public void setEngine(IEngine engine) {
		System.out.println("method :: setter");
		this.engine= engine;
	}
	
	public void drive() {
		
		int status = engine.start();
		
		if (status >= 1) {
			System.out.println("Journey started...");
		}else {
			System.out.println("Engine trouble.");
		}
	}
}

package in.injection;

public class car {
	
	//private IEngine eng;
	
	/*public car(IEngine eng) {
		this.eng=eng;
	}*/
	
	/*public void setEng(IEngine eng) {
		this.eng=eng;
	}*/
	
	IEngine eng;

	public void drive() {
		
		int status = eng.start();
		
			if ( status >= 1) {
				System.out.println("Journey started...");
			}
			else {
				System.out.println("Engine Trouble...");
			}

			}
}

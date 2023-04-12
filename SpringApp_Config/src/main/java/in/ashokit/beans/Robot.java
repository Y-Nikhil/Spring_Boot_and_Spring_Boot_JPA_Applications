package in.ashokit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Robot {
	
	@Autowired
	public Chip chip;
	
	public Robot() {
		System.out.println("Robot :: Constructor"); 
	}
	
	public void doWork() {
		String type= chip.chipType();
		if(type.equals("32-Bit")) {
			System.out.println("perform is slow...");
		}
	}
}

package in.ashokit.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Car c = context.getBean(Car.class);
		
		c.drive();
	}
}

package in.ashokit.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	
	UserService bean = context.getBean(UserService.class);
	
	bean.printName(1);
	
	}
}

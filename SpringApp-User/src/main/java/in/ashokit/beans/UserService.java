package in.ashokit.beans;


public class UserService {
	
	private UserDAO dao;
	
	public UserService() {
		System.out.println("constructor created");
	}
	
	
	public void setDao(UserDAO dao) {
		System.out.println("method :: set");
		this.dao=dao;
	}
	
	public void printName(int id) {
		
		String name = dao.findName();
		
		System.out.println(name);
	}
}

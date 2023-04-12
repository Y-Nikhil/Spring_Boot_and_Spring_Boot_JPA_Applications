package in.ashokit.beans;

public class UserDAOImpl implements UserDAO{

	public UserDAOImpl() {
		System.out.println("Constructor created.");
	}
	
	public String findName() {
		String s = "Oracle/ MySql";
		return s;
	}

}

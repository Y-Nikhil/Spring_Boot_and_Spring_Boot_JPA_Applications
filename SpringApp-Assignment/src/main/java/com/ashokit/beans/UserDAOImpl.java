package com.ashokit.beans;

import javax.sql.DataSource;

public class UserDAOImpl implements UserDAO{
	
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public boolean save() {
	
		
	return false;
}

}

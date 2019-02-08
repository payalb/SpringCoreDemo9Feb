package com.java;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

public class ConnectionPool {

	public BasicDataSource getConnectionPool() {
		BasicDataSource ds= new BasicDataSource();
		ds.setUrl("");
		ds.setUsername("");
		return ds;
	}
}//ds.getConnection();: instance factory method in BasicDataSource class

//factory method. Returns object of diff class
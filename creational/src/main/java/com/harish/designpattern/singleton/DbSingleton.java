package com.harish.designpattern.singleton;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbSingleton {
	
	private Connection conn=null;
	
	private static class LazyLoader {
		static final DbSingleton INSTANCE = new DbSingleton();  
	}

	private DbSingleton() {
		try {
			String jdbcUrl = "jdbc:h2:mem:test";
			conn = DriverManager.getConnection(jdbcUrl);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static DbSingleton getInstance() {
		return LazyLoader.INSTANCE;
	}
	
	public Connection getConnection() {
		return conn;
	}
	

}

package com.harish.designpattern.singleton;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbSingletonDemo {

	public static void main(String[] args) {
		
		DbSingleton dbSingleton = DbSingleton.getInstance();
		
		Connection connection = dbSingleton.getConnection();
		
		try {
			Statement statement = connection.createStatement();
			statement.execute("create table employee(id int primary key, name varchar(45))");
			
			System.out.println("Created employee table");
			
			statement.execute("insert into employee(id, name) values(1,'Harish')");
			
			System.out.println("Inserted employee record");
			
			PreparedStatement preparedStatement = connection.prepareStatement("select * from employee where id=?");
			preparedStatement.setInt(1, 1);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				
				System.out.println("Employee details:"+resultSet.getInt("id") +" "+resultSet.getString("name"));
				
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

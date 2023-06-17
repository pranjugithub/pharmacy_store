package com.pharmacystore.connection;

public interface DbDetails {

	String CONSTR = "jdbc:mysql://localhost:3306//11thfebadv?useSSL=false"
			+ "pharmacystoredb";
	String USERNAME = "root";
	String PASSWORD = "SOORTHAT";
	String DBDRIVER = "com.mysql.cj.jdbc.Driver";
}
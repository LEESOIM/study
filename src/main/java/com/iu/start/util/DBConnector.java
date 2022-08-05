package com.iu.start.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnector {
	
	//getConnection
	public static Connection getConnection() throws Exception {
		
		//1. 로그인 정보
		//ID, PW, URL, DRIVER
		String user = "hr";
		String password = "hr";
		String url = "jdbc:oracle:thin:@192.168.7.38:1521:xe"; //127.0.0.1 , localhost
		String driver = "oracle.jdbc.OracleDriver";
		
		//2. Driver 메모리에 로딩
		Class.forName(driver);
		
		//3. Connection 객체 연결
		Connection con = DriverManager.getConnection(url, user, password);
		
		return con;
	}
	
	
	
	public static void disConnect(ResultSet rs, PreparedStatement st, Connection con) {
		try { //역순으로 자원 해제
			rs.close();
			st.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void disConnect(PreparedStatement st, Connection con) {
		try {
			st.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

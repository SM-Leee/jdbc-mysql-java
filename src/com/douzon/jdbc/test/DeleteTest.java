package com.douzon.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteTest {

	public static void main(String[] args) {
		boolean result = delete("마음이3");
		System.out.println(result);

	}


	public static boolean delete(String name) {
		boolean result = false;
		Connection conn = null;
		Statement stmt = null;

		try {
			// 1. JDBC Driver(MYSQL) 로딩
			Class.forName("com.mysql.jdbc.Driver");
			//pripertiy -> build path를 등록해줘야된다.

			// 2. 연결하기 ( jdbc:연결할database://ip:port/database이름 ) port번호는 생략가능하다.
			// url과 id와 password를 같이 입력해준다. (Connection 객체 얻어오기)
			String url = "jdbc:mysql://localhost:3306/webdb";
			conn = DriverManager.getConnection(url,"webdb","webdb");

			// 3. Statement 객체를 생성
			stmt = conn.createStatement();

			// 4. SQL문 실행
			String sql = "delete from pet where name = '"+name+"'";
			int count = stmt.executeUpdate(sql);

			result = count >= 1;

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패:"+e);
		} catch (SQLException e) {
			System.out.println("error:"+e);
		} finally {
			try {
				if(stmt != null) {
					stmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
}

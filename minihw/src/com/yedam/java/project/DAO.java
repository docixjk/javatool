package com.yedam.java.project;

import java.sql.*;
import java.util.*;

public class DAO {
	// db와 연결
		Connection conn;

		// java에서 sql문을 처리하기 위한 것
		Statement stmt = null;

		// 파라미터를 읽기 위해
		PreparedStatement psmt = null;

		// sql문을 처리한 값을 불러오기 위한 것
		ResultSet rs = null;

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "dev";
		String pass = "dev";

		// db와 연결 시킴
		public void connect() {
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection(url, user, pass);
			} catch (ClassNotFoundException | SQLException e) {
				System.out.println("error");
				e.printStackTrace();
			}
		}

		// Create , Read , Update , Delete
		String[] sql = { "SELECT * FROM users", 
				"SELECT * FROM users WHERE user_phone=?",
				"INSERT INTO users (user_phone) VALUES ()",
				"UPDATE users SET salary= ? WHERE employee_id = ?", "DELETE FROM emp_temp WHERE employee_id = ?" };

		public List<Value> empVolist() { // 클래스를 하나 만들어야됨
			connect();
			List<Value> list = new ArrayList<>();
			try {
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql[0]);
				while (rs.next()) {
					Value emp = new Value();
					// setEmployeeId의 setter를 사용
					emp.setPhone(rs.getString("phone"));
					emp.setName(rs.getString("name"));

					list.add(emp);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return list;
		}
		public int addEmp(Value emp) {
			connect();
			String insert = "INSERT INTO users (user_phone,user_name,user_passwoad) "
					+ "VALUES (?,?,?)";
			int r = 0;
			try {
				psmt = conn.prepareStatement(insert); // << 파라미터 값을 입력할때 씀
				psmt.setString(1, emp.getPhone());
				psmt.setString(2, emp.getName());
				psmt.setString(3, emp.getPasswoad());

				r = psmt.executeUpdate(); // 처리된 건수

			} catch (SQLException e) {
				e.printStackTrace();
			}
			return r; // 정상처리시 1, 예외나 에러뜨면 0

		}

}

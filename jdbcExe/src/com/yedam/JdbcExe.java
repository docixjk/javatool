package com.yedam;

import java.sql.*;

public class JdbcExe {
	public static void main(String[] args) {
		// jdbc oracle data CRUD test
		// 1. ojdbc.jar 라이브러리 추가 ( 프로젝트에 ojdbc6_g.jar 추가)
		// 2. Connection 객체, db연결 쿼리 샐행 or 실행결과 통보.
		Connection conn;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "INSERT INTO employees(employee_id, job_id, last_name, email, hire_date)"
				+ "values(300, 'IT_PROG','홍','hong',sysdate)";
		
		//삭제
//		sql = "DELETE FROM employees WHERE employee_id = 300";
		
		//수정
		sql = "UPDATE employees SET first_name = 'killdong' WHERE employee_id = 300";

		// jdbc driver 정상.
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("oracle driver error");
			e.printStackTrace();
		}

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pass = "hr";

		try { // 드라이브 있을때 : 유저 url, 유저 네임, 유저 패스워드
			conn = DriverManager.getConnection(url, user, pass);
			System.out.println("connect");

			// 쿼리실행, 처리결과 객체 받아옴
			stmt = conn.createStatement();

			// db 정보 변경시 사용 - 추가 , 수정 , 삭제
			int r = stmt.executeUpdate(sql);

			// 처리된 결과값이 들어있음 - 조회시 사용
			rs = stmt.executeQuery("SELECT * FROM employees order by employee_id");

			while (rs.next()) {
				// getInt는 숫자로된 데이터 값을 가져오는거
				// getString은 문자로된 데이터 값을 가져오는거
				System.out.println("사원번호 : " + rs.getInt("employee_id") + ", 이름 : " + rs.getString("first_name")
						+ ", 이메일 : " + rs.getString("email") + ", 급여 : " + rs.getInt("salary"));
			}
			System.out.println("end of records");

		} catch (SQLException e) {
			System.out.println("fail");
			e.printStackTrace();
		}
	}
}

package com.yedam;

import java.sql.*;
import java.util.*;

public class EmpDAO {
	// db와 연결
	Connection conn;

	// java에서 sql문을 처리하기 위한 것
	Statement stmt = null;

	// 파라미터를 읽기 위해
	PreparedStatement psmt = null;

	// sql문을 처리한 값을 불러오기 위한 것
	ResultSet rs = null;

	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "hr";
	String pass = "hr";

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
	String[] sql = { "SELECT * FROM emp_temp ORDER BY employee_id", "SELECT * FROM emp_temp WHERE employee_id=",
			"INSERT INTO emp_temp (employee_id, last_name, email, hire_date, job_id) VALUES (?,?,?,?,?)",
			"UPDATE emp_temp SET salary= ? WHERE employee_id = ?", "DELETE FROM emp_temp WHERE employee_id = ?" };

	// 전체 조회 - Map 타입이 사용하기 편리하다 어느것이든 받아줌
	public List<Map<String, Object>> empList() { // 반환 타입
		connect();

		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql[0]);
			while (rs.next()) {
				Map<String, Object> map = new HashMap<>();
				map.put("emp_id", rs.getInt("employee_id"));
				map.put("first_name", rs.getString("first_name"));
				map.put("last_name", rs.getString("last_name"));
				map.put("salary", rs.getInt("salary"));

				list.add(map);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;

	}

	// 비교해보자
	public List<EmpVO> empVolist() { // 클래스를 하나 만들어야됨
		connect();
		List<EmpVO> list = new ArrayList<>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql[0]);
			while (rs.next()) {
				EmpVO emp = new EmpVO();
				// setEmployeeId의 setter를 사용
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFisrtName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setSalary(rs.getInt("salary"));
				emp.setHireDate(rs.getString("hire_date"));

				list.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	// 단건 조회
	public EmpVO getEmp(int id) {
		connect();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql[1] + id);
			// 조회된 값이 하나니까
			if (rs.next()) {
				EmpVO emp = new EmpVO();
				// setEmployeeId의 setter를 사용
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFisrtName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setSalary(rs.getInt("salary"));
				emp.setHireDate(rs.getString("hire_date"));
				return emp;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null; // 조회된 데이터가 없으면 null 반환
	}

	// 추가
	public int addEmp(EmpVO emp) {
		connect();
		int r = 0;
		try {
			psmt = conn.prepareStatement(sql[2]); // << 파라미터 값을 입력할때 씀
			psmt.setInt(1, emp.getEmployeeId());
			psmt.setString(2, emp.getLastName());
			psmt.setString(3, emp.getEmail());
			psmt.setString(4, emp.getHireDate());
			psmt.setString(5, emp.getJobId());

			r = psmt.executeUpdate(); // 처리된 건수

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return r; // 정상처리시 1, 예외나 에러뜨면 0

	}

	// 수정
	public int updateEmp(EmpVO emp) {
		connect();
		int z = 0;
		try {
			psmt = conn.prepareStatement(sql[3]); // << 파라미터 값을 입력할때 씀
			psmt.setInt(1, emp.getSalary());
			psmt.setInt(2, emp.getEmployeeId());

			z = psmt.executeUpdate(); // 처리된 건수

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return z; // 정상처리시 1, 예외나 에러뜨면 0

	}

	// 삭제
	public int delEmp(EmpVO emp) {
		connect();
		int x = 0;
		try {
			psmt = conn.prepareStatement(sql[4]);
			psmt.setInt(1, emp.getEmployeeId());

			x = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return x;
	}

}

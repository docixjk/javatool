package com.yedam;

import java.util.*;

public class EmpMain {

	static Scanner sc = new Scanner(System.in);

	// 사용자 입력 값을 받아서 처리
	static EmpDAO dao = new EmpDAO();

	public static void exe() {

		while (true) {
			System.out.println("[1][ 전체조회 ][2][ 단건조회 ][3][ 입 사 ][4][ 연봉협상 ][5][ 해 고 ][9][ 종 료 ]");
			System.out.print("메뉴 입력 > ");
			int menu = sc.nextInt();

			if (menu == 1)
				list();
			else if (menu == 2)
				search(); // 단건조회
			else if (menu == 3)
				add(); // 입력처리 => 사번, last_name, email, 입사일자, 직무
			else if (menu == 4)
				salay(); // 급여 변경
			else if (menu == 5)
				delete(); // 사원삭제
			else if (menu == 9)
				break; // 종료
		} // end of while
		System.out.println("end of program");
	}// end of class

	public static void list() {
		// 전체조회
//		List<Map<String, Object>> result = dao.empList(); // 반환유형 확인
//		for (Map<String, Object> map : result) {
//			System.out.println(
//					"사원번호 : " + map.get("emp_id") + ", 이름 : " + map.get("first_name") + " - " + map.get("last_name"));
//		}

		List<EmpVO> list = dao.empVolist();
		for (EmpVO emp : list) {
			System.out.println(emp.toString());
		}
	}

	public static void search() {
		System.out.print("조회할 사원번호를 입력 > ");
		int id = sc.nextInt();

		EmpVO emp = dao.getEmp(id);

		if (emp != null) {
			System.out.println(emp.toString());
		} else {
			System.out.println("정보 없음");
		}
	}

	public static void add() {
		EmpVO evo = new EmpVO();
		System.out.print("사번 입력 > ");
		int eid = sc.nextInt();
		sc.nextLine();
		System.out.print("이름 입력 > ");
		String name = sc.nextLine();
		System.out.print("메일 입력 > ");
		String email = sc.nextLine();
		System.out.print("입사 입력 > ");
		String hire = sc.nextLine();
		System.out.print("직무 입력 > ");
		String job = sc.nextLine();

		evo.setEmployeeId(eid);
		evo.setLastName(name);
		evo.setEmail(email);
		evo.setHireDate(hire);
		evo.setJobId(job);

		if (dao.addEmp(evo) > 0) {
			System.out.println("입력 성공");
		} else {
			System.out.println("에러");
		}
	}

	public static void salay() {
		EmpVO evo = new EmpVO();
		System.out.print("사번 입력 > ");
		int eid = sc.nextInt();
		System.out.print("급여 입력 > ");
		int pay = sc.nextInt();

		evo.setEmployeeId(eid);
		evo.setSalary(pay);

		if (dao.updateEmp(evo) > 0) {
			System.out.println("변경 성공");
		} else {
			System.out.println("에러");
		}
	}

	public static void delete() {
		EmpVO evo = new EmpVO();
		System.out.print("사번 입력 > ");
		int eid = sc.nextInt();

		evo.setEmployeeId(eid);

		if (dao.delEmp(evo) > 0) {
			System.out.println("삭제 성공");
		} else {
			System.out.println("에러");
		}
	}

}

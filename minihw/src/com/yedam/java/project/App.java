package com.yedam.java.project;

import java.util.*;

public class App {
	// 여기서 메소드 만들어서 MainApp으로 보낸다

	static Scanner sc = new Scanner(System.in);

	static TBL_USER_DAO dao = new TBL_USER_DAO();

	public static void exe() {
		wo: while (true) {
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			System.out.println("           (주)예담직업전문학교 수강생 관리PROGRAM ");
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			System.out.println("            < 1 > 관리자로그인 < 2 > 수강생추가  ");
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			System.out.print("              메뉴 입력  [ 1 ] / [ 2 ] : ");
			int menu = sc.nextInt();
			sc.nextLine();
			System.out.println("\n\n\n");

			if (menu == 1) {
				String id;
				String pw;
				while (true) {
					// 로그인 화면
					System.out.println("┌────────────────────────────────────────────────────┐");
					System.out.println("│         (주)예담직업전문학교     관리자      LOGIN          │");
					System.out.println("└────────────────────────────────────────────────────┘");
					System.out.println("                                       접속취소 [취소입력]");
					System.out.print("      아이디  : ");
					id = sc.nextLine();
					if (id.equals("취소")) {
						continue wo;
					}
					System.out.print("      비밀번호 : ");
					pw = sc.nextLine();
					if (pw.equals("취소")) {
						continue wo;
					}
					System.out.println("\n\n");
					System.out.println("──────────────────────────────────────────────────────");

					boolean log = dao.login(id, pw);
					if (log == true) {
						System.out.println("                 관리자님 접속을 환영합니다");
						System.out.println("──────────────────────────────────────────────────────");
						System.out.println("\n\n");
						break;
					}
					System.out.println("         [실패] 관리자의 아이디와 비밀번호를 입력해주세요");
				}
				login();
			} else if (menu == 2) {
				join();
			}
		}
	}

	public static void join() {
		loop: while (true) {
			TBL_USER_VO tuv = new TBL_USER_VO();
			System.out.println("──────────────────────────────────────────────────────");
			System.out.println("               (주)예담직업전문학교 수강생 등록");
			System.out.println("──────────────────────────────────────────────────────");
			// 회원가입
			// USERNUMBER NUMBER NOT NULL,
			// ID VARCHAR2(20),
			System.out.print("   아이디  : ");
			String id = sc.nextLine();
			boolean check = dao.checkId(id);
			if (check == true) {
				System.out.println("아이디가 중복됩니다.");
				continue;
			}
			// PW VARCHAR2(20),
			System.out.print("   비밀번호 : ");
			String pw = sc.nextLine();

			// NAME VARCHAR2(20),
			System.out.print("   이  름 : ");
			String name = sc.nextLine();
			// AGE NUMBER,
			System.out.print("   나  이 : ");
			int age = sc.nextInt();
			sc.nextLine();

			// PHONENUMBER VARCHAR2(20)
			System.out.print("   휴대번호 : ");
			String phone = sc.nextLine();

			// SUBJECT VARCHAR2(20)
			System.out.print("   수강과목 : ");
			String sub = sc.nextLine();

			System.out.println("──────────────────────────────────────────────────────");

			tuv.setId(id);
			tuv.setPw(pw);
			tuv.setName(name);
			tuv.setAge(age);
			tuv.setPhoneNumber(phone);
			tuv.setSubject(sub);

			if (dao.join(tuv) > 0) {
				System.out.println("               수강생등록이 완료되었습니다");
				break loop;
			} else {
				System.out.println("               수강생등록이 실패하였습니다.");
			}

		}
	}

	public static void login() {

		// 로그인 했을때
		while (true) {
			System.out.println("[1] 전체수강생 [2] 수강생검색 [3] 정보수정 [4] 로그아웃 [5] 수강생삭제");
			System.out.print(" 메뉴 입력 : ");
			int stu = sc.nextInt();
			sc.nextLine();
			if (stu == 1) {
				// 수강생 전체 조회
				List<TBL_USER_VO> list = dao.empVolist();

				for (TBL_USER_VO emp : list) {
					System.out.println(emp.toString());
				}
			} else if (stu == 2) {
				// 수강생 단건 조회
				System.out.println("수강생 아이디");
				System.out.print("[검색] ");
				String stuone = sc.nextLine();

				TBL_USER_VO eee = dao.student(stuone);

				if (eee != null) {
					System.out.println(eee.toString());

				} else {
					System.out.println("정보 없음");
				}
			} else if (stu == 3) {
				// 수강생정보 수정
				System.out.println("수정할 수강생 아이디");
				System.out.print("[검색] ");
				String upstu = sc.nextLine();

				TBL_USER_VO ddd = dao.student(upstu);

				if (ddd != null) {
					System.out.println(ddd.toString());

					TBL_USER_VO tuv = new TBL_USER_VO();

					System.out.print("아이디확인 : ");
					String upid = sc.nextLine();

					System.out.print("비밀번호 : ");
					String uppw = sc.nextLine();

					System.out.print("휴대번호 : ");
					String upphone = sc.nextLine();

					System.out.print("수강과목 : ");
					String upsub = sc.nextLine();

					tuv.setId(upid);
					tuv.setPw(uppw);
					tuv.setPhoneNumber(upphone);
					tuv.setSubject(upsub);
					if (dao.updEmp(tuv) > 0) {
						System.out.println("수강생등록이 완료되었습니다");
						continue;
					} else {
						System.out.println("수강생등록이 실패하였습니다.");
						continue;
					}

				} else {
					System.out.println("정보 없음");
				}

			} else if (stu == 4) {
				System.out.println("로그아웃 하시겠습니까? Y/N ");
				String pic = sc.nextLine();
				char pic2 = pic.charAt(0);
				if (pic2 == 'Y') {
					break;
				} else if (pic2 == 'N') {
					continue;
				}

			} else if (stu == 5) {
				TBL_USER_VO evo = new TBL_USER_VO();
				System.out.println("수강생 아이디");
				System.out.print("[검색] ");
				String delstu = sc.nextLine();
				TBL_USER_VO emp = dao.student(delstu);

				if (emp != null) {
					System.out.println(emp.toString());

					System.out.print("정말 삭제하시겠습니까? Y/N ");
					String pic = sc.nextLine();
					char pic2 = pic.charAt(0);

					if (pic2 == 'Y') {
						evo.setId(delstu);

						if (dao.delEmp(evo) > 0) {
							System.out.println("삭제가 되었습니다.");
							continue;
						} else {
							System.out.println("삭제되지 않았습니다.");
						}
					} else if (pic2 == 'N') {
						System.out.println("삭제가 취소되었습니다.");
						continue;
					}

				} else {
					System.out.println("해당 수강생은 없습니다.");
					continue;
				}

			}

		}
	}
}

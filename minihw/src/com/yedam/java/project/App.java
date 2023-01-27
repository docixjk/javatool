package com.yedam.java.project;

import java.util.*;

public class App {
	// 여기서 메소드 만들어서 MainApp으로 보낸다

	static Scanner sc = new Scanner(System.in);

	static TBL_USER_DAO dao = new TBL_USER_DAO();

	public static void exe() {
		while (true) {
			System.out.println("예담직업전문학교 수강생 관리 프로그램");
			System.out.println("1번 관리자로그인 2번 수강생추가");
			System.out.print("입력 > ");
			int menu = sc.nextInt();
			sc.nextLine();

			if (menu == 1) {
				String id;
				String pw;
				loop: while (true) {

					System.out.println("예담직업전문학교 관리자 로그인");
					System.out.print("아이디 : ");
					id = sc.nextLine();
					System.out.print("비밀번호 : ");
					pw = sc.nextLine();

					boolean log = dao.login(id, pw);
					if (log == true) {
						System.out.println(id + " 님 접속을 환영합니다.");
						break loop;
					}
				}
				while (true) {
					System.out.println("1번 전체수강생 2번 수강생검색 3번 정보수정 4번 로그아웃 5번 수강생삭제");
					System.out.print("입력 > ");
					int stu = sc.nextInt();
					sc.nextLine();
					if (stu == 1) {
						List<TBL_USER_VO> list = dao.empVolist();

						for (TBL_USER_VO emp : list) {
							System.out.println(emp.toString());
						}
					} else if (stu == 2) {
						System.out.println("수강생 아이디");
						System.out.print("[검색] ");
						String stuone = sc.nextLine();

						TBL_USER_VO eee = dao.student(stuone);

						if (eee != null){
							System.out.println(eee.toString());
							
							TBL_USER_VO tuv = new TBL_USER_VO();
							
							

						} else {
							System.out.println("정보 없음");
						}
					}else if(stu == 3) {
						System.out.println("수정할 수강생 아이디");
						System.out.print("[검색] ");
						String upstu = sc.nextLine();
						
						TBL_USER_VO ddd = dao.student(upstu);

						if (ddd != null){
							System.out.println(ddd.toString());
							
							

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

			} else if (menu == 2) {
				loop: while (true) {
					TBL_USER_VO tuv = new TBL_USER_VO();
					System.out.println("예담직업전문학교 수강생 가입");
					// 회원가입
					// USERNUMBER NUMBER NOT NULL,
					// ID VARCHAR2(300),
					System.out.print("아이디  : ");
					String id = sc.nextLine();
					boolean check = dao.checkId(id);
					if (check == true) {
						System.out.println("아이디가 중복됩니다.");
						continue;
					}
					// PW VARCHAR2(300),
					System.out.print("비밀번호 : ");
					String pw = sc.nextLine();

					// NAME VARCHAR2(300),
					System.out.print("이  름 : ");
					String name = sc.nextLine();
					// AGE NUMBER,
					System.out.print("나  이 : ");
					int age = sc.nextInt();
					sc.nextLine();

					// PHONENUMBER VARCHAR2(20)
					System.out.print("휴대번호 : ");
					String phone = sc.nextLine();
					
					// SUBJECT VARCHAR2(20)
					System.out.print("수강과목 : ");
					String sub = sc.nextLine();

					tuv.setId(id);
					tuv.setPw(pw);
					tuv.setName(name);
					tuv.setAge(age);
					tuv.setPhoneNumber(phone);
					tuv.setSubject(sub);

					if (dao.join(tuv) > 0) {
						System.out.println("수강생등록이 완료되었습니다");
						break loop;
					} else {
						System.out.println("수강생등록이 실패하였습니다.");
					}

				}
			}
		}
	}
}

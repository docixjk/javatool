package com.yedam.java.project;

import java.util.*;

public class App {
	// 여기서 메소드 만들어서 MainApp으로 보낸다

	static Scanner sc = new Scanner(System.in);

	static DAO dao = new DAO();
	public static void exe() {
		while (true) {
			System.out.println(" 예담 독서실에 오신것을 환영합니다 ");
			System.out.println("  [1] 입장     [2] 회원등록");
			System.out.print("입력 > ");
			int first = sc.nextInt();sc.nextLine();
			if(first == 1) {
				Value val = new Value();
				System.out.println("예담 독서실 입장하기");
				System.out.print("폰 번호 > ");
				String phone = sc.nextLine();
				System.out.print("비밀번호 > ");
				String pass = sc.nextLine();
				val.setPhone(phone);
				val.setPasswoad(pass);
				
			}else if(first == 2) {
				Value val = new Value();
				System.out.println("예담 독서실 회원등록하기");
				System.out.print("이  름 > ");
				String name = sc.nextLine();
				System.out.print("폰 번호 > ");
				String phone = sc.nextLine();
				System.out.print("비밀번호 > ");
				String pass = sc.nextLine();
				val.setName(name);
				val.setPhone(phone);
				val.setPasswoad(pass);
				if (dao.addEmp(val) > 0) {
					System.out.println("입력 성공");
				} else {
					System.out.println("에러");
				}
			}
			
			
		}
	}
}

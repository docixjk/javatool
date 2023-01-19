package com.yedam.java.ch03;

public class Course {
	// 만든 클래스를 매개변수로 사용하고 싶다
	// 어떤 타입으로 지정할지 모를때는 <?> 를 주어 어떤 것이든 대체 시킨다는 거

	public static void registserCourse1(Applicant<?> applicant) {
		// 해당 kind의 클래스 갖고 있는걸 1차적으로 가져오고
		// 그 클래스의 이름을 받아올 것이다
		// 해당 변수가 실제로 어디 클래스인지 확인하고 싶을때 getClass()
		// 거기서 이름을 찾을때는 getSimpleName()
		String msg = applicant.kind.getClass().getSimpleName() + "이(가) Course1을 등록함";
		System.out.println(msg);
	}

	// super Worker 클래스의 부모 클래스만 가능하다 ( Person, Worker 만 등록 가능 )
	public static void registserCourse2(Applicant<? super Worker> applicant) {
		
		String msg = applicant.kind.getClass().getSimpleName() + "이(가) Course2을 등록함";
		System.out.println(msg);
	}
	
	// Student를 최상위로 두고 HighStudent, MiddleStudent를 자식클래스로 제한
	public static void registserCourse3(Applicant<? extends Student> applicant) {
		
		String msg = applicant.kind.getClass().getSimpleName() + "이(가) Course3을 등록함";
		System.out.println(msg);
	}


}

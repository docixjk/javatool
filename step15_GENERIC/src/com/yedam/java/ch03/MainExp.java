package com.yedam.java.ch03;

public class MainExp {

	public static void main(String[] args) {
		// Course1
		// 원래는 이렇게 집어 넣어야하는데
		Person person = new Person();
		// 제네릭으로 <Person>을 쓰겠다.
		Applicant<Person> applicant = new Applicant<>(person);
		Course.registserCourse1(applicant);

		// 제네릭 타입으로는 이렇게 넣는다
		// Applicant는 제네릭 타입이라 <> 넣어 주어야하고 타입의 내용을 선언
		// 생성자에서 값을 받기 때문에 new Person()을 받아야한다
		Course.registserCourse1(new Applicant<Person>(new Person()));
		Course.registserCourse1(new Applicant<Worker>(new Worker()));
		Course.registserCourse1(new Applicant<Student>(new Student()));
		Course.registserCourse1(new Applicant<HighStudent>(new HighStudent()));
		Course.registserCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
		System.out.println();
		
		// Course2
		// super Worker 클래스의 부모 클래스만 가능하다
		// 그래서 이대로 치게 된다면 Person과 Worker 이외에 오류가 생긴다.
		// Worker가 최종 자손임 - Student와 관계가 없음
		Course.registserCourse2(new Applicant<Person>(new Person()));
		Course.registserCourse2(new Applicant<Worker>(new Worker()));
//		Course.registserCourse2(new Applicant<Student>(new Student()));
//		Course.registserCourse2(new Applicant<HighStudent>(new HighStudent()));
//		Course.registserCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
		System.out.println();
		
		// Course3
		// Student를 최상위로 두고 HighStudent, MiddleStudent 가 자손이기때문에
		// Person과 Worker에 오류가 뜨고 사용을 못한다.
		// Student가 최상위 부모라고 생각하면 됨
//		Course.registserCourse3(new Applicant<Person>(new Person()));
//		Course.registserCourse3(new Applicant<Worker>(new Worker()));
		Course.registserCourse3(new Applicant<Student>(new Student()));
		Course.registserCourse3(new Applicant<HighStudent>(new HighStudent()));
		Course.registserCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));

	}

}

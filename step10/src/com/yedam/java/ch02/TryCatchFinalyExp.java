package com.yedam.java.ch02;

import java.util.Scanner;

public class TryCatchFinalyExp {

	public static void main(String[] args) {
		// 일반 예외 -1
//		try {
//			// 실행하고자 하는 실행문
//			Class clazz = Class.forName("java.lang.String2");
//			// 클래스라는 클래스가 있다
//			// 클래스 정보 자체를 들고 있는 클래스
//		} catch (ClassNotFoundException e) {
//			// 해당 예외가 있을 수 있을때 사용
//			// 빨간 오류를 보여주는 녀석
//			// 이 코드 자체에 예외가 나오는 이유가 명확해서 알려줌
//			e.printStackTrace(); // 가장 정확한 예외의 원인을 안다
//
//			// 다른 방법으로 출력하고 싶을때 catch에 넣는다
//			System.out.println("해당 클래스가 존재하지 않습니다.");
//		}

		// 실행 예외 - 2 : 자바에서는 캐치못함, 개발자가 파악해야함
		// 이럴땐 개발자가 직접 try-catch문을 작성한다.
		String data1 = null;
		String data2 = null;
		// try의 중괄호 밖에 서도 사용하려면 밖에서 선언해준다
		try {
			// 두 개의 예외가 발생 할 수 있다.
			data1 = args[0]; // 100
			data2 = args[1]; // 2oo - 에러 뜸 하지만 처리는 하나밖에 없음 그래서 추가함

			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);

			int result = value1 + value2;

			System.out.printf("%s + %s = %d\n", data1, data2, result);

			// 강제로 발생 시킴
//			throw new ClassCastException();

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환 할 수 없습니다.");
		} catch (Exception e) { // 조상격인 Exception이 제일 위로 오면 안된다.
			System.out.println("정상적으로 실행 되지 않습니다.");
//			return; //메소드를 종료 시킴
		} finally { //캐치문이 동작 하는 여부에는 상관없이 무조건 나옴
			System.out.println("프로그램이 종료되었습니다.");
		}
		try {
			findClass();
		}catch (NullPointerException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	public static void findClass() throws NullPointerException, ClassNotFoundException {
		// 발생시키는 예외를 throws 키워드를 이용해 넣어준다 [ 강제성은 없다 ]
		// 해당 메소드에서 예외가 발생하는걸 호출 하는쪽이 하라는것

		String className = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("찾고자 하는 클래스 이름을 적어주세요");
		className = sc.nextLine();
		// 입력하지 않거나 빈 공간이라면 예외가 발생하도록 조성
		if (className == null || className.equals("")) {
			throw new NullPointerException();
		}
		// 이때는 강제성을 띔
		Class clazz = Class.forName(className);

	}

}

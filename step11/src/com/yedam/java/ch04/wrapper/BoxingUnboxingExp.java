package com.yedam.java.ch04.wrapper;

public class BoxingUnboxingExp {

	public static void main(String[] args) {
		// 박싱 언박싱을 하려면 ! 포장클래스 명칭으로 써야함

		/* 박 싱 */
		Integer obj1 = Integer.valueOf(100);
		Integer obj2 = Integer.valueOf("200");

		// 구버전으로 사용은 못하게 막음
//		Integer obj3 = new Integer(1000);

		/* 언박싱 */
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();

		////////////////////////////////////////////////////////

		// 필요에 따라서 변할 수 있다.
		/* 자동박싱 */
		Integer newObj1 = value1;
		Integer newObj2 = value2;

		/* 자동언박싱 */
		// 더하고 있는건 클래스지만 실행이 된다
		int result = newObj1 + newObj2;
//		System.out.println(result);

		// 값만 필요하다면?
		int newValue1 = newObj1;
		int newValue2 = newObj2;

		// Wrapper 클래스 값 비교
		Integer data1 = 300;
		Integer data2 = 300;

		// data1 , 2 는 인스턴스 일 뿐
		System.out.println("== 결과 : " + (data1 == data2));

		// intValue로 언박싱 후
		System.out.println("연박싱 후 == 결과 : " + (data1.intValue() == data2.intValue()));
		
		// equals() 메소드로 비교 - 내부값 비교
		System.out.println("equals() 결과 : " + data1.equals(data2));
	
		
		System.out.println(" 예외 사항 ");

		//일반 변수 처럼
		Integer data3 = 30;
		Integer data4 = 30;
	
		System.out.println("== 결과 : " + (data3 == data4));

		System.out.println("연박싱 후 == 결과 : " + (data3.intValue() == data4.intValue()));
		
		System.out.println("equals() 결과 : " + data3.equals(data4));
	}

}

package com.yedam.reference;

public class StringRef {

	public static void main(String[] args) {
		// new 연산자 - 1
		// 들의 주소 번지는 같은 곳을 보고 있다. (new 연산자 안쓰고)
		// 값을 보는게 아니라 주소를 보고 있다.
		String strVal1 = "yedam";
		String strVal2 = "yedam";

		// 문자열 주소값 비교
		if (strVal1 == strVal2) {
			System.out.println("strVal1과 strVal2는 메모리 주소가" + " 같다");
		} else {
			System.out.println("strVal1과 strVal2는 메모리 주소가" + " 다르다");
		}

		// 문자열 ( String ) 간의 데이터 비교
		if (strVal1.equals(strVal2)) {
			System.out.println("데이터 동일");
		} else {
			System.out.println("데이터 다름");
		}

		// new 연산자를 할용한 String 새롭게 객체 생성
		// heap 에 객체를 만든다 .
		// heap 에 String 데이터를 넣을 수 있는 새로운 공간을 만든다

		String strVal3 = new String("yedam"); // 100번지
		String strVal4 = new String("yedam"); // 200번지

		if (strVal3 == strVal4) {
			System.out.println("strVal3과 strVal4는 같은 메모리 주소");
		} else {
			System.out.println("strVal3과 strVal4는 다른 메모리 주소");
		}

		if (strVal3.equals(strVal4)) {
			System.out.println("데이터 동일");
		} else {
			System.out.println("데이터 다름");
		}

		// String strVal1 = "yedam";
		// String strVal3 = new String("yedam");

		if (strVal1 == strVal3) {
			System.out.println("strVal1과 strVal3는 같은 메모리 주소");
		} else {
			System.out.println("strVal1과 strVal3는 다른 메모리 주소");
		}

		// 문자열 비교 중요
		// == 주소 비교
		// equals 데이터 비교
	}

}

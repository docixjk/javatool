package com.yedam.variable;

public class OpratorCasting {

	public static void main(String[] args) {
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000;
		
		
		long result = value1 + value2 + value3;
		System.out.println(result);

		//실수와 정수 타입 변환 ( 연산 )
		int intValue1 = 10;
		int intValue4 = intValue1/4; // 10 / 4 = 2
		System.out.println(intValue4);
		
		int intValue2 = 10;
		double intValue3 = intValue2 / 4.0; // 10 / 4.0 = 2.5
		System.out.println(intValue3);
		
		int x = 1;
		int y = 2;
		double result2 = x/y; // x / (double)y = 0.5
		System.out.println(result2); // 0.0
		
		// + 연산
		// 숫자 연산
		int value = 10 + 2 + 8;
		System.out.println(value);
		
		//문자열 결합 연산
		//문자열 만나면 그 뒤에는 전부 문자
		String str1 = 10 + 2 + "8"; // 12 + "8" = 128
		System.out.println(str1);
		
		String str2 = 10 + "2" + 8; // 10 + "2" + "8" = 1028 
		System.out.println(str2);
		
		String str3 = "10" + 2 + 8; // "10" + "2" + "8" = 1028
		System.out.println(str3);
		
		String str4 = "10" + (2 + 8); // "10" + "10" = 1010
		System.out.println(str4);
		
		//String <-> 정수, 실수 타입 변환
		int valueStr = Integer.parseInt(str4);
		System.out.println(valueStr);
		
		//byte byteValue = Byte.parseByte(str4);
		short shortValue = Short.parseShort(str4);
		System.out.println(shortValue);
		
		long longValue = Long.parseLong(str4);
		System.out.println(longValue);
		
		double dValue = Double.parseDouble(str4);
		System.out.println(dValue);
		//boolean bValue = Boolean.parseBoolean(str4);
		
		// 어떤 내용이 들어 오더라도 무조건 문자열로 바꾸는 문법
		// int -> String
		String str5 = String.valueOf(valueStr);
		
		//long -> String
		String str6 = String.valueOf(longValue);
		
		//double -> String
		String str7 = String.valueOf(dValue);
	}

}
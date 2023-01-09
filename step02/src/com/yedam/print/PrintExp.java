package com.yedam.print;

public class PrintExp {

	public static void main(String[] args) {
		//println
		System.out.println("출력과 동시에 행을 변경(Enter)");
		
		//print
		System.out.print("출력만 \n");// 줄바꿈 하려면 " \n"
		
		//printf
		System.out.printf(
				"이름 : %s , 나이 : %d , 온도 : %f"
				, "또치" , 20 , 9.5);
		// %s = 문자열 , %d = 정수 , %f = 실수
		System.out.println();
		
		//printf 메소드 사용법
		int value = 123;
		System.out.printf("상품의 가격 : %d 원\n", value);
		System.out.printf("상품의 가격 : %6d 원\n", value);
		System.out.printf("상품의 가격 : %-6d 원\n", value);
		System.out.printf("상품의 가격 : %06d 원\n", value);
		
		double area = 3.14 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이 : %6.2f\n" , 10 , area);
		
		// % 와 속성 사이에 들어가는 숫자는 칸수를 뜻함
		// -일때는 뒤로 , +일때는 앞으로
		System.out.printf("%6d | %-10s | %10s\n", 1 , "햄버거" , "버거");
		
		
	}

}

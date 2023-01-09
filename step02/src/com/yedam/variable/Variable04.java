package com.yedam.variable;

public class Variable04 {

	public static void main(String[] args) {
		System.out.println("String");
		//String = 하나이상의 문자 즉 문자열 "A" "ABC" 쌍 따옴표
		String name = "홍길동";
		String job = "프로그래머";
		
		System.out.println(name);
		System.out.println(job);
		
		/*
			이스케이프 문자(console 출력 시)
			String(문자열) 사용
			\t : tab만큼 벌려라
			\n : enter
			\r : 맨 앞줄로 이동
		*/
		
		// 문자 처럼 \t도 같이 출력됨
		System.out.println("번호/t이름/t직업");
		System.out.print("행 단위 출력\n");
		
		// 특수기호를 텍스트로 이용하기 위해서 \ 를 이용한다
		System.out.println("우리는 \"개발자\" 입니다");
		//우리는 "개발자" 입니다
		System.out.println("봄\\여름\\가을\\겨울");
		//봄\여름\가을\겨울
		
		System.out.println("실수");
		// 실수 ( float , double )
		float var1 = 3.14f;
		double var2 = 3.14;
		
		// 정밀도 검사 
		float var3 = 0.1234567890123456789f;
		double var4 = 0.123456789123456789;
		
		System.out.println("var3 : " +var3);
		System.out.println("var4 : " +var4);
		
		double var6 = 3e6; // e , E = 10
		float var7 = 3e-6F; // e , E 뒤 숫자는 제곱수 5 = 5승 ,-5 = -5승
		
		System.out.println("var6 : " +var6);
		System.out.println("var7 : " +var7);
		
		System.out.println("논리타입 (Boolean)");
		// 논리 타입(Boolean)
		boolean stop = true;
		if(stop) {
			System.out.println("중지");
		} else {
			System.out.println("시작");
		}
		
	}

}

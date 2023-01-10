package com.yedam.loop;

public class LoopFor2 {

	public static void main(String[] args) {
		//2단~ 9단 출력 - 1
//		for(int i=2;i<=9;i++) {
//			
//			for(int j=1;j<=9;j++) {
//				System.out.printf("%d * %d = %d\n", i , j , i*j);
//			}
//			System.out.println();
//		}
		
		// 별찍기 과정 1~3 - 2
		// 과정 1 단순 별찍기
//		for(int i = 1; i<= 5; i++) {
//			for(int j = 0; j <= 5; j++) {
//				//별 다섯번 찍기
//				System.out.print("*");
//			}
//			//다섯번 줄바꿈 = enter
//			System.out.println();
//		}
		// 과정 2 삼각 별찍기
//		for(int i=1;i<=5;i++) { //줄바꿈용도
//			for(int j=0;j<i;j++) { //한줄에 별 뽑아내기
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		// 과정 3 역삼각 별찌기
		for(int i=1;i<=5;i++) { //줄바꿈용도
			for(int j=5;i<=j;j--) { //한줄에 별 뽑아내기
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

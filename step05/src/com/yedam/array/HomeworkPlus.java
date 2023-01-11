package com.yedam.array;

public class HomeworkPlus {

	public static void main(String[] args) {
		// [추가 문제]

		// answer 배열에 담긴 데이터를 읽고 각 숫자마다 개수만큼'*'를 찍는다.
		// 아래 빈 영역에 코드를 입력하여 프로그램을 완성하여라

		 int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
		 int[] counter = new int[4];
		
		 for (int i = 0; i < answer.length; i++) {
		 /* 해당 부분 코딩 */
			 if(answer[i]==1) {
				 counter[0]++;
			 }else if(answer[i]==2) {
				 counter[1]++;
			 }else if(answer[i]==3) {
				 counter[2]++;
			 }else if(answer[i]==4) {
				 counter[3]++;
			 }
		 }
		 for (int i = 0; i < counter.length; i++) {
		 /* 해당 부분 코딩 */
			 for(int j=0;j<counter[i];j++) {
				 System.out.print("*");
			 }
		
		 System.out.println();
		 }
		// ※ 배열의 각 인덱스와 숫자의 연관성을 지으면서 풀어 볼 것.
		// 출력 예시) ***
		// **
		// **
		// ****
	}

}

package com.yedam.loop;

public class LoopCondition {

	public static void main(String[] args) {
		// while break - 1
//		while(true) {
//			int num = (int)(Math.random()*6)+1;
//			System.out.println(num);
//			if(num == 6)break;
//		}
		// for break - 2
//		for(int i=0;i<=10;i++) {
//			for(int j=0;j<=10;j++) {
//				if(j == 5) {
//					System.out.println("더하기"+(i+j));
//					break; // 해당 for문만 나가짐
//				}else {
//					System.out.println(j);
//				}
//			}
//		}

		// for label break - 3
//		Outter: for (char upper = 'A'; upper <= 'z'; upper++) {
//			for (char lower = 'a'; lower <= 'z'; lower++) {
//				System.out.println(upper + "=" + lower);
//				if (lower == 'g') {
//					break Outter;// 지정한 label을 나감
//				}
//			}
//		}
		
		//continue - 4
		for(int i=0;i<=10;i++) {
			if(i%2==0) { // 2의 배수 골라냄
				continue;// 만나면 for문 젤 위로 올려버림 ( 밑 실행문 안 됨 )
			}
			System.out.println(i);
		}

	}

}

package com.yedam.java.exp;

import java.util.Scanner;

public class SchedulerExp {

	public static void main(String[] args) {
		
		//Top-down - 전체적인 프로세스 -> 세부적으로 객체
		//ㄴ 전체적인 그림을 그리기 때문에 놓치는 부분을 잡을 수 있다.
		
		//bottom-up
		//객체를 먼저 만들고 -> 전체적인 프로세스
		
		//문제 -> 큰 그림
		
		Scanner scanner = new Scanner(System.in);
		Scheduler scheduler = null;
		
		System.out.println("전화 상담 할당 방식을 선택하세요.");
		System.out.println("R : 한명씩 차례로 할당 ");
		System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당 ");
		System.out.println("P : 우선순위가 높은 고객 먼저 할당 ");
		
		
		String ch = scanner.next();
		
		//RoundRobin , LeastJob , PriorityAllocation 모두 클래스
		
		
		//자동 타입 변환이 일어남
		if("R".equals(ch) || "r".equals(ch) ) {
			scheduler = new RoundRobin();
		}else if("L".equals(ch) || "l".equals(ch) ) {
			scheduler = new LeastJob();
		}else if("P".equals(ch) || "p".equals(ch)) {
			scheduler = new PriorityAllocation();
		}else {
			System.out.println("지원되지 않는 기능입니다.");
			return;
		}
		
		//추상은 공통된 개념
		
		//인터페이스는 기능적인 부분을 봐야한다
		//scheduler은 인터페이스가 될 경우가 크다
		//상담원 : 다음 전화 받아올 기준
		scheduler.getNextCall();
		
		//배분 방법
		scheduler.sendCallToAgent();
	}

}

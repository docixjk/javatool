package com.yedam.object;

public class Score {
	//필드
	int kor;
	int math;
	int eng;
	
	//매개변수 입력 받을거임
	Score(int kor, int math, int eng){
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	
	//메소드
	//합계
	int getSum() {
		return kor+math+eng;
	}
	//평균
	double getAvg() {
		int sum = getSum();
		return sum/3.0;
	}
	
	// 합계와 평균 메소드를 불러와서 사용했다
	void getInfo() {
		int sum = getSum();
		double avg = getAvg();
		
		System.out.println("성적 합계 : " + sum);
		System.out.println("성적 편균 : " + avg);
	}
	
}

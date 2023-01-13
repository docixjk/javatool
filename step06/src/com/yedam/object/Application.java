package com.yedam.object;

import java.util.*;

public class Application {

	public static void main(String[] args) {
		// Student 타입의 변수에 Student 주소값을 넣어 줌 ( 객체 생성 ) - 1
		// 클래스 >> 객체 << 인스턴스
		// 스택은 아래서 위로 쌓이고 힙은 위에서 아래로 내린다
		// 힙 - 메모리 용량 할당 , 스택 - 객체가 가리키는 주소값을 받는다
		// 참조변수 선언 - 힙영역에 메모리 할당(객체생성) - 인스턴스가 참조하게 됨
//		Student s1 = new Student();
//
//		Student s2 = new Student();

//		System.out.println(s1);
//		System.out.println(s2);

		// dot 연산자( 점 = . )
		// . 을 이용해서 해당 변수에 값 입력

//		s1.age = 19; s1.name = "다나카"; s1.schoolName = "성진국"; //getInfo를 불러와 실행 - 결과는
//		위에서 넣은 값 //값을 넣어주지 않고 사용하면 null 값이 나온다 s1.getInfo(); // s1으로 전부 연결되어 있음
//		 
//		s2.age = 18; s2.name = "카와키타"; s2.schoolName = "성진국";
//		 
//		s2.getInfo();
//		 
//		s1.getInfo();
//
//		s1.age = 20;
//		s1.name = "다나가";
//
//		System.out.println("학생 나이 : " + s1.age);
//		System.out.println("학생 이름 : " + s1.name);
//		System.out.println("학생 학교 : " + s1.schoolName);

		// 생성자에 매개변수를 넣게 했으니 꼭 넣어야됨 - 2
		// 객체 생성할 때 데이터를 넣어줌
//		Korean k1 = new Korean("다나카", "SAM-572");
//		System.out.print("k1이 갖고 있는 필드 값 : ");
//		System.out.print(k1.nation + " ");
//		System.out.print(k1.name + " ");
//		System.out.print(k1.ssn + " ");

		// 클래스 생성해서 객체 만든 다음 객체 바로 사용
		// 객체를 한 곳에 모아서 관리하는 형태
		// 배열
		// int[] ary = new int[4]; = 숫자 4개가 들어가는 배열
		// Student[] stdAry = new Student[10]; = Student 객체를 배열에 넣음

		// Scanner를 사용 변수 선언
		Scanner sc = new Scanner(System.in);

		// 학생 정보 보관하는 배열
		Student[] stdAry = null;
		// 타입이 Student이고 들어갈 수 있는 것은 Student 클래스로 만든 객체가 들어감
		// Student std = new Student();
		// 배열안에 std가 하나씩 들어간다는 의미 ( 새로운 공간에 )

		int stdNum = 0; // 학생 수 넣을 변수 값 초기화

		// while문을 활용해서 학생 관리 프로그램 작성
		while (true) {
			System.out.println("====================================================");
			System.out.println("| 1. 학생 수 | 2. 정보입력 | 3. 정보확인 | 4. 분석 | 5. 종료 |");
			System.out.println("====================================================");

			System.out.print("입력 > ");
			int selsctNo = Integer.parseInt(sc.nextLine());

			if (selsctNo == 1) {
				// Student 클래스로 만들어지는 객체를 몇개나 배열에 넣을지에 대한 값을 받음
				System.out.print("학생 수 > ");
				stdNum = Integer.parseInt(sc.nextLine());

			} else if (selsctNo == 2) {
				// 배열의 크기를 처음 받은 학생 수를 넣어줌
				stdAry = new Student[stdNum];
				for (int i = 0; i < stdAry.length; i++) {
					// Student s1 = new Student(); 아래와 같은 의미 배열만 아님
					stdAry[i] = new Student();
					System.out.print("이름 > ");
					stdAry[i].name = sc.nextLine();
					System.out.print("나이 > ");
					stdAry[i].age = Integer.parseInt(sc.nextLine());
					System.out.print("학교 > ");
					stdAry[i].schoolName = sc.nextLine();

					// 성적입력
					System.out.print("국어 > ");
					stdAry[i].kor = Integer.parseInt(sc.nextLine());
					System.out.print("영어 > ");
					stdAry[i].eng = Integer.parseInt(sc.nextLine());
					System.out.print("수학 > ");
					stdAry[i].math = Integer.parseInt(sc.nextLine());

				}

			} else if (selsctNo == 3) {
				// stdAry 길이만큼 돌아감 stdAry 인덱스 값을 std 에 넣어서 출력
				for (Student std : stdAry) {
					std.getInfo();
				}
			} else if (selsctNo == 4) {
				// 총 합 , 평 균
				int total = 0;
				double avg = 0;
				System.out.println("전체 학생 총 합 / 평 균 조회");
				for (int i = 0; i < stdAry.length; i++) {
					total = stdAry[i].kor + stdAry[i].eng + stdAry[i].math;
					avg = total / 3.0;
					System.out.println(stdAry[i].name + " 학생의");
					System.out.printf("총 합 : %d | 평 균 : %.2f\n", total, avg);
				}
				// 시험 최고 점수, 최저 점수
				// 초기화
				int max = 0;
				int min = 0;
				// 몇번의 인덱스 안에 있는 점수를 비교
				for (int i = 0; i < stdAry.length; i++) {
					// 최대, 최소 값을 첫번째 값으로 넣어줌 (비교를 위해서)
					max = stdAry[i].kor;
					min = stdAry[i].kor;

					// 다른 점수들을 비교해 최대값을 정함
					if (stdAry[i].eng < stdAry[i].math) {
						if (max < stdAry[i].math) {
							max = stdAry[i].math;
						}
					} else {
						if (max < stdAry[i].eng) {
							max = stdAry[i].eng;
						}
					}
					if (stdAry[i].eng < stdAry[i].math) {
						if (min > stdAry[i].math) {
							min = stdAry[i].math;
						}
					} else {
						if (min > stdAry[i].eng) {
							min = stdAry[i].eng;
						}
					}
					System.out.println(stdAry[i].name + "의 최고 점수 : " + max);

				}

			} else if (selsctNo == 5) {
				System.out.println("종료");
				break;
			}

		}

	}

}

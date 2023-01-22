package com.yedam.java.beginner;

import java.io.*;

public class Exp15552 {
	//제출 완
	public static void main(String[] args) throws IOException {

		// rd에 연결되는 문자입력 버퍼스트림 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// wt에 연결되는 문자출력 버퍼스트림 생성
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// readLine()은 String의 타입을 갖고 있다.
		// 스트림으로부터 한 줄을 읽어 문자열로 리턴
		int n = Integer.parseInt(br.readLine()); //문자열 > 숫자 변환

		for (int i = 0; i < n; i++) {
			//스트링 타입 선언
			String string = br.readLine();
			
			//공백 기준으로 적기 때문에 스플릿 사용
			//앞은 0번 뒤는 1번 자리에 넣음
			int a = Integer.parseInt(string.split(" ")[0]);
			int b = Integer.parseInt(string.split(" ")[1]);
			bw.write(a + b + "\n");
		}
		bw.flush();
	}
}

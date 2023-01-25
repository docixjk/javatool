package com.yedam.java.upper;

import java.io.*;
import java.util.*;

public class Exp10845 {

	public static void main(String[] args) throws IOException {
		// 입 력
		// 첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다.
		// 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다.
		// 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다.
		// 문제에 나와있지 않은 명령이 주어지는 경우는 없다.

		// 출 력
		// 출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.

		// Queue의 특징
		// 1. 먼저 들어간 자료가 먼저 나오는 구조 FIFO(First In FIrst Out) 구조
		// 2. 큐는 한 쪽 끝은 프런트(front)로 정하여 삭제 연산만 수행함
		// 3. 다른 한 쪽 끝은 리어(rear)로 정하여 삽입 연산만 수행함
		// 4. 그래프의 넓이 우선 탐색(BFS)에서 사용
		// 5. 컴퓨터 버퍼에서 주로 사용,
		// 마구 입력이 되었으나 처리를 하지 못할 때,
		// 버퍼(큐)를 만들어 대기 시킴

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> link = new LinkedList<>();
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		int num = 0;

		for (int i = 0; i < N; i++) {
			String order = br.readLine();

			String name = order.split(" ")[0];

			switch (name) {
			// push X: 정수 X를 큐에 넣는 연산이다.
			case "push":
				num = Integer.parseInt(order.split(" ")[1]);
				link.offer(num);
				break;
			case "pop":
				// pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다.
				// ㄴ만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
				if (link.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					// 맨 앞 제외하고 가져오기
					sb.append(link.poll()).append("\n");
				}
				break;
			case "size":
				// size: 큐에 들어있는 정수의 개수를 출력한다.
				sb.append(link.size()).append("\n");
				break;
			case "empty":
				// empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
				if (link.isEmpty()) {
					sb.append(1).append("\n");
				} else {
					sb.append(0).append("\n");
				}
				break;
			case "front":
				// front: 큐의 가장 앞에 있는 정수를 출력한다.
				// ㄴ만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
				if (link.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					// peek()는 맨 앞 빼오기
					sb.append(link.peek()).append("\n");
				}
				break;
			case "back":
				// back: 큐의 가장 뒤에 있는 정수를 출력한다.
				// ㄴ만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
				if (link.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(num).append("\n");
				}
				break;
			}

		}
		System.out.println(sb);

	}

}

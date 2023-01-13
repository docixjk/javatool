package test3;

public class Main {

	public static void main(String[] args) {

		// 큰금액부터 동전을 우선적으로 거슬러 줘야한다.
		// 출력예시> 500원 : 5개, 100원 1개 50원 1개 10원 3개
		int[] coinUnit = new int[4];
		int money = 2680;
		System.out.println("money = " + money);
		int remain = 0;
		for (int i = 0; i < coinUnit.length; i++) {
			if (money >= 500) {
				remain = money / 500;
				for (int j = 0; j < remain; j++) {
					coinUnit[0]++;
					money -= 500;
				}
			} else if (money < 500 && money > 100) {
				remain = money / 100;
				for (int k = 0; k < remain; k++) {
					coinUnit[1]++;
					money -= 100;
				}
			} else if (money < 100 && money > 50) {
				remain = (int) (money / 50);
				for (int l = 0; l < remain; l++) {
					coinUnit[2]++;
					money -= 50;
				}
			} else if (money < 50) {
				remain = (int) (money / 10);
				for (int o = 0; o < remain; o++) {
					coinUnit[3]++;
					money -= 10;
				}
			}

		}
		System.out.println("500원 : " + coinUnit[0] + " 개");
		System.out.println("100원 : " + coinUnit[1] + " 개");
		System.out.println("50원 : " + coinUnit[2] + " 개");
		System.out.println("10원 : " + coinUnit[3] + " 개");

	}

}

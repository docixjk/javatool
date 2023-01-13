package test4;

public class Main {

	public static void main(String[] args) {
		//구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램
		//5단이면 곱하는 수가 1~5까지만...
		
		for(int i=2; i<10;i++) {
			System.out.println(i+" 단");
			for(int j=1; j<=i;j++) {
				System.out.printf("%d * %d = %d\n", i , j , (i*j));
			}
		}
	}

}

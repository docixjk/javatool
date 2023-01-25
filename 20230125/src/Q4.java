
public class Q4 {

	public static void main(String[] args) {
		String[] arr = {"010102-4","991012-1","960304-1","881012-2","040403-3"};
		int m =0;
		int w =0;
		for(int i=0;i<arr.length;i++) {
			if((arr[i].charAt(7) == '1') || (arr[i].charAt(7) == '3')) {
				m++;
			}
			else {
				w++;
			}
		}
		System.out.printf("남 %d 여 %d",m,w);

	}

}

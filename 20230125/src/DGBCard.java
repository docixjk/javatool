
public class DGBCard extends Card{
	private final String company = "대구은행";
	private String cardStaff;

	public DGBCard(String cardNo, int validDate, int cvc, String cardStaff) {
		super(cardNo, validDate, cvc);
		this.cardStaff = cardStaff;
	}

	@Override
	public void showCardInfo() {
		super.showCardInfo();
		System.out.println("담당직원 - "+ this.cardStaff + ", " + company);
	}
	
	
}

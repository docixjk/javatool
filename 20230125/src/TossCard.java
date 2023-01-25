
public class TossCard extends Card {
	private final String company = "Toss";
	private String cardStaff;

	public TossCard(String cardNo, int validDate, int cvc, String cardStaff) {
		super(cardNo, validDate, cvc);
		this.cardStaff = cardStaff;
	}

	@Override
	public void showCardInfo() {
		System.out.println("카드정보 - CardNo " + super.getCardNo());
		System.out.println("담당직원 - " + this.cardStaff + " , " + company);

	}

}

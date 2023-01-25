
public class CardPayment implements Payment {

	private double cardRatio;

	private double on = ONLINE_PAYMENT_RATIO;
	private double off = OFFLINE_PAYMENT_RATIO;

	public CardPayment(double cardRatio) {
		this.cardRatio = cardRatio;
	}

	@Override
	public int online(int price) {
		price =price - (int) (price * (on+this.cardRatio));
		return price;
	}

	@Override
	public int offline(int price) {
		price =price - (int) (price * (off+this.cardRatio));
		return price;
	}

	@Override
	public void showInfo() {
		System.out.println("*** 카드로 결제 시  할인정보");
		System.out.println("온라인 결제시 총 할인율 : " + (on+this.cardRatio));
		System.out.println("오프라인 결제시 총 할인율 : " + (off+this.cardRatio));

	}

}

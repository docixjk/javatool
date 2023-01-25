
public class SimplePayment implements Payment {

	private double simplePaymentRatio;

	private double on = ONLINE_PAYMENT_RATIO ;
	private double off = OFFLINE_PAYMENT_RATIO;

	public SimplePayment(double simplePaymentRatio) {
		this.simplePaymentRatio = simplePaymentRatio;
	}

	@Override
	public int online(int price) {
		price = price - (int) (price * (on+ this.simplePaymentRatio));
		return price;
	}

	@Override
	public int offline(int price) {
		price = price - (int) (price * (off+ this.simplePaymentRatio));
		return price;
	}

	@Override
	public void showInfo() {
		System.out.println("*** 간편결제 시  할인정보");
		System.out.println("온라인 결제시 총 할인율 : " + (on+ this.simplePaymentRatio));
		System.out.println("오프라인 결제시 총 할인율 : " + (off+ this.simplePaymentRatio));

	}

}

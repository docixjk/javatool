
public class Q2 {

	public static void main(String[] args) {
		Card card = new Card("5432-4567-9534-3657",20251203,253);
		card.showCardInfo();
		
		System.out.println();
		
		Card tc = new TossCard("5432-4567-9534-3657",20251203,253,"신빛용");
		tc.showCardInfo();

		System.out.println();
		
		Card dc = new DGBCard("5432-4567-9534-3657",20251203,253,"신빛용");
		dc.showCardInfo();

	}

}

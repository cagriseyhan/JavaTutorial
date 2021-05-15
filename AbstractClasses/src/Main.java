
public class Main {

	public static void main(String[] args) {
		
		GameCalculator[] calculators = {new WomanGameCalculator(), new KidsGameCalculator()
										, new ManGameCalculator()};
		
		KidsGameCalculator calculator = new KidsGameCalculator();
		calculator.hesapla();
		calculator.gameOver();
	}

}

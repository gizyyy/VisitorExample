
public class Puzzle implements Product {
	public int price = 1;

	@Override
	public void scan(Cashier calculator) {
		calculator.calculate(this);
	}
}

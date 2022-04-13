
public class Magazine implements Product {
	public int price = 2;

	@Override
	public void scan(Cashier calculator) {
		calculator.calculate(this);
	}
}

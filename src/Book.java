
public class Book implements Product {
	public int price = 3;

	@Override
	public void scan(Cashier calculator) {
		calculator.calculate(this);
	}
}

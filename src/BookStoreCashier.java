
public class BookStoreCashier implements Cashier {

	private int totalCart = 0;

	@Override
	public void calculate(Book b) {
		setTotalCart(getTotalCart() + b.price);
	}

	@Override
	public void calculate(Magazine m) {
		setTotalCart(getTotalCart() + m.price);
	}

	@Override
	public void calculate(Puzzle p) {
		setTotalCart(getTotalCart() + p.price);
	}

	public int getTotalCart() {
		return totalCart;
	}

	public void setTotalCart(int totalCart) {
		this.totalCart = totalCart;
	}

}


interface Cashier {
	void calculate(Book b);

	void calculate(Magazine m);

	void calculate(Puzzle p);

	public int getTotalCart();

	public void setTotalCart(int total);
}

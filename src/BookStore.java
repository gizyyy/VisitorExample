import java.util.ArrayList;

public class BookStore {
	public static int calculateCart(ArrayList<Product> items) {
		// create a visitor
		Cashier cashier = new BookStoreCashier();
		// iterate through all items
		for (Product item : items) {
			item.scan(cashier);
		}
		return cashier.getTotalCart();
	}

	public static void main(String args[]) {
		ArrayList<Product> items = new ArrayList<Product>();
		items.add(new Book());
		items.add(new Magazine());
		items.add(new Puzzle());
		int calculateCart = calculateCart(items);
		System.out.println(calculateCart);
	}

}

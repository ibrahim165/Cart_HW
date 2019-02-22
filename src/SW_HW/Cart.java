package SW_HW;

import java.util.ArrayList;
import SW_HW.Book;

public class Cart {

	
public ArrayList<Book> cart = new ArrayList();
	
	public int getCount() {
		return cart.size();
	}
	
	public void addBook(Book book) {
		this.cart.add(book);
	}
	
	public double getPrice() {
		double price = 0;
		for(int i = 0; i < cart.size(); i++) {
			price += cart.get(i).getPrice();
		}
		return price;
	}
	
}

package SW_HW;

import org.junit.Test;

import org.junit.Assert;
//import org.junit.jupiter.api.Test;

public class CartTest {


	@Test
	public void EmptyCartTest() {
		Cart cart = new Cart();
		Assert.assertEquals(0, cart.getCount());
	}
	
	@Test
	public void One_CartTest() {
		Cart cart = new Cart();
		Book book = new Book("Java Book", 127.0);
		cart.addBook(book);
		Assert.assertEquals(1, cart.getCount());
		Assert.assertEquals(127.0, cart.getPrice(), 127.0);
	}
	
	@Test
	public void Many_CartTest() {
		Cart cart = new Cart();
		Book book = new Book("Java Book", 127.0);
		Book book1 = new Book("Web design Book", 100.0);
		cart.addBook(book);
		cart.addBook(book1);
		Assert.assertEquals(2, cart.getCount());
		Assert.assertEquals(227.0, cart.getPrice(), 227.0);
	}
	
	
}

package SW_HW;

public class Book {

	public String name;
	public double price;
	
	Book(String n, double p) {
		name = n;
		price = p;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public String getName() {
		return this.name;
	}
}

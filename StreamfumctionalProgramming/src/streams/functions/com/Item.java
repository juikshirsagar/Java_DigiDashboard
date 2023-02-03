package streams.functions.com;

public class Item {

	private String name;
	private int price;
	private double calrories;
	public Item(String name, int price, double calrories) {
		super();
		this.name = name;
		this.price = price;
		this.calrories = calrories;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getCalrories() {
		return calrories;
	}
	public void setCalrories(double calrories) {
		this.calrories = calrories;
	}
	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + ", calrories=" + calrories + "]";
	}
	
}

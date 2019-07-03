package model;

public class Product {

	String name;
	int upc;
	double price;
	double priceWithTax;
	double discountPrice;

	public Product(String name, int upc, double price) {
		super();
		this.name = name;
		this.upc = upc;
		this.price = price;
		this.priceWithTax = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUpc() {
		return upc;
	}

	public void setUpc(int upc) {
		this.upc = upc;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public double getPriceWithTax() {
		return this.priceWithTax;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", upc=" + upc + ", price=" + price + "$" + ", priceWithTax="+ priceWithTax + "$"+ ", discountPrice="+ discountPrice + "$" + "]";
	}
	
	public void addTaxPercent(double tax) {
		priceWithTax = price + ((tax/100) * price);
	}
	
	public void addDiscountPercent(double discount) {
		discountPrice = priceWithTax - ((discount/100) * priceWithTax);
	}

}

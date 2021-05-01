package oopIntro;

public class Product {
	
	int id;
	String name;
	double unitPrice;
	String detail;
	
	public Product()
	{
		System.out.println("constructor metodu");
	}
	
	public Product(int id, String name, double unitPrice, String detail)
	{
		this();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", unitPrice=" + unitPrice + ", detail=" + detail + "]";
	}
	
}

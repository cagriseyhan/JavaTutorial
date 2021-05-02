package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product();
		
		product.setName("Laptop");
		product.setId(1);
		product.setPrice(4000);
		product.setStockAmount(4);
		product.setDescription("Asus Laptop");
		
		System.out.println(product.getName() + " - " + product.getKod());
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);
	}

}

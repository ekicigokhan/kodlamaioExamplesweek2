
public class Main {

	public static void main(String[] args) {
		Product product = new Product(1, "Laptop", "Asus Laptop", 5000, 2, "G�m�� Gri");
//		product.setName("Laptop");
//		product.setId(1);
//		product.setDescription("ASUS Laptop");
//		product.setPrice(5000);
//		product.setStockamount(3);

		ProductManager productManager = new ProductManager();
		productManager.Add(product);

		System.out.println(product.getCode());

	}

}

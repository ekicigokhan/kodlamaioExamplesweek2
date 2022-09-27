
public class Product { // �R�N

	public Product(int id, String name, String description, double price, int stockAmount, String colour) {

		System.out.println("Consructors �al��t�.");

		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price; // PARAMETREDEN GELEN
		this.stockamount = stockAmount;
		this.colour = colour;
	}

	public Product() {

	}

	// attribute || field bunlar;
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockamount;
	private String colour;
	private String code;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockamount() {
		return stockamount;
	}

	public void setStockamount(int stockamount) {
		this.stockamount = stockamount;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getCode() { // SADECE GETTER VAR KULLANICININ YAZMASI ENGELLEND�
		return this.name.substring(0, 1) + id;
	}

}

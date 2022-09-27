package oop1;

//Classlar PascalCase'dir.
// name, unitPrice vs. filed dýr.
public class Product {
	private String name;
	private double unitPrice; // Birim Fiyatý
	private double discount; // indirim
	private String imageUrl; // Array þeklinde de tanýmlanabilir.
	private int unitsInStock;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	// private : Sadece bulunduðu class için kullanýlarbilir demek.

}

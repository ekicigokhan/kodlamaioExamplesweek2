package oop1;

//Classlar PascalCase'dir.
// name, unitPrice vs. filed d�r.
public class Product {
	private String name;
	private double unitPrice; // Birim Fiyat�
	private double discount; // indirim
	private String imageUrl; // Array �eklinde de tan�mlanabilir.
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

	// private : Sadece bulundu�u class i�in kullan�larbilir demek.

}

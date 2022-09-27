package oop1;

// OOP : Nesne güdümlü programlama.
// get iþlemi -okuma-
// System.out.println(product.name);
// set -deðer atama-
public class Main {

	public static void main(String[] args) {

//		Product product = new Product();
//		product.setName("Delonghi Kahve Makinasý");
//		product.setUnitsInStock(4);
//		product.setDiscount(7);
//		product.setUnitPrice(7500);
//		product.setImageUrl("Delonghi.jpg");
//
//		Product product2 = new Product();
//		product2.setName("Bosch Kahve Makinasý");
//		product2.setUnitsInStock(4);
//		product2.setDiscount(7);
//		product2.setUnitPrice(7500);
//		product2.setImageUrl("Bosch.jpg");
//
//		Product product3 = new Product();
//		product3.setName("Kitchen Aid Kahve Makinasý");
//		product3.setUnitsInStock(4);
//		product3.setDiscount(7);
//		product3.setUnitPrice(7500);
//		product3.setImageUrl("Kitchen Aid.jpg");
//
//		Product[] products = { product, product2, product3 };
//		for (Product productstravel : products) {
//			System.out.println(productstravel.getName()+" Fiyat : >>> "+  productstravel.getUnitPrice()+" TL.");
//		}
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhoneNumber("5489523666");
		individualCustomer.setCustomerNumber("123456");
		individualCustomer.setFirstName("Gökhan");
		individualCustomer.setLastName("EKÝCÝ");
		
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setPhoneNumber("5498763252");
		corporateCustomer.setCustomerNumber("654321");
		corporateCustomer.setCompanyName("KODLAMAÝO");
		corporateCustomer.setTaxNumber("1234567891011");
		
		Customer[] customers = {individualCustomer,corporateCustomer};
		
		
		
		
	}

}

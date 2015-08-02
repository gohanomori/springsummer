
public class Bike {
	String brand;
	String country;
	int price;

	Bike(){}

	Bike(String brand,int price){
		this.brand = brand;
		this.price = price;
	}

	Bike(String brand,int price,String country){
		this.brand = brand;
		this.price = price;
		this.country = country;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	void showInfo(){
		System.out.println("Brand Name:" + this.brand);
		System.out.println("Price:" + this.price);
		System.out.println("Country:" + this.country);
	}
}

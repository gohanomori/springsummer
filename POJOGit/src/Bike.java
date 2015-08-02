
public class Bike {
	String brand;
	String country;
	int price;
	String color;

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
	
	Bike(String brand,int price,String country,String color){
		this(brand,price,country);
		this.color = color;
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
		System.out.println("Color:" + this.color);
	}
}


public class Bike {
	String brand;
	int price;

	Bike(){}

	Bike(String brand,int price){
		this.brand = brand;
		this.price = price;
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
		System.out.println("Brand Name" + this.brand);
		System.out.println("Price:" + this.price);
	}
}

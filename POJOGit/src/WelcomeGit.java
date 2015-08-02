
public class WelcomeGit {
	public static void main(String[] args){
		System.out.println("Created File by Eclipse!!");

		Bike bike = new Bike("Honda",2000);
		bike.showInfo();

		System.out.println("----------------------");
		Bike bike2 = new Bike("Honda",5000,"Japan");
		bike2.showInfo();
		
		System.out.println("----------------------");
		Bike bike3 = new Bike("Honda",5000,"Japan","Red");
		bike3.showInfo();
	}
}

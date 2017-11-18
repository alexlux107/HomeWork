package HW1;

public class Main {

	public static void main(String[] args) {
		Cat alisa = new Cat(5, 3.1, "Alisa", "Green", "Gray");
		System.out.println(alisa.toString());
		alisa.helloKiti();
		alisa.eat();
		System.out.println("Alisa\'s weight after eat: " + alisa.getWeight());
		System.out.println();
		
		Cat asia = new Cat(3, 2.8, "Asia", "Brown", "Black");
		System.out.println(asia.toString());
		asia.helloKiti();
		asia.eat();
		System.out.println("Asia\'s weight after eat: " + asia.getWeight());
		asia.eat();
		System.out.println("Asia\'s weight after eat: " + asia.getWeight());
		asia.eat();
		System.out.println("Asia\'s weight after eat: " + asia.getWeight());

	}

}

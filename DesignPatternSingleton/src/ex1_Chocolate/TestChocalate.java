package ex1_Chocolate;

public class TestChocalate {
	public static void main(String[] args) {

		ChocolateBoiler boiler = ChocolateBoiler.getInstance();
		System.out.println(boiler.isEmpty());
		boiler.fill();
		boiler.boil();
		boiler.drain();
//		ChocolateBoiler b2 = ChocolateBoiler.getInstance();
//		b2.fill();
		System.out.println(boiler.isEmpty());

		ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
		System.out.println(boiler2.isEmpty());
//		boiler.fill();
	}
}

package Abstraction;

public class Main {
	public static void main(String [] args) {
		
		Cat objCat = new Cat();
		Mouse objMouse = new Mouse();
		
		objCat.printName("Tom",3);
		objCat.eat();
		objCat.move();
		objCat.voice();
		
		System.out.println("====================================");
		
		objMouse.printName("Jerry",2);
		objMouse.eat();
		objMouse.move();
		objMouse.voice();
		
	}

}

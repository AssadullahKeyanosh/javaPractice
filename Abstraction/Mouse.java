package Abstraction;

public class Mouse extends Animal{

	@Override
	public void eat() {
		System.out.println(name+" eating...");
		
	}

	@Override
	public void move() {
		System.out.println(name+" Mouse moving...");
		
	}

	@Override
	public void voice() {
		System.out.println(name+" is "+age+" years old and it's Voice is So sos...");
		
	}

	
	
	

}

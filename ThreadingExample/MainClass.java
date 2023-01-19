package ThreadingExample;

public class MainClass {
	public static void main(String[] args) {
	threadOne t1 = new threadOne();
	threadOne t2 = new threadOne();
	t1.start();
	t2.start();
	
//	t1.run();
//	t2.run();
	}
}

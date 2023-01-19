package Learning;

public class staticMethodVsNoneStaticMethod {
	
	public static void myMethod1() {
		System.out.println("Static method");
	}
	
	public void mySecondMethod() {
		System.out.println("none static method");
	}
	public static void main(String[] args) {
		// calling a static method;
		myMethod1();
		
		// when calling a non-static method you have to first create its object
		staticMethodVsNoneStaticMethod a = new staticMethodVsNoneStaticMethod();
		a.mySecondMethod();
		
	}

}

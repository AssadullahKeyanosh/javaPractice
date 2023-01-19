package Learning;

public class staticMethodVsNoneStaticMethod {
	
	public static void myMethod1() {
		System.out.println("Static method");
	}
	
	public void mySecondMethod() {
		System.out.println("none static method");
	}
	public static void main(String[] args) {
		myMethod1();// calling a static method;
		
		staticMethodVsNoneStaticMethod a = new staticMethodVsNoneStaticMethod();// when calling a non-static method you have to first create its object
		a.mySecondMethod();
		
	}

}

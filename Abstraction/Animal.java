package Abstraction;

/*==ABSTRACT CLASS==
 BOTH STRUCTURE IS CORRECT.  
 public abstract class Animal{}
 abstract public class Animal{}
 */
 public abstract class Animal {
	
	String name;
	int age;
	
/*	==ABSTRACT METHODS==
 BOTH STRUCTURE IS CORRECT.
 public abstract void methodName();
 abstract public void methodName();
 ABSTRACT METHODS DOES NOT HAVE BODY
 */
	 public abstract void eat();
	 public abstract void move();
	 public abstract void voice();
	 
	 
/*	==NONE ABSTRACT METHODS==
 An abstract class also can have regular methods
 */
	  void printName(String N,int a) {
		 this.name=N;
		 this.age=a;
		 System.out.println(this.name);
	 }

}

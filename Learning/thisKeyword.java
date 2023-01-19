package Learning;

public class thisKeyword {
	
	int x;// class attribute (x)
	
	thisKeyword(int x){
		this.x=x;
/*	
 * The this keyword refers to the current object in a method or constructor.
  	
  The most common use of the this keyword is to eliminate the 
   confusion between class attributes and parameters with the
   same name (because a class attribute is shadowed by a method or constructor parameter).
   If you omit the keyword in the example above, the output would be "0" instead of "5".
*/
	}
	
	public static void main(String[] args) {
		thisKeyword myObj = new thisKeyword(7);
		System.out.println("Value of x = "+myObj.x);
		
	}

}

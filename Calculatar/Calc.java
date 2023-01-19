package Calculatar;
import java.util.Scanner;

public class Calc {
	

	public static void main(String args []) {
		int checkout;
	do {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("PLEASE ENTER YOUR FIRST NUMBER");
		String num1 = obj.nextLine();
		
		
		System.out.println("PLEASE ENTER YOUR SECOND NUMBER");
		String num2 = obj.nextLine();
		
		int result=Integer.parseInt(num1)+Integer.parseInt(num2);
		
		System.out.println(num1+"+"+num2+"="+result);
		
		System.out.println("do you want to sum again? Y/N");
		String YesNo= obj.nextLine();
		if(YesNo.equalsIgnoreCase("Y")) {
			checkout=1;
		}else {
			checkout=0;
			 System.out.println("You exited from the programm,"
			 		+ "\n if you want to continue run again the programm");
		}
		
}while(1==checkout);

   }
}



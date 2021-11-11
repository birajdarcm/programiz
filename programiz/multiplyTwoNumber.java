package programiz;

import java.util.Scanner;

public class multiplyTwoNumber {
	public static void main(String[] args) {
		Scanner number1=new Scanner(System.in);
		System.out.println("Enter First Number");
		float n1=number1.nextFloat();
		
		Scanner number2=new Scanner(System.in);
		System.out.println("Enter First Number");
		float n2=number2.nextFloat();
		
		float prod=n1*n2;
		
		System.out.println("Product Of Two Numbers is "+prod);
		
		
	}

}

package programiz;

import java.util.Scanner;

public class addTwoInteger {
	public static void main(String[] args) {
		Scanner number1= new Scanner(System.in);
		System.out.println("Enter first number");
		int n1=number1.nextInt();
		Scanner number2= new Scanner(System.in);
		System.out.println("Enter first number");
		int n2=number2.nextInt();
		
		int sum=0;
		
//		sum=n1+n2;
		
		System.out.println("Sum of given numbers is "+(n1+n2));
	}
}

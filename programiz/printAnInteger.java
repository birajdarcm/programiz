package programiz;

import java.util.Scanner;

// Java Program to Print an Integer (Entered by the User)
public class printAnInteger {
	public static void main(String[] args) {
		Scanner cm=new Scanner(System.in);
		System.out.println("Enter a Number");
		int number=cm.nextInt();
		
		System.out.println("Entered Number is " + number);
	}
}

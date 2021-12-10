package ScannerClass;

import java.util.Scanner;

public class OddityNumberBeforeString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("enter your age: ");
		int age = input.nextInt();
		// when nextInt() or nextDouble() followed by nextLine()
		// the program does not read this code (input.nextLine())
		// and the solution is code consumer String between them
		input.nextLine();    // this code is solution
		System.out.print("enter your name: ");
		String name = input.nextLine();
		
		System.out.print("enter your age2: ");
		int age2 = input.nextInt();
	
		input.close();

	}

}

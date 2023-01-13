package MyPackage;
import java.util.Scanner;

/**
 * For this Java practice assignment, we will just have you program in the main method of your program.  
 * 
 * There are the six mini-programs we want you to code.  All of the code you write should be in the main method of the HelloWorld 
 * class in the “HelloWorld.java” file.
 * 
 * The main method has been defined for you, but without the code. See the comments for each mini-program for instructions on what 
 * each part is supposed to do and how to write the code. It should be clear enough.  In some cases, we have provided hints to help 
 * you get started.
 *  
 * Note: DO NOT skip any of the mini-programs or the automated testing will fail.
*/
public class HelloWorld {
	
	public static void main(String[] args) {

		/*
		 * First test your program by printing "Hello World!".
		 */
		
		System.out.println("Hello, World!");
		System.out.println("");
		System.out.println("----------");
		System.out.println("");
		
		
		/*
		 * Say Hello
		 * Gets input of full name (first name and last name, separated by a space).
		 * Prints "Hello, <full name>!".
		 * 
		 * Example(s): 
		 * - If input is Brandon Krakowsky, print: "Hello, Brandon Krakowsky!"
		 */
		
		//Scanner to be used for user input throughout the main method
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your full name:");
		String name = scanner.nextLine();
		System.out.println("Hello, "+ name);
		
		//TODO: Add your code here
		
		
		// Don't edit the following 3 println lines
		System.out.println("");
		System.out.println("----------");
		System.out.println("");
		
		/*
		 * Add Five Numbers
		 * Gets input of numbers (ints or doubles), and prints the sum (as a double) of all the numbers each time.
		 * 
		 * Example(s):
		 * - If input is 1, 2.4, 6, -1, and 0, print:
		 * Sum: 1.0
		 * Sum: 3.4
		 * Sum: 9.4
		 * Sum: 8.4
		 * Sum: 8.4
		 */
		
		//TODO: Add your code here
		System.out.println("Input Numbers:");
		
		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();
		double num3 = scanner.nextDouble();
		double num4 = scanner.nextDouble();
		double num5 = scanner.nextDouble();
		
		System.out.println("Sum: "+ num1);
		System.out.println("Sum: "+ (num1 + num2));
		System.out.println("Sum: "+ (num1 + num2 + num3));
		System.out.println("Sum: "+ (num1 + num2 + num3 + num4));
		System.out.println("Sum: "+ (num1 + num2 + num3 + num4 + num5));
			
		
		// Don't edit the following 3 println lines
		System.out.println("");
		System.out.println("----------");
		System.out.println("");
		
		
		/*
		 * Even or Odd
		 * Gets integer input and prints if it's even or odd.
		 * 
		 * Example(s):
		 * - If input is 5, print: "5 is odd"
		 * - If input is 4, print: "4 is even"
		 */
		
		//TODO: Add your code here
		System.out.println("Enter Number:");
		int number = scanner.nextInt();
		if(number % 2 == 0)
		{
			System.out.println(number + " is even");
		}
		else
		{
			System.out.println(number + " is odd");
		}
		
		
		// Don't edit the following 3 println lines
		System.out.println("");
		System.out.println("----------");
		System.out.println("");
		
		
		/*
		 * Prime or Composite
		 * Gets positive integer input and prints if it's prime, composite, or 1.
		 * 
		 * Example(s):
		 * - If input is 11, print: "11 is prime"
		 * - If input is 12, print: "12 is composite"
		 * - If input is 1, print: "1"
		 * 
		 * Note: You can test with prime numbers:
		 * 2, 3, 5, 7, 11, 13, 17, 19, 23,
		 * 29, 31, 37, 41, 43, 47, 53, 59,
		 * 61, 67, 71, 73, 79, 83, 89, 97,
		 * 101, 103, 107, 109, 113, 127,
		 * 131, 137, 139, 149, 151, 157,
		 * 163, 167, 173, 179, 181
		 */
		
		//TODO: Add your code here
		System.out.println("Enter Number:");
		int n = scanner.nextInt();
		int flag = 0;
		if(n==1)
		{
			System.out.println("1");
		}
		else {
			for(int i=2;i<n/2;i++)
			{
				
				if(n%i == 0)
				{
					flag = 1;
					break;
				}
			}
			if(flag == 1)
			{
				System.out.println(n + " is composite");
			}
			else
			{
				System.out.println(n + " is prime");
			}
		}
		
		
		
		// Don't edit the following 3 println lines
		System.out.println("");
		System.out.println("----------");
		System.out.println("");
		
		
		/*
		 * Convert Seconds to Time
		 * Gets input of some number of seconds (as an int) and converts it to hours:minutes:seconds.
		 * 
		 * If input seconds is 1432, print output in the format: 0:23:52
		 * If input seconds is 0, print output in the format: 0:0:0
		 * If input seconds is negative, print output in the format: -1:-1:-1  
		 */
		
		//TODO: Add your code here
		System.out.println("Enter Seconds:");
		int input = scanner.nextInt();
		if(input == 0)
		{
			System.out.println("0:0:0");
		}
		else if(input < 0 )
		{
			System.out.println("-1:-1:-1");
		}
		else
		{
			int S = input % 60;
	        int H = input / 60;
	        int M = H % 60;
	        H = H / 60;
	        System.out.println( H + ":" + M + ":" + S);
		}
		
		
		// Don't edit the following 3 println lines
		System.out.println("");
		System.out.println("----------");
		System.out.println("");
		
		
		/*
		 * Say Goodbye
		 * Prints "goodbye, <full name>!".
		 * 
		 * Example(s): 
		 * - If name input was Brandon Krakowsky, print: "Goodbye, Brandon Krakowsky!"
		 */
		
		//TODO: Add your code here
		System.out.println("Enter your full name:");
		String name1 = scanner.nextLine();
		System.out.println("Goodbye, "+ name1);

		
	}
}
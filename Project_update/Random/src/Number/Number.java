package Number;

import java.util.Random;
import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Random rand = new Random();
		// Obtain a number between [0-100] .
		int n = rand.nextInt(5);
		while (true) {
			
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the Number:");
			int number = input.nextInt();		
			
			if (n == number) 
			{
				System.out.println("Success");
				break;
			} 
			else if (n > number)
			{
				rand.nextInt(5);
				System.out.println(n);
				
			} 
			else if (n < number) 
			{
				rand.nextInt(5);
				System.out.println(n);
				
			}
		}

	}

}

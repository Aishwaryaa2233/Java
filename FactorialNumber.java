

import java.util.Scanner;

public class FactorialNumber {
	
	public static void main(String[] args) {
		cheakFactorial();
		
	}
	
	private static void cheakFactorial() {
		System.out.println("Please Enter a Number :- ");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int factorial=1;
		
		
		for (int i = number; i > 0; i--) {
            factorial = factorial * i;  
        }
		System.out.println(factorial);
		

	}
}
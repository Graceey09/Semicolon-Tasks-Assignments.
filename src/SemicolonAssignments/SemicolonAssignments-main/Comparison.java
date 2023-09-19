import java.util.Scanner;

public class Comparison {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number");
		int number = input.nextInt();
		
		int squareOfNumber = number*number;
		
		if ((number & squareOfNumber) > 100);
		System.out.printf("%d, %d > %d%n", number, squareOfNumber, 100);
		
		if ((number & squareOfNumber) == 100);
		System.out.printf("%d, %d == %d%n", number, squareOfNumber, 100);
		
		if ((number & squareOfNumber) != 100);
		System.out.printf("%d, %d != %d%n", number, squareOfNumber, 100);
	        
	        if ((number & squareOfNumber) < 100);
	        System.out.printf("%d, %d < %d%n", number, squareOfNumber, 100);
	        
	}
 }

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int firstNumber = input.nextInt();
		
	         System.out.print("Enter second number: ");
		int secondNumber = input.nextInt();
		
		int firstNumberSquare = firstNumber*firstNumber;
		System.out.printf("square of first number is: %d%n", firstNumberSquare);
		
		int secondNumberSquare = secondNumber*secondNumber;
		System.out.printf("square of second number is: %d%n", secondNumberSquare);
		
		int sumOfSquares = firstNumber + secondNumber;
		System.out.printf("sum of squares is: %d%n", sumOfSquares);
		
		int differenceOfSquares = firstNumber - secondNumber;
		System.out.printf("difference of numbers is: %d%n", differenceOfSquares);
		
     }
 }

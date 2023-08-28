import java.util.Scanner;

public class Arithmetic2 {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int firstNumber = input.nextInt();
		
	         System.out.print("Enter second number: ");
		int secondNumber = input.nextInt();
		
		System.out.print("Enter third number: ");
		int thirdNumber = input.nextInt();
		
		int sum = firstNumber + secondNumber + thirdNumber;
		System.out.printf("sum of number is: %d%n", sum);
		
		int average = firstNumber + secondNumber + thirdNumber/ 2;
		System.out.printf("average of number is: %d%n", average);
		
		int product = firstNumber*secondNumber*thirdNumber;
		System.out.printf("product of number is: %d%n", product);
		int largestNumber = firstNumber;
		if (secondNumber > firstNumber) {
largestNumber = secondNumber;
}

		if (thirdNumber > secondNumber) {
largestNumber = thirdNumber;
}

		System.out.printf("Largest number is: %d%n", largestNumber); 
		
		int smallestNumber = firstNumber;
		if (secondNumber < firstNumber) {
smallestNumber = secondNumber;
}

		if (thirdNumber < secondNumber) {
smallestNumber = thirdNumber;
}

System.out.printf("smallest number is: %d%n", smallestNumber);
		
	}
 } 
		

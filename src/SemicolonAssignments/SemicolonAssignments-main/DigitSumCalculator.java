 import java.util.Scanner;

public class DigitSumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer between 0 and 1000: ");
        int number = scanner.nextInt();

        int digitSum = calculateDigitSum(number);
        System.out.println("The sum of the digits is: " + digitSum);

        scanner.close();
    }

    public static int calculateDigitSum(int number) {
        int sum = 0;

        // Extract each digit and add it to the sum
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        return sum;
    }
}


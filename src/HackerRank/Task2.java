package HackerRank;

import java.util.Scanner;

public class Task2 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        if (number % 2 != 0) {
            System.out.println("Weird");
        }
        if (number %2 == 0 && number > 1 && number <= 5){
            System.out.println("Not Weird");
        } else if (number %2 == 0 && number >= 6 && number <= 20) {
            System.out.println("Weird");
        } else if (number > 20) {
            System.out.println("Not Weird");
        }

    }
}
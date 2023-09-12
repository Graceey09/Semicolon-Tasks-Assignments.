package JavaWorks;

import java.util.Scanner;

public class SumOfEvenIndex {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int counter = 1;
        int evenNumber = 0;

        for (counter=1; counter < 11; counter++) {
            System.out.print("Enter score ");
            int score = input.nextInt();
            if (counter % 2 == 0) {
                evenNumber = evenNumber + score;


            }
        }
        System.out.println("The sum of the even index is : " + evenNumber);
    }
}

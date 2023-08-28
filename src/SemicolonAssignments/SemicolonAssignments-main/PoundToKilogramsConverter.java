import java.util.Scanner;

public class PoundToKilogramsConverter{
   public static void main(String[] args) {
   	Scanner input = new Scanner(System.in);
   
     System.out.print("Enter weight in pounds: ");
     double weight = input.nextDouble();
     double weightInKilograms = weight * 0.454;
     
     System.out.println(weightInKilograms);
     
          
     }
   }

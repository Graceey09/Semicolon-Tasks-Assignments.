import java.util.Scanner;

public class BMI{
   
    public static void main(String[] args){
   	Scanner input = new Scanner(System.in);
   
       	System.out.println("Enter weight in pounds: ");
       	double weightInPounds = input.nextDouble();
       	
       
       	System.out.println("Enter height in inches: ");
       	double heightInInches = input.nextDouble(); 
       	
       	double weightInKilograms = weightInPounds * 0.45359237;
       	double heightCentemeters = heightInInches * 0.0254;
       
       	double BMI = weightInKilograms / (heightCentemeters * heightCentemeters);
       	System.out.printf("%4f", BMI);
       
        
     }
        
 }

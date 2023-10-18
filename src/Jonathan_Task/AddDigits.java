package Jonathan_Task;

public class AddDigits {
    public static void main(String[] args) {
        int digit = sumDigits(384);
        System.out.println(digit);
        
    }
    
    public static int sumDigits(int number){
        while (number >= 10) {
            int sum = 0;
            while (number > 0){
                sum += number % 10;
                number/= 10;
            }
            number = sum;
        }
        return number;
    }
}

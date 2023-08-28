import java.util.Scanner;
public class MinutesToYearsDays {
        public static void main(String[] args) {
   
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the number of minutes: ");
            int minutes = input.nextInt();
            int minutesPerDay = 24 * 60;
            int minutesPerYear = minutesPerDay * 365;
            int years = minutes / minutesPerYear;
            int remainingMinutes = minutes % minutesPerYear;
            int days = remainingMinutes / minutesPerDay;
            System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
           // input.close();
        }
}

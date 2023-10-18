package ClassWork;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class MenstrualTrackerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menstrual Tracking App");

        System.out.print("Enter the date of your last menstrual period (yyyy-MM-dd): ");
        String cycleDate = scanner.nextLine();

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date lmpDate = dateFormat.parse(cycleDate);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(lmpDate);

            System.out.print("Enter the length of your menstrual cycle (in days): ");
            int cycleLength = Integer.parseInt(scanner.nextLine());

            int ovulationDay = (cycleLength - 14) + calendar.get(Calendar.DAY_OF_MONTH);
            calendar.set(Calendar.DAY_OF_MONTH, ovulationDay);
            Date ovulationDate = calendar.getTime();

            int safePeriodStartDay = calendar.get(Calendar.DAY_OF_MONTH) + 1;
            int safePeriodEndDay = calendar.get(Calendar.DAY_OF_MONTH) + (cycleLength - 18);
            calendar.set(Calendar.DAY_OF_MONTH, safePeriodEndDay);
            Date safePeriodEndDate = calendar.getTime();

            int fertilityWindowStartDay = calendar.get(Calendar.DAY_OF_MONTH) + 1;
            int fertilityWindowEndDay = ovulationDay - 1;
            calendar.set(Calendar.DAY_OF_MONTH, fertilityWindowEndDay);
            Date fertilityWindowEndDate = calendar.getTime();

            System.out.println("\nResults:");
            System.out.println("Menstrual Cycle Length: " + cycleLength + " days");
            System.out.println("Ovulation Date: " + dateFormat.format(ovulationDate));
            System.out.println("Safe Period: " + dateFormat.format(ovulationDate) + " to " + dateFormat.format(safePeriodEndDate));
            System.out.println("Fertility Window: " + dateFormat.format(fertilityWindowEndDate) + " to " + dateFormat.format(ovulationDate));
        } catch (Exception e) {
            System.err.println("Invalid date format or input. Please enter dates in the format yyyy-MM-dd.");
        }
    }
}

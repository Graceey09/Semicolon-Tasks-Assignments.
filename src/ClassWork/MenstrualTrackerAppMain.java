package ClassWork;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class MenstrualTrackerAppMain {

    public static void main(String[] args) {
        String lmpDateString = JOptionPane.showInputDialog("Enter the date of your last menstrual period (yyyy-MM-dd):");

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date lmpDate = dateFormat.parse(lmpDateString);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(lmpDate);

            String cycleLengthString = JOptionPane.showInputDialog("Enter the length of your menstrual cycle (in days):");
            int cycleLength = Integer.parseInt(cycleLengthString);

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

            SimpleDateFormat outputDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String message = "Menstrual Cycle Length: " + cycleLength + " days\n" +
                    "Ovulation Date: " + outputDateFormat.format(ovulationDate) + "\n" +
                    "Safe Period: " + outputDateFormat.format(ovulationDate) + " to " + outputDateFormat.format(safePeriodEndDate) + "\n" +
                    "Fertility Window: " + outputDateFormat.format(fertilityWindowEndDate) + " to " + outputDateFormat.format(ovulationDate);
            JOptionPane.showMessageDialog(null, message, "Results", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid date format or input. Please enter dates and cycle length in the correct format.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

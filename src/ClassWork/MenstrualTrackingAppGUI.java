package ClassWork;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class MenstrualCycle {
    private Date lastMenstrualPeriod;

    MenstrualCycle(Date lastMenstrualPeriod) {
        this.lastMenstrualPeriod = lastMenstrualPeriod;
    }

    Date getLastMenstrualPeriod() {
        return lastMenstrualPeriod;
    }
}

class OvulationCalculator {
    Date calculateOvulationDate(MenstrualCycle menstrualCycle) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(menstrualCycle.getLastMenstrualPeriod());
        calendar.add(java.util.Calendar.DAY_OF_MONTH, 14); // Ovulation occurs around the 14th day of the menstrual cycle
        return calendar.getTime();
    }
}

class FertilityCalculator {
    Date calculateFertilityStartDate(Date ovulationDate) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(ovulationDate);
        calendar.add(java.util.Calendar.DAY_OF_MONTH, -6); // Fertility window starts 6 days before ovulation
        return calendar.getTime();
    }

    Date calculateFertilityEndDate(Date ovulationDate) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(ovulationDate);
        calendar.add(java.util.Calendar.DAY_OF_MONTH, 5); // Fertility window ends 5 days after ovulation
        return calendar.getTime();
    }
}

class SafePeriodCalculator {
    Date calculateSafePeriodStartDate(Date ovulationDate) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(ovulationDate);
        calendar.add(java.util.Calendar.DAY_OF_MONTH, 6); // Safe period starts 6 days after ovulation
        return calendar.getTime();
    }

    Date calculateSafePeriodEndDate(MenstrualCycle menstrualCycle) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(menstrualCycle.getLastMenstrualPeriod());
        return calendar.getTime();
    }
}

public class MenstrualTrackingAppGUI {
    private JFrame frame;
    private JTextField lmpTextField;
    private JTextField cycleLengthTextField;

    public MenstrualTrackingAppGUI() {
        frame = new JFrame("Menstrual Tracking App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel lmpLabel = new JLabel("Last Menstrual Period (yyyy-MM-dd):");
        lmpLabel.setBounds(20, 30, 200, 25);
        panel.add(lmpLabel);

        lmpTextField = new JTextField();
        lmpTextField.setBounds(240, 30, 120, 25);
        panel.add(lmpTextField);

        JLabel cycleLengthLabel = new JLabel("Menstrual Cycle Length (in days):");
        cycleLengthLabel.setBounds(20, 60, 200, 25);
        panel.add(cycleLengthLabel);

        cycleLengthTextField = new JTextField();
        cycleLengthTextField.setBounds(240, 60, 50, 25);
        panel.add(cycleLengthTextField);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.setBounds(150, 100, 100, 25);
        panel.add(calculateButton);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    Date lastMenstrualPeriod = dateFormat.parse(lmpTextField.getText());
                    int cycleLength = Integer.parseInt(cycleLengthTextField.getText());

                    MenstrualCycle menstrualCycle = new MenstrualCycle(lastMenstrualPeriod);
                    OvulationCalculator ovulationCalculator = new OvulationCalculator();
                    FertilityCalculator fertilityCalculator = new FertilityCalculator();
                    SafePeriodCalculator safePeriodCalculator = new SafePeriodCalculator();

                    Date ovulationDate = ovulationCalculator.calculateOvulationDate(menstrualCycle);
                    Date fertilityStartDate = fertilityCalculator.calculateFertilityStartDate(ovulationDate);
                    Date fertilityEndDate = fertilityCalculator.calculateFertilityEndDate(ovulationDate);
                    Date safePeriodStartDate = safePeriodCalculator.calculateSafePeriodStartDate(ovulationDate);
                    Date safePeriodEndDate = safePeriodCalculator.calculateSafePeriodEndDate(menstrualCycle);

                    String resultMessage = "Ovulation Date: " + dateFormat.format(ovulationDate) + "\n" +
                            "Fertility Window: " + dateFormat.format(fertilityStartDate) + " to " + dateFormat.format(fertilityEndDate) + "\n" +
                            "Safe Period: " + dateFormat.format(safePeriodStartDate) + " to " + dateFormat.format(safePeriodEndDate);

                    JOptionPane.showMessageDialog(null, resultMessage, "Results", JOptionPane.INFORMATION_MESSAGE);
                } catch (ParseException | NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter dates and cycle length in the correct format.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MenstrualTrackingAppGUI();
            }
        });
    }
}

package ClassWork;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MenstrualTrackingAppTest {

    private MenstrualCycle menstrualCycle;

    @BeforeEach
    void setUp() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date lastMenstrualPeriod = dateFormat.parse("2023-01-01");
        menstrualCycle = new MenstrualCycle(lastMenstrualPeriod);
    }

    @Test
    void testOvulationCalculator() {
        OvulationCalculator ovulationCalculator = new OvulationCalculator();
        Date ovulationDate = ovulationCalculator.calculateOvulationDate(menstrualCycle);

        assertNotNull(ovulationDate);
    }

    @Test
    void testFertilityCalculator() {
        OvulationCalculator ovulationCalculator = new OvulationCalculator();
        Date ovulationDate = ovulationCalculator.calculateOvulationDate(menstrualCycle);

        FertilityCalculator fertilityCalculator = new FertilityCalculator();
        Date fertilityStartDate = fertilityCalculator.calculateFertilityStartDate(ovulationDate);
        Date fertilityEndDate = fertilityCalculator.calculateFertilityEndDate(ovulationDate);

        assertNotNull(fertilityStartDate);
        assertNotNull(fertilityEndDate);
        assertEquals(fertilityStartDate.before(fertilityEndDate), true);
    }

    @Test
    void testSafePeriodCalculator() {
        OvulationCalculator ovulationCalculator = new OvulationCalculator();
        Date ovulationDate = ovulationCalculator.calculateOvulationDate(menstrualCycle);

        SafePeriodCalculator safePeriodCalculator = new SafePeriodCalculator();
        Date safePeriodStartDate = safePeriodCalculator.calculateSafePeriodStartDate(ovulationDate);
        Date safePeriodEndDate = safePeriodCalculator.calculateSafePeriodEndDate(menstrualCycle);

        assertNotNull(safePeriodStartDate);
        assertNotNull(safePeriodEndDate);
        assertEquals(safePeriodStartDate.before(safePeriodEndDate), false);
    }
}

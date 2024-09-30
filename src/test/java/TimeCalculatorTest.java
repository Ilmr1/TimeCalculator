import org.junit.Test;
import static org.junit.Assert.*;

public class TimeCalculatorTest {

    @Test
    public void testCalculateTime() {
        TimeCalculator calculator = new TimeCalculator();
        assertEquals(2.0, calculator.calculateTime(100, 50), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateTimeWithZeroSpeed() {
        TimeCalculator calculator = new TimeCalculator();
        calculator.calculateTime(100, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateTimeWithNegativeSpeed() {
        TimeCalculator calculator = new TimeCalculator();
        calculator.calculateTime(100, -10);
    }
}
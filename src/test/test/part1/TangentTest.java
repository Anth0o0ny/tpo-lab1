package part1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class TangentTest {
    private TangentCalc tangentCalc = new TangentCalc();

    @ParameterizedTest
    @DisplayName("Check Bernoulli values")
    @CsvSource({"0, 1", "1, -0.5", "2, 0.1667", "4, -0.0333"})
    public void testBernoulliValue(int input, double expected) {
        double actual = tangentCalc.calculateBernoulli(input);
        assertEquals(expected, actual, 0.002);
    }

    @ParameterizedTest
    @DisplayName("Check factorials")
    @CsvSource({"0, 1", "1, 1", "2, 2", "4, 24"})
    public void testFactorialValue(int input, int expected) {
        double actual = tangentCalc.getFactorial(input);
        assertEquals(expected, actual, 0.002);
    }

    @ParameterizedTest
    @DisplayName("Check Taylor tangent series")
    @CsvSource({"0, 0", "1, 1.5425", "-1, -1.5425", "1.5, 5.4003", "-1.5, -5.4003", "1.6, 7.3149", "-1.6, -7.3149"})
    public void testTaylorValue(double input, double expected) {
        double actual = tangentCalc.getTgSeries(input, 5);
        assertEquals(expected, actual, 0.002);
    }


}

package calculator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class PrimeFactorsCalculatorTest {

    private final PrimeFactorsCalculator calc = new PrimeFactorsCalculator();
    private final ArrayList<Integer> integers = new ArrayList<>();

    @Test
    public void should_get_2_for_2() throws Exception {
        Collections.addAll(integers, 2);
        assertThat(calc.primeFactors(2), equalTo(integers));
    }

    @Test
    public void should_get_3_for_3() throws Exception {
        Collections.addAll(integers, 3);
        assertThat(calc.primeFactors(3), equalTo(integers));
    }

    @Test
    public void should_get_3_for_9() throws Exception {
        Collections.addAll(integers, 3);
        assertThat(calc.primeFactors(9), equalTo(integers));
    }

    @Test
    public void should_get_2_for_8() throws Exception {
        Collections.addAll(integers, 2);
        assertThat(calc.primeFactors(8), equalTo(integers));
    }

    @Test
    public void should_get_2_3_for_6() throws Exception {
        Collections.addAll(integers, 2, 3);
        assertThat(calc.primeFactors(6), equalTo(integers));
    }

    @Test
    public void should_get_3_5_for_45() throws Exception {
        Collections.addAll(integers, 3, 5);
        assertThat(calc.primeFactors(45), equalTo(integers));
    }
}

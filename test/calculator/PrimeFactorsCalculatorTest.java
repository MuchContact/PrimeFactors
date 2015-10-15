package calculator;

import org.hamcrest.collection.IsArray;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PrimeFactorsCalculatorTest {

    private final PrimeFactorsCalculator calc = new PrimeFactorsCalculator();

    @Test
    public void should_get_2_for_2() throws Exception {
        assertThat(calc.primeFactors(2),equalTo(new int[]{2}));
    }

    @Test
    public void should_get_3_for_3() throws Exception {
        assertThat(calc.primeFactors(3),equalTo(new int[]{3}));
    }

}

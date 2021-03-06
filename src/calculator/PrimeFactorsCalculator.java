package calculator;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorsCalculator {
    public List<Integer> primeFactors(int number) {
        final ArrayList<Integer> result = new ArrayList<>();
        for (int i = 2; i <= number; i++) {
            if (isPrime(i) && number % i == 0) {
                result.add(i);
                while (number % i == 0) {
                    number = number / i;
                }
            }
        }
        return result;
    }

    private boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

package primeconcern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumbers {

	/**
	 * Returns a list of all prime numbers that are less than or equal to <code>n</code>.
	 * 
	 * @param n
	 * @return a list of all prime numbers that are less than or equal to <code>n</code>
	 * @throws IllegalArgumentException if <code>n < 2</code>
	 */
	public static List<Integer> primeNumbers(int n) {
		if (n >= 2) {
			boolean[] primes = new boolean[n];
			List<Integer> result = new ArrayList<>();
			Arrays.fill(primes, true);
			int stop = ((int) Math.sqrt(n)) - 1;
			for (int i = 1; i <= stop; i++) {
				if (primes[i]) {
					int prime = i + 1;
					result.add(prime);
					for (int j = ((int) Math.pow(prime, 2)) - 1; j < primes.length; j += prime) {
						primes[j] = false;
					}
				}
			}
			for (int i = stop + 1; i < primes.length; i++) {
				if (primes[i]) {
					result.add(i + 1);
				}
			}
			return result;
		} else {
			throw new IllegalArgumentException("n must be greater than 1: " + n);
		}
	}
}

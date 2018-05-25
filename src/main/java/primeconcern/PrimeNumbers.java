package primeconcern;

import java.util.Arrays;

public class PrimeNumbers {

	/**
	 * Returns an array of all prime numbers that are less than or equal to <code>n</code>.
	 * 
	 * @param n
	 * @return an array of all prime numbers that are less than or equal to <code>n</code>
	 * @throws IllegalArgumentException if <code>n < 2</code>
	 */
	public static int[] primeNumbers(int n) {
		if (n >= 2) {
			boolean[] primes = new boolean[n];
			Arrays.fill(primes, true);
			int stop = ((int) Math.sqrt(n)) - 1;
			for (int i = 1; i <= stop; i++) {
				if (primes[i]) {
					int prime = i + 1;
					for (int j = ((int) Math.pow(prime, 2)) - 1; j < primes.length; j += prime) {
						primes[j] = false;
					}
				}
			}
			int primesCount = 0;
			for (int i = 1; i < primes.length; i++) {
				if (primes[i]) {
					primesCount++;
				}
			}
			int[] result = new int[primesCount];
			int resultIdx = 0;
			for (int i = 1; i < primes.length; i++) {
				if (primes[i]) {
					result[resultIdx] = i + 1;
					resultIdx++;
				}
			}
			return result;
		} else {
			throw new IllegalArgumentException("n must be greater than 1: " + n);
		}
	}
}

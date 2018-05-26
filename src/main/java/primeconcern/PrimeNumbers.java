package primeconcern;

import java.util.BitSet;

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
			BitSet primes = new BitSet(n - 1);
			primes.flip(0, n - 1);
			int iStop = ((int) Math.sqrt(n)) - 2;
			for (int i = primes.nextSetBit(0); i >= 0 && i <= iStop; i = primes.nextSetBit(i + 1)) {
				int prime = i + 2;
				int jStop = Math.min(Integer.MAX_VALUE - prime, n) - 1;
				for (int j = ((int) Math.pow(prime, 2)) - 2; j < jStop; j += prime) {
					primes.clear(j);
				}
			}
			int primesCount = primes.cardinality();
			int[] result = new int[primesCount];
			int resultIdx = 0;
			for (int i = primes.nextSetBit(0); i >= 0; i = primes.nextSetBit(i + 1)) {
				result[resultIdx] = i + 2;
				resultIdx++;
			}
			return result;
		} else {
			throw new IllegalArgumentException("n must be greater than 1: " + n);
		}
	}
}

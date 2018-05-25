package primeconcern;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class PrimeNumbersTest {
	
	@Test
	public void primeNumbers_N_PrimeNumbersUpToN() {
		int[] expected = new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37,
				41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103,
				107, 109, 113};
		int[] actual = PrimeNumbers.primeNumbers(114);
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void primeNumbers_NNotPrime_Excluded() {
		int[] expected = new int[] {2, 3, 5, 7};
		int[] actual = PrimeNumbers.primeNumbers(10);
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void primeNumbers_NPrime_Included() {
		int[] expected = new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37,
				41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
		int[] actual = PrimeNumbers.primeNumbers(97);
		assertArrayEquals(expected, actual);
	}

	@Test
	public void primeNumbers_Two_Two() {
		int[] expected = new int[] {2};
		int[] actual = PrimeNumbers.primeNumbers(2);
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void primeNumbers_One_IllegalArgumentException() {
		assertThrows(IllegalArgumentException.class, () -> {
			PrimeNumbers.primeNumbers(1);
		});
	}
	
	@Test
	public void primeNumbers_NegativeNumber_IllegalArgumentException() {
		assertThrows(IllegalArgumentException.class, () -> {
			PrimeNumbers.primeNumbers(-1);
		});
	}
}

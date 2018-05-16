package primeconcern;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class PrimeNumbersTest {
	
	@Test
	public void primeNumbers_N_PrimeNumbersUpToN() {
		List<Integer> expected = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37,
				41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103,
				107, 109, 113);
		List<Integer> actual = PrimeNumbers.primeNumbers(114);
		assertEquals(expected, actual);
	}
	
	@Test
	public void primeNumbers_NNotPrime_Excluded() {
		List<Integer> expected = Arrays.asList(2, 3, 5, 7);
		List<Integer> actual = PrimeNumbers.primeNumbers(10);
		assertEquals(expected, actual);
	}
	
	@Test
	public void primeNumbers_NPrime_Included() {
		List<Integer> expected = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37,
				41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97);
		List<Integer> actual = PrimeNumbers.primeNumbers(97);
		assertEquals(expected, actual);
	}

	@Test
	public void primeNumbers_Two_Two() {
		List<Integer> expected = Arrays.asList(2);
		List<Integer> actual = PrimeNumbers.primeNumbers(2);
		assertEquals(expected, actual);
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

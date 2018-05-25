package primeconcern;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;

public class PrimeNumbersPerformanceTest {

	@Test
	public void primeNumbers_1B20_Calculated() {
		List<Integer> primeNumbers = PrimeNumbers.primeNumbers(1_048_576); // N = 2^20
		assertNotNull(primeNumbers);
	}
	
	@Test
	public void primeNumbers_1B24_Calculated() {
		List<Integer> primeNumbers = PrimeNumbers.primeNumbers(16_777_216); // N = 2^24
		assertNotNull(primeNumbers);
	}
	
	@Test
	public void primeNumbers_1B27_Calculated() {
		List<Integer> primeNumbers = PrimeNumbers.primeNumbers(134_217_728); // N = 2^27
		assertNotNull(primeNumbers);
	}
	
	@Test
	public void primeNumbers_1B30_Calculated() {
		List<Integer> primeNumbers = PrimeNumbers.primeNumbers(1_073_741_824); // N = 2^30
		assertNotNull(primeNumbers);
	}
	
	@Test
	public void primeNumbers_MaxInt_Calculated() {
		List<Integer> primeNumbers = PrimeNumbers.primeNumbers(Integer.MAX_VALUE); // N = 2^31 - 1 = 2,147,483,647
		assertNotNull(primeNumbers);
	}
}

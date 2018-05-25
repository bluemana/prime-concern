package primeconcern;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		if (args.length == 1) {
			int n = Integer.parseInt(args[0]);
			int[] result = PrimeNumbers.primeNumbers(n);
			System.out.println(Arrays.toString(result));
		} else {
			throw new IllegalArgumentException("Expected one argument, found " + args.length + " argument(s)");
		}
	}
}

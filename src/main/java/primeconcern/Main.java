package primeconcern;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		if (args.length == 1) {
			int n = Integer.parseInt(args[0]);
			List<Integer> result = PrimeNumbers.primeNumbers(n);
			System.out.println(result);
		} else {
			throw new IllegalArgumentException("Expected one argument, found " + args.length + " argument(s)");
		}
	}
}

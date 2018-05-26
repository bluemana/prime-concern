package primeconcern;

import java.io.FileWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws Exception {
		Map<String, String> argsMap = parseArgs(args);
		String nArg = argsMap.get("-n");
		int n = 0;
		try {
			n = Integer.parseInt(nArg);			
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("Missing argument: n", e);
		}
		String filePath = argsMap.get("-o");
		if (filePath == null || filePath.isEmpty()) {
			throw new IllegalArgumentException("Missing argument: o");
		}
		int[] result = PrimeNumbers.primeNumbers(n);
		try (Writer writer = new FileWriter(filePath, false)) {
			for (int i = 0; i < result.length; i++) {
				writer.write(result[i] + (i == result.length - 1 ? "\n" : ","));
			}
			writer.flush();
		}
	}
	
	private static Map<String, String> parseArgs(String[] args) {
		Map<String, String> result = new HashMap<>();
		for (String arg : args) {
			String[] tokens = arg.split("=");
			if (tokens.length == 2) {
				result.put(tokens[0], tokens[1]);
			} else {
				throw new IllegalArgumentException("Invalid argument: " + arg);
			}
		}
		return result;
	}
}

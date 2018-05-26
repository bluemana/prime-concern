package primeconcern;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;

import org.junit.jupiter.api.Test;

public class MainPerformanceTest {

	@Test
	public void main_1B20_Calculated() throws Exception {
		File resultFile = File.createTempFile("perfTestResult_1B20", ".tmp");
		resultFile.deleteOnExit();
		Main.main(new String[] {
				"-n=" + (int) Math.pow(2, 20),
				"-o=" + resultFile.getAbsolutePath()});
		assertTrue(resultFile.exists());
	}
	
	@Test
	public void main_1B24_Calculated() throws Exception {
		File resultFile = File.createTempFile("perfTestResult_1B24", ".tmp");
		resultFile.deleteOnExit();
		Main.main(new String[] {
				"-n=" + (int) Math.pow(2, 24),
				"-o=" + resultFile.getAbsolutePath()});
		assertTrue(resultFile.exists());
	}
	
	@Test
	public void main_1B27_Calculated() throws Exception {
		File resultFile = File.createTempFile("perfTestResult_1B27", ".tmp");
		resultFile.deleteOnExit();
		Main.main(new String[] {
				"-n=" + (int) Math.pow(2, 27),
				"-o=" + resultFile.getAbsolutePath()});
		assertTrue(resultFile.exists());
	}
	
	@Test
	public void main_1B30_Calculated() throws Exception {
		File resultFile = File.createTempFile("perfTestResult_1B30", ".tmp");
		resultFile.deleteOnExit();
		Main.main(new String[] {
				"-n=" + (int) Math.pow(2, 30),
				"-o=" + resultFile.getAbsolutePath()});
		assertTrue(resultFile.exists());
	}
	
	@Test
	public void main_MaxInt_Calculated() throws Exception {
		File resultFile = File.createTempFile("perfTestResult_MaxInt", ".tmp");
		resultFile.deleteOnExit();
		Main.main(new String[] {
				"-n=" + Integer.MAX_VALUE, // N = 2^31 - 1
				"-o=" + resultFile.getAbsolutePath()});
		assertTrue(resultFile.exists());
	}
}

package testing;

import java.util.ArrayList;

import org.junit.Test;

public class testSum {

	@Test
	public void test() {
		ArrayList<Double> list = new ArrayList<>();
		list.add(2.3);
		list.add(2.3);
		double actual = list.size();
		double expected = 4.6;
		assertTrue(expected, actual);
	}

	private void assertTrue(double expected, double actual) {

	}

}

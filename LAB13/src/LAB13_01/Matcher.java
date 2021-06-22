package LAB13_01;

public class Matcher {
	public Matcher() {
	}

	public boolean match(int[] expected, int[] actual, int clipLimit, int delta) {
		actual = match_clipLimit(actual, clipLimit);
		
		if(checkLength(expected, actual)) {
			return false;
		}

        return checkDelta(expected, actual, delta);
	}

	private int[] match_clipLimit(int[] actual, int clipLimit) {
		for (int i = 0; i < actual.length; i++)
			if (actual[i] > clipLimit)
				actual[i] = clipLimit;

		return actual;
	}

	private boolean checkLength(int[] expected, int[] actual) {
		if (actual.length != expected.length) {
			return true;
		}
		return false;
	}

	private boolean checkDelta(int[] expected, int[] actual, int delta) {
		for (int i = 0; i < actual.length; i++)
			if (Math.abs(expected[i] - actual[i]) > delta)
				return false;
		return true;
	}

}

package bookExercises;

public class Ex76methods {

	public boolean divisibleNumbers(int initialNumber, int finalNumber) {

		boolean divisible;

		if (finalNumber % initialNumber == 0) {

			divisible = true;
		}

		else {

			divisible = false;
		}

		return divisible;

	}
}

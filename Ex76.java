package bookExercises;

import javax.swing.JOptionPane;

public class Ex76 {

	public static void main(String[] args) {

		String userAnswer;

		boolean result;

		Ex76methods x = new Ex76methods();

		int initialNumber, finalNumber;

		do {

			initialNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Initial Number: "));

			finalNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Input final number"));

			if (initialNumber >= finalNumber) {

				JOptionPane.showMessageDialog(null, "Final number must be greater than initial number, try again!");
			}

			else {

				result = x.divisibleNumbers(initialNumber, finalNumber);

				JOptionPane.showMessageDialog(null, "Final number: " + finalNumber + " is divisible by initial number: "
						+ initialNumber + "\nAnswer: " + result);

			}

			userAnswer = JOptionPane.showInputDialog(null, "Do You Want To Continue? (yes/no)");

			userAnswer = userAnswer.trim();

		} while (userAnswer.equalsIgnoreCase("yes"));

		JOptionPane.showMessageDialog(null, "END OF APPLICATION!");

	}

}

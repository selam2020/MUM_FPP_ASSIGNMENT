package prog12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		double marks = 0.0;
		while (true) {
			System.out.println("\nEnter the Grade : ");
			try {
				Scanner in = new Scanner(System.in);
				marks = in.nextDouble();
				if (marks < 0 || marks > 100)
					throw new UnsupportedOperationException("Marks should be in the range of 0 to 100");
				else {
					System.out.println("Your score is : " + marks);
					break;
				}
			} catch (InputMismatchException | UnsupportedOperationException e) {
				System.out.println("\nTry again with correct Input");
				System.err.print(e);
			}
		}
	}
}
